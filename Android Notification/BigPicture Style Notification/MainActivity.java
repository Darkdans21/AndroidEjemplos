package com.fsw_android.codigomaestro;

//Aquí van las librerias que necesito para la aplicación//
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.widget.Button;

import java.util.Calendar;

public class MainActivity extends AppCompatActivity {

    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.idBtn);
        btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                // Assign big picture notification//
                NotificationCompat.BigPictureStyle bigPictureStyle = new NotificationCompat.BigPictureStyle();
                bigPictureStyle.bigPicture( BitmapFactory.decodeResource(getResources(), R.drawable.kirby)).build();
                // Gets an instance of the NotificationManager service//
                NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
                // set intents and pending intents to call activity on click of "show activity" action button of notification//
                Intent resultIntent = new Intent(getApplicationContext(), MainActivity.class);
                resultIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                PendingIntent piResult = PendingIntent.getActivity(MainActivity.this, (int) Calendar.getInstance().getTimeInMillis(), resultIntent, 0);
                // build notification//
                NotificationCompat.Builder builder = (NotificationCompat.Builder) new NotificationCompat.Builder(MainActivity.this)
                .setSmallIcon(R.mipmap.ic_launcher) .setContentTitle("Big picture notification")
                .setContentText("This is test of big picture notification.") .setStyle(bigPictureStyle)
                .addAction(R.drawable.arrow, "show activity", piResult)
                .addAction(R.drawable.share, "Share", PendingIntent.getActivity(MainActivity.this, 0, getIntent(), 0, null));
                // to post your notification to the notification bar//
                notificationManager.notify(0, builder.build());


            }
        });
    }
}