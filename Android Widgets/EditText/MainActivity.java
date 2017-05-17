package com.fsw_android.codigomaestro;

//Aquí van las librerias que necesito para la aplicación//
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
{
    //Declaración de las variables a usar.//
    EditText editText;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        editText = (EditText) findViewById(R.id.ideTxt);
        editText.addTextChangedListener(new TextWatcher()
        {
            @Override public void beforeTextChanged(CharSequence charSequence, int i, int i1, int i2) { }
            @Override public void onTextChanged(CharSequence charSequence, int i, int i1, int i2)
            {
                String s = editText.getText().toString();
                Toast.makeText(MainActivity.this,s, Toast.LENGTH_SHORT).show();
            }
            @Override public void afterTextChanged(Editable editable)
            {

            }
        });
    } //Final del primer proceso del ciclo de vida de Android, "OnCreate"//

} //Fin de la clase Main Activity//
