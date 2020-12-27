package com.example.mybiodata;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class spleshActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splesh);
        Handler hi = new Handler();
        hi.postDelayed(new Runnable() {
            @Override
            public void run() {
                startActivity(new Intent(spleshActivity.this,MainActivity.class));
                finish();

            }
        },2000);

        Toast.makeText(spleshActivity.this,"WELCOME",Toast.LENGTH_SHORT).show();
    }
}
