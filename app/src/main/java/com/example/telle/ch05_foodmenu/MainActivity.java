package com.example.telle.ch05_foodmenu;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.TextView;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void takeOrder(View v){
        CheckBox chk;
        String msg="";//存放要显示在书面上的文字讯息
        int total = 0;
        int[] id={R.id.chk1, R.id.chk2, R.id.chk3, R.id.chk4};//用阵列存放所有CheckBox物件的ID
        int[] price={50,30,35,25};


        for(int i=0; i<id.length; i++){//以回圈来逐一检查各CheckBox是否被选取

            chk = (CheckBox) findViewById(id[i]);

            if(chk.isChecked()) {//若有被选取
                msg += "\n" + chk.getText();//将换行字元以及选项文字附加到msg字串后面
                total += price[i];
            }
        }
        if(msg.length()>0)//如果有点餐则字串长度大于0
            msg ="Your order is :"+msg;
        else
            msg ="Order plz";

        String A = new String();
        A = "Price: "+total;

        //在文字方块中显示已经点选的项目
        ((TextView) findViewById(R.id.showOrder)).setText(msg);
        ((TextView) findViewById(R.id.Total)).setText(A);

    }
}

