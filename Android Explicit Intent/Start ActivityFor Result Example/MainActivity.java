package com.fsw_android.codigomaestro;

//Aquí van las librerias que necesito para la aplicación//
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;



public class MainActivity extends AppCompatActivity
{
    //Declaración de las variables a usar.//

TextView textView1; Button button1; 

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


 textView1=(TextView)findViewById(R.id.textView1); button1=(Button)findViewById(R.id.button1); button1.setOnClickListener(new View.OnClickListener() { @Override public void onClick(View arg0) { Intent intent=new Intent(getApplicationContext(),Example_StartActivityResult2.class); startActivityForResult(intent, 2);// Activity is started with requestCode 2 } }); } // Call Back method to get the Message form other Activity @Override protected void onActivityResult(int requestCode, int resultCode, Intent data) { super.onActivityResult(requestCode, resultCode, data); // check if the request code is same as what is passed here it is 2 if(requestCode==2) { String message=data.getStringExtra("MESSAGE"); textView1.setText(message); } } @Override public boolean onCreateOptionsMenu(Menu menu) { // Inflate the menu; this adds items to the action bar if it is present. getMenuInflater().inflate(R.menu.main, menu); return true;

    }//Final del primer proceso del ciclo de vida de Android, "On Create"//
} //Fin de la clase Main Activity//
