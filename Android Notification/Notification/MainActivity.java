package com.fsw_android.codigomaestro;

//Aquí van las librerias que necesito para la aplicación//

import android.app.NotificationManager;
import android.content.Context;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.app.NotificationCompat;
import android.view.View;
import android.widget.Button;

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
                //build notification
                NotificationCompat.Builder mBuilder = (NotificationCompat.Builder)
                        new NotificationCompat.Builder(getApplicationContext()) .setSmallIcon(R.mipmap.ic_launcher)
                        .setContentTitle("Simple notification") .setContentText("This is test of simple notification.");
                // Gets an instance of the NotificationManager service //
                NotificationManager notificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
                // to post your notification to the notification bar //
                notificationManager.notify(0, mBuilder.build());
            }
        });
    }
}