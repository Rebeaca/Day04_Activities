package com.example.user.day04_activities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.example.user.day04_activities.utils.Contants;

public class Main2Activity extends AppCompatActivity {
private Button back;
private TextView show;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        back=(Button)findViewById(R.id.button2);
        show=(TextView)findViewById(R.id.textView3);
        Intent intent = getIntent();
        String s = intent.getStringExtra(Contants.KEY_NAME);
        show.setText(s);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                finish();

            }
        });

    }

}
