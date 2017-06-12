package com.fsw_android.codigomaestro;

//Aquí van las librerias que necesito para la aplicación//
import android.app.NotificationManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
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
        btn.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v)
            {
                //To set large icon in notification //
                Bitmap icon1 = BitmapFactory.decodeResource(getResources(), R.mipmap.ic_launcher);
                // Assign BigText style notification//
                NotificationCompat.BigTextStyle bigText = new NotificationCompat.BigTextStyle();
                bigText.bigText("Lorem Ipsum is simply dummy text of the printing and typesetting industry. +" +
                        "Lorem Ipsum has been the industry's standard dummy text ever since the 1500s, +" +
                        " when an unknown printer took a galley of type and scrambled it to make a type specimen book. +" +
                        "It has survived not only five centuries, but also the leap into electronic typesetting, +" +
                        " remaining essentially unchanged. It was popularised in the 1960s with the release of Letraset sheets containing Lorem Ipsum passages, +" +
                        " and more recently with desktop publishing software like Aldus PageMaker including versions of Lorem Ipsum.");
                bigText.setBigContentTitle("Big Text Notification");
                bigText.setSummaryText("By: Author of Lorem ipsum");
                //build notification //
                NotificationCompat.Builder mBuilder = (NotificationCompat.Builder) new NotificationCompat.Builder(getApplicationContext())
                        .setSmallIcon(R.mipmap.ic_launcher).setContentTitle("Big Text notification")
                        .setContentText("This is test of big text style notification.")
                        .setLargeIcon(icon1).setStyle(bigText);
                // Gets an instance of the NotificationManager service //
                NotificationManager mNotificationManager = (NotificationManager) getSystemService(Context.NOTIFICATION_SERVICE);
                // to post your notification to the notification bar //
                mNotificationManager.notify(0, mBuilder.build());
            }
        });
    }
}