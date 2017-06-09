package com.fsw_android.codigomaestro;

//Aquí van las librerias que necesito para la aplicación//
import android.Manifest;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.support.v4.app.ActivityCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    //Declaración de las variables a usar.//
    Button btn;
    EditText numTxt;
    String sNum;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.idbtnCall);
        numTxt = (EditText) findViewById(R.id.idNumtxt);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(Intent.ACTION_CALL);
                sNum = numTxt.getText().toString();
                if(sNum.trim().isEmpty())
                {
                    i.setData(Uri.parse("tel:7788994455"));
                }
                else
                {
                    i.setData(Uri.parse("tel:"+sNum));
                }
                if (ActivityCompat.checkSelfPermission(MainActivity.this, Manifest.permission.CALL_PHONE) != PackageManager.PERMISSION_GRANTED)
                {
                    Toast.makeText(MainActivity.this,"Please grant the permission to call",Toast.LENGTH_SHORT).show();
                    requestPermission();
                }
                else
                {
                    startActivity(i);
                }
            }
        });


    }//Final del primer proceso del ciclo de vida de Android, "On Create"//


    private void requestPermission()
    {
        ActivityCompat.requestPermissions(this, new String[]{Manifest.permission.CALL_PHONE},1);

    }
    
} //Fin de la clase Main Activity//

