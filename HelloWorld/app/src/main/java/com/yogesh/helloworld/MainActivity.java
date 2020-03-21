package com.yogesh.helloworld;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private Button countButton;
    private Button ToastButton;
    private TextView textView;
    private int count;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        countButton = findViewById(R.id.button);
        ToastButton = findViewById(R.id.button2);
        textView = findViewById(R.id.text);
//        countButton.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                count ++;
//                textView.setText(""+count);
//            }
//        });

    }

    public void count(View view) {
        count++;
        textView.setText(""+count);
    }
}
