package com.example.colors;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;

public class MainActivity extends AppCompatActivity {

    LinearLayout btn_1;
    LinearLayout btn_2;
    LinearLayout btn_3;

    int cont_btn_1=1;
    int cont_btn_2=1;
    int cont_btn_3=1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_1=(LinearLayout)findViewById(R.id.btn_1);
        btn_2=(LinearLayout)findViewById(R.id.btn_2);
        btn_3=(LinearLayout)findViewById(R.id.btn_3);

        btn_1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cont_btn_1==0){
                    btn_1.setBackgroundColor(getResources().getColor(R.color.first_btn));
                    cont_btn_1=1;
                }
                else if(cont_btn_1==1){
                    btn_1.setBackgroundColor(getResources().getColor(R.color.first_btn2));
                    cont_btn_1=2;
                }
                else if(cont_btn_1==2){
                    btn_1.setBackgroundColor(getResources().getColor(R.color.first_btn3));
                    cont_btn_1=3;
                }
                else if(cont_btn_1==3){
                    btn_1.setBackgroundColor(getResources().getColor(R.color.first_btn4));
                    cont_btn_1=4;
                }
                else if(cont_btn_1==4){
                    btn_1.setBackgroundColor(getResources().getColor(R.color.first_btn5));
                    cont_btn_1=5;
                }
                else if(cont_btn_1==5){
                    btn_1.setBackgroundColor(getResources().getColor(R.color.first_btn6));
                    cont_btn_1=0;
                }
            }
        });

        btn_2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cont_btn_2==0){
                    btn_2.setBackgroundColor(getResources().getColor(R.color.second_btn));
                    cont_btn_2=1;
                }
                else if(cont_btn_2==1){
                    btn_2.setBackgroundColor(getResources().getColor(R.color.second_btn2));
                    cont_btn_2=2;
                }
                else if(cont_btn_2==2){
                    btn_2.setBackgroundColor(getResources().getColor(R.color.second_btn3));
                    cont_btn_2=3;
                }
                else if(cont_btn_2==3){
                    btn_2.setBackgroundColor(getResources().getColor(R.color.second_btn4));
                    cont_btn_2=4;
                }
                else if(cont_btn_2==4){
                    btn_2.setBackgroundColor(getResources().getColor(R.color.second_btn5));
                    cont_btn_2=5;
                }
                else if(cont_btn_2==5){
                    btn_2.setBackgroundColor(getResources().getColor(R.color.second_btn6));
                    cont_btn_2=0;
                }
            }
        });

        btn_3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(cont_btn_3==0){
                    btn_3.setBackgroundColor(getResources().getColor(R.color.third_btn));
                    cont_btn_3=1;
                }
                else if(cont_btn_3==1){
                    btn_3.setBackgroundColor(getResources().getColor(R.color.third_btn2));
                    cont_btn_3=2;
                }
                else if(cont_btn_3==2){
                    btn_3.setBackgroundColor(getResources().getColor(R.color.third_btn3));
                    cont_btn_3=3;
                }
                else if(cont_btn_3==3){
                    btn_3.setBackgroundColor(getResources().getColor(R.color.third_btn4));
                    cont_btn_3=4;
                }
                else if(cont_btn_3==4){
                    btn_3.setBackgroundColor(getResources().getColor(R.color.third_btn5));
                    cont_btn_3=5;
                }
                else if(cont_btn_3==5){
                    btn_3.setBackgroundColor(getResources().getColor(R.color.third_btn6));
                    cont_btn_3=0;
                }
            }
        });

    }
}
