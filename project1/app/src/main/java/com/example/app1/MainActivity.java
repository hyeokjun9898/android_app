package com.example.app1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relation);


    Button b1 = (Button) findViewById(R.id.button1);
    b1.setText("코드에서도 변경 가능");

    Button b2 = (Button) findViewById(R.id.button2);
    b2.setEnabled(false);


    }
}