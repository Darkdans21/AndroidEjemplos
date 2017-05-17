 import android.support.v7.app.AppCompatActivity; import android.os.Bundle; import android.view.View; import package com.fsw_android.codigomaestro;

//Aquí van las librerias que necesito para la aplicación//
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;


public class MainActivity extends AppCompatActivity
{
    //Declaración de las variables a usar.//
    Button btn;
    ProgressBar pgBar;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn = (Button) findViewById(R.id.button);
        pgBar= (ProgressBar) findViewById(R.id.idProgressBar);

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
                Thread thread = new Thread()
                {
                    @Override public void run()
                    {
                        super.run();
                        for (int i=0;i<=100;)
                        {
                            try
                            { //Delay of one second by sleep(1000)
                                sleep(1000);
                            }
                            catch (InterruptedException e)
                            {
                                e.printStackTrace();
                            }
                            // Updating ProgressBar
                            pgBar.setProgress(i);
                            i=i+10;
                        }
                    }
                };
                thread.start();
            }
        });
    } //Final del primer proceso del ciclo de vida de Android, "OnCreate"//

} //Fin de la clase Main Activity//
