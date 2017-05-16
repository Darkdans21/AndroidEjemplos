package com.fsw_android.codigomaestro;

//Aquí van las librerias que necesito para la aplicación//
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity
{
    //Declaración de las variables a usar.//
    RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        radioGroup = (RadioGroup) findViewById(R.id.radioGroup);
        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener()
        {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                switch (i) {
                    case R.id.radioButton1Id:
                        getWindow().getDecorView().setBackgroundColor(Color.parseColor("#FF0000"));
                        break;

                    case R.id.radioButton2Id:
                        getWindow().getDecorView().setBackgroundColor(Color.parseColor("#FFFF00"));
                        break;

                    case R.id.radioButton3Id:
                        getWindow().getDecorView().setBackgroundColor(Color.parseColor("#FF00FF"));
                        break;
                    case R.id.radioButton4Id:
                        getWindow().getDecorView().setBackgroundColor(Color.parseColor("#00FFFF"));
                        break;
                }
            }
        });


    } //Final del primer proceso del ciclo de vida de Android, "OnCreate"//

} //Fin de la clase Main Activity//

