package com.chandalala.services;

import android.app.Service;
import android.content.Intent;
import android.os.IBinder;
import android.util.Log;

public class MyService extends Service {

    // Generic service, you create another thread manually

    private static final String TAG = "com.chandalala.services";

    public MyService() {
    }

    @Override
    public IBinder onBind(Intent intent) {

        return null;

    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId) {

        Log.i(TAG, "onStartCommand method called");

        new Thread(){
            @Override
            public void run() {
                for (int i=0; i<5; i++){
                    long futureTime = System.currentTimeMillis() + 5_000;
                    while (System.currentTimeMillis() < futureTime){
                        synchronized (this){
                            try {
                                wait(futureTime - System.currentTimeMillis());
                                Log.i(TAG, "service is doing something");

                            }
                            catch (Exception e){

                            }
                        }
                    }
                }
            }
        }.start();

        return Service.START_STICKY;
    }

    @Override
    public void onDestroy() {

        Log.i(TAG, "onDestroy method called");

    }

}
