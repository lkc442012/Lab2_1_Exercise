package com.example.user.lab2_1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {

    private TextView textViewMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textViewMessage = (TextView)findViewById(R.id.textViewMessage);

        Bundle extras = getIntent().getExtras();
        if(!extras.isEmpty()){
            String message = extras.getString(MainActivity.MSG_EXTRA);
            String name = extras.getString(MainActivity.NAME_EXTRA);
            String age = extras.getString(MainActivity.AGE_EXTRA);
            textViewMessage.setText("Hi, " + name + "\n" + "Your message is " + message + "\n" + "Your age is " + age);

        }
    }


}
