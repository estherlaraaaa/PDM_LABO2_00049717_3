package com.example.colors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    LinearLayout btn_1;
    LinearLayout btn_2;
    LinearLayout btn_3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_1 = findViewById(R.id.btn_1);
        btn_2 = findViewById(R.id.btn_2);
        btn_3 = findViewById(R.id.btn_3);

        btn_1.setOnClickListener(this);
        btn_2.setOnClickListener(this);
        btn_3.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int[] red = {R.color.first_btn, R.color.first_btn2, R.color.first_btn3, R.color.first_btn4, R.color.first_btn5, R.color.first_btn6};

        int[] green = {R.color.second_btn,R.color.second_btn2,R.color.second_btn3,R.color.second_btn4,R.color.second_btn5,R.color.second_btn6};

        int[] blue = {R.color.third_btn,R.color.third_btn2,R.color.third_btn3,R.color.third_btn4,R.color.third_btn5,R.color.third_btn6};

        int viewId = v.getId();

        Log.i("id ",viewId+"");

        switch (viewId){
            case R.id.btn_1:
                btn_1.setBackgroundResource(red[(int) Math.floor(Math.random()*6)]);
                break;
            case R.id.btn_2:
                btn_2.setBackgroundResource(green[(int) Math.floor(Math.random()*6)]);
                break;
            case R.id.btn_3:
                btn_3.setBackgroundResource(blue[(int) Math.floor(Math.random()*6)]);
                break;
        }
    }
}