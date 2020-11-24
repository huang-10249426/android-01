package com.example.myapplication25;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void cehua2(View view){
        startActivity(new Intent(this,DrawerActivity.class));
    }

    public void cehua1(View view) {
        startActivity(new Intent(this,DrawerActivity.class));
    }
}