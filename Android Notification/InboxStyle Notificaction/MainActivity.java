package com.fsw_android.codigomaestro;

//Aquí van las librerias que necesito para la aplicación//
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
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
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //set intents and pending intents to call activity on click of "show activity" action button of notification//
                Intent resultIntent = new Intent(getApplicationContext(), MainActivity.class);
                resultIntent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK | Intent.FLAG_ACTIVITY_CLEAR_TASK);
                PendingIntent piResult = PendingIntent.getActivity(getApplicationContext(),
                        (int) Calendar.getInstance().getTimeInMillis(), resultIntent, 0);
                //Assign inbox style notification//
                NotificationCompat.InboxStyle inboxStyle = new NotificationCompat.InboxStyle();
                inboxStyle.setBigContentTitle("Inbox Notification");
                inboxStyle.addLine("Message 1.");
                inboxStyle.addLine("Message 2.");
                inboxStyle.addLine("Message 3.");
                inboxStyle.addLine("Message 4.");
                inboxStyle.addLine("Message 5.");
                inboxStyle.setSummaryText("+2 more");
                //build notification//
                NotificationCompat.Builder mBuilder = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                        .setSmallIcon(R.mipmap.ic_launcher).setContentTitle("Inbox style notification")
                        .setContentText("This is test of inbox style notification.").setStyle(inboxStyle)
                        .addAction(R.mipmap.ic_launcher, "show activity", piResult);
                // Gets an instance of the NotificationManager service//
                NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
                //to post your notification to the notification bar//
                notificationManager.notify(0, mBuilder.build());
            }
        });

    }
}