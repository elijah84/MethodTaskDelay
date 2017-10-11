package com.example.home.methodtaskdelay;

import android.graphics.Color;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {

    Handler handler;
    Runnable runnable;
    Button button;
    TextView textview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        button = (Button)findViewById(R.id.button1);

        textview = (TextView)findViewById(R.id.textView1);

        handler = new Handler();

        button.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                // TODO Auto-generated method stub

                runnable = new Runnable() {

                    @Override
                    public void run() {

                        //Perform any task here which you want to do after time finish.

                        textview.setText(" TextView Text Color Change ");

                        textview.setTextColor(Color.BLUE);
                    }
                };
                handler.postDelayed(runnable, 7000);

            }
        });
    }
}