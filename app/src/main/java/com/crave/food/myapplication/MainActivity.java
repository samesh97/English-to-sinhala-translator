package com.crave.food.myapplication;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.TaskStackBuilder;
import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.provider.ContactsContract;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.NotificationCompat;


import br.com.goncalves.pugnotification.notification.PugNotification;
import ir.zadak.zadaknotify.notification.ZadakNotification;

public class MainActivity extends AppCompatActivity {


    private static final String TAG = "MainActivity";
    private EditText edit_query;
    private TextView text_view;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        edit_query = findViewById(R.id.edit_query);
        text_view = findViewById(R.id.text_view);

        edit_query.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after)
            {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count)
            {
                String text = ForAmmaTranslator.translateToSinhala(s.toString()).toString();
                text_view.setText(text);
            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O)
        {
            IntentFilter filter = new IntentFilter();
            filter.addAction(Intent.ACTION_BOOT_COMPLETED);
            registerReceiver(new BroadcastReceiver() {
                @Override
                public void onReceive(Context context, Intent intent) {
                    Toast.makeText(context, "Hello", Toast.LENGTH_SHORT).show();
                }
            }, filter);

            startForegroundService(new Intent(MainActivity.this,MyService.class));


        }
        else
        {
            startService(new Intent(MainActivity.this,MyService.class));
        }


    }
}