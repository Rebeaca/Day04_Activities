package com.example.user.day04_activities;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.user.day04_activities.utils.Contants;

public class MainActivity extends AppCompatActivity {
private Button next,yinshi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        next=(Button)findViewById(R.id.button);
        yinshi=(Button)findViewById(R.id.button3);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent();
                intent.putExtra(Contants.KEY_NAME,"你好漂亮");
                intent.setClass(MainActivity.this,Main2Activity.class);
                startActivity(intent);

            }
        });
        yinshi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent();
               // intent.putExtra(Contants.KEY_NAME,"你好漂亮");
              //  intent.setClass(MainActivity.this,Main2Activity.class);
                //调用系统的
                intent.setAction(Intent.ACTION_CALL);
                intent.setData(Uri.parse("tel:15732612163"));
               // intent.setAction(Intent.ACTION_DIAL);
                startActivity(intent);

            }
        });

    }
}
