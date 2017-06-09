package com.fsw_android.codigomaestro;

//Aquí van las librerias que necesito para la aplicación//
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;



public class MainActivity extends AppCompatActivity
{
    //Declaración de las variables a usar.//

EditText editText1; Button button1;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

editText1=(EditText)findViewById(R.id.editText1); button1=(Button)findViewById(R.id.button1); button1.setOnClickListener(new View.OnClickListener() { @Override public void onClick(View arg0) { String message=editText1.getText().toString(); Intent intent=new Intent(); intent.putExtra("MESSAGE",message); setResult(2,intent); finish();//finishing activity } }); } @Override public boolean onCreateOptionsMenu(Menu menu) { // Inflate the menu; this adds items to the action bar if it is present. getMenuInflater().inflate(R.menu.main, menu); return true; 

    }//Final del primer proceso del ciclo de vida de Android, "On Create"//
} //Fin de la clase Main Activity//
