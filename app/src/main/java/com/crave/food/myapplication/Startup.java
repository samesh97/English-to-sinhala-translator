package com.crave.food.myapplication;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.util.Log;
import android.widget.Toast;

public class Startup extends BroadcastReceiver
{

    private static final String TAG = "Startup";

    @Override
    public void onReceive(Context context, Intent intent)
    {
        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O)
        {
            context.startForegroundService(new Intent(context,MyService.class));
        }
        else
        {
            context.startService(new Intent(context,MyService.class));
        }

    }
}
