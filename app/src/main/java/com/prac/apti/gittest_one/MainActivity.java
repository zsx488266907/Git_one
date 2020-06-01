package com.prac.apti.gittest_one;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //撒打算看到
      //  ..阿瑟东撒的阿瑟东

        Intent intent = new Intent();
        intent.setClass(MainActivity.this,HomeActivity.class);

    }
}
