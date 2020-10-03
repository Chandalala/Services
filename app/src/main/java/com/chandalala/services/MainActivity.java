package com.chandalala.services;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    /*
    * A service is a process that can run in the background and does not interfere with the UI
    * A service does not have an interface
    * Do not forget to register the service in the manifest file
    *
    */

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        startService(new Intent(this, MyIntentService.class));
    }

    public void goToBacon(View view) {
        startActivity(new Intent(this, BaconActivity.class));
    }
}
