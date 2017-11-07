package com.iris.bmi;

import android.content.SharedPreferences;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    View.OnClickListener listener = new View.OnClickListener() {//新增Onclick類別
        @Override
        public void onClick(View view) {

        }
    };//要分號
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //getResources().getString(R.string.app_name);//得字串
        Button btHelp = (Button)findViewById(R.id.b_help);//匿名類別
        btHelp.setOnClickListener(listener);
    }
    public void bmi(View view){
    //    System.out.println("what??????");
        Log.d("MainActivity","testing bmi method");
        EditText edWeight = (EditText) findViewById(R.id.ed_weight);//(
        EditText edHeight = (EditText) findViewById(R.id.ed_height);
        float weight = Float.parseFloat(edWeight.getText().toString());
        float height = Float.parseFloat(edHeight.getText().toString());
        float bmi = weight/(height*height);
        Log.d("MainActivity","calculate bmi");//
        new AlertDialog.Builder(this)
                .setMessage(getString(R.string.your_bmi_is)+bmi)//有加int不能直接R
                .setPositiveButton(R.string.ok,null)
                .setTitle(R.string.my_title)//可支援字串和int可直接R
                .show();
    }
}
