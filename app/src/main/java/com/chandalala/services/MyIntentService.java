package com.chandalala.services;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

public class MyIntentService extends IntentService {

    //Intent service puts another thread automatically
    private static final String TAG = "com.chandalala.services";

    /**
     * Creates an IntentService.  Invoked by your subclass's constructor.
     *
     * @param name Used to name the worker thread, important only for debugging.
     */
    public MyIntentService() {
        super("MyIntentService");
    }

    @Override
    protected void onHandleIntent(Intent intent) {

        // This is what the service does
        Log.i(TAG, "The service has now started");

    }

}
