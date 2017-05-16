package com.fsw_android.codigomaestro;

//Aquí van las librerias que necesito para la aplicación//
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;

public class MainActivity extends AppCompatActivity {
    //Declaración de las variables a usar.//
    Button btn; CheckBox checkBox1,checkBox2,checkBox3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn = (Button) findViewById(R.id.button);
        checkBox1 = (CheckBox) findViewById(R.id.checkBox1);
        checkBox2 = (CheckBox) findViewById(R.id.checkBox2);
        checkBox3 = (CheckBox) findViewById(R.id.checkBox3);

      btn.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View view) {
              ClickMe(view);
          }
      });
}

    public void ClickMe(View v)
    {
        if (checkBox1.isChecked() == true &&checkBox2.isChecked() == true && checkBox3.isChecked() == true)
        {
             getWindow().getDecorView().setBackgroundColor(Color.parseColor("#FFFFFF"));
        }
        else if (checkBox1.isChecked() == true && checkBox2.isChecked() == true)
        {
            getWindow().getDecorView().setBackgroundColor(Color.parseColor("#FFFF00"));
         }
        else if (checkBox1.isChecked() == true && checkBox3.isChecked() == true)
        {
            getWindow().getDecorView().setBackgroundColor(Color.parseColor("#FF00FF"));
        }
        else if (checkBox2.isChecked() == true && checkBox3.isChecked() == true)
        {
            getWindow().getDecorView().setBackgroundColor(Color.parseColor("#00FFFF"));
        }
        else if (checkBox1.isChecked() == true)
        {
            getWindow().getDecorView().setBackgroundColor(Color.parseColor("#FF0000"));
        }
        else if (checkBox2.isChecked() == true)
        {
            getWindow().getDecorView().setBackgroundColor(Color.parseColor("#00FF00"));
        }
        else if (checkBox3.isChecked() == true)
        {
            getWindow().getDecorView().setBackgroundColor(Color.parseColor("#0000FF"));
        }
        else
        {
            getWindow().getDecorView().setBackgroundColor(Color.parseColor("#000000"));
        }

    } //Final del primer proceso del ciclo de vida de Android, "OnCreate"//


} //Fin de la clase Main Activity//

