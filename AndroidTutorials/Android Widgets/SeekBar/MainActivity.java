 package com.fsw_android.codigomaestro;

//Aquí van las librerias que necesito para la aplicación//
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.SeekBar;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity
{
    //Declaración de las variables a usar.//
    SeekBar seekBar;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        seekBar = (SeekBar) findViewById(R.id.idseekBar);
        seekBar.setOnSeekBarChangeListener(new SeekBar.OnSeekBarChangeListener()
        {
            @Override
            public void onProgressChanged(SeekBar seekBar, int i, boolean b)
            {
                Toast.makeText(getApplicationContext(),"SeekBar Progress: "+ i,Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStartTrackingTouch(SeekBar seekBar)
            {
                Toast.makeText(getApplicationContext(),"SeekBar Touch Started",Toast.LENGTH_SHORT).show();
            }

            @Override
            public void onStopTrackingTouch(SeekBar seekBar)
            {
                Toast.makeText(getApplicationContext(),"SeekBar Touch Stopped", Toast.LENGTH_SHORT).show();
            }
        });
    } //Final del primer proceso del ciclo de vida de Android, "OnCreate"//

} //Fin de la clase Main Activity//