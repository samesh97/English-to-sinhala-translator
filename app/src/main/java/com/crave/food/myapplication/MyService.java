package com.crave.food.myapplication;

import android.app.NotificationChannel;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.app.TaskStackBuilder;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.IBinder;
import android.widget.Toast;

import androidx.annotation.Nullable;
import androidx.core.app.NotificationCompat;

public class MyService extends Service
{
    @Override
    public void onCreate()
    {
        super.onCreate();

        if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.O)
        {
            NotificationManager manager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
            NotificationChannel channel = new NotificationChannel("channel_0999","Hellochannel",NotificationManager.IMPORTANCE_HIGH);
            NotificationCompat.Builder builder = new NotificationCompat.Builder(getApplicationContext(),"channel_0999");
            manager.createNotificationChannel(channel);
            builder.setSmallIcon(R.drawable.ic_launcher);
            builder.setContentTitle("Running");
            builder.setContentText("Hello");

           // manager.notify(20,builder.build());

            startForeground(100,builder.build());


        }


        final ClipboardManager clipboard = (ClipboardManager) this.getSystemService(CLIPBOARD_SERVICE);
        clipboard.addPrimaryClipChangedListener(new ClipboardManager.OnPrimaryClipChangedListener() {
            public void onPrimaryClipChanged()
            {
                Toast.makeText(MyService.this, "Hi", Toast.LENGTH_SHORT).show();
                String a = "haloo";
                showNotification(getApplicationContext(),"Translate",ForAmmaTranslator.translateToSinhala(a).toString(),new Intent(getApplicationContext(),MainActivity.class));
            }
        });
    }

    @Override
    public void onDestroy() {
        super.onDestroy();
    }

//    @Override
//    public int onStartCommand(Intent intent, int flags, int startId)
//    {
//        return super.onStartCommand(intent, flags, startId);
//    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return null;
    }
    public void showNotification(Context context, String title, String body, Intent intent)
    {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);

        int notificationId = 1;
        String channelId = "channel-01";
        String channelName = "Channel Name";
        int importance = NotificationManager.IMPORTANCE_HIGH;

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            NotificationChannel mChannel = new NotificationChannel(
                    channelId, channelName, importance);
            notificationManager.createNotificationChannel(mChannel);
        }

        NotificationCompat.Builder mBuilder = new NotificationCompat.Builder(context, channelId)
                .setSmallIcon(R.mipmap.ic_launcher)
                .setContentTitle(title)
                .setContentText(body);

        TaskStackBuilder stackBuilder = TaskStackBuilder.create(context);
        stackBuilder.addNextIntent(intent);
        PendingIntent resultPendingIntent = stackBuilder.getPendingIntent(
                0,
                PendingIntent.FLAG_UPDATE_CURRENT
        );
        mBuilder.setContentIntent(resultPendingIntent);

        notificationManager.notify(notificationId, mBuilder.build());
    }
}
