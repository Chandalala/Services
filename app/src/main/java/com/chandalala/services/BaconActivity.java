package com.chandalala.services;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class BaconActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bacon);
        startService(new Intent(BaconActivity.this, MyService.class));
    }

    public void goToApples(View view) {
        startActivity(new Intent(this, MainActivity.class));
    }
}
