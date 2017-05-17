package com.fsw_android.codigomaestro;

//Aquí van las librerias que necesito para la aplicación//
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {
    AutoCompleteTextView autoCompleteTextView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String [] texts={"Arjun","Ankit","Anuradha",
                "Amreen","Abhishek","Arvind","Amit",
                "Bharat","Chaitanya", "Chitra","Darshan",
                "Darsheel","Deven","Faizal","Fayyaz","Ganesh",
                "Girish","Heena","Hemant","Irfan","Jagdish",
                "Jeel", "Kaushik","Kapil","Keshav","Manish",
                "Mayuri","Manali","Nikita","Pramod","Pratik",
                "Puja","Ravi","Raj","Reshma"};
        autoCompleteTextView= (AutoCompleteTextView) findViewById(R.id.idAutoCompTextView);
        ArrayAdapter adapter = new ArrayAdapter(this,android.R.layout.simple_list_item_1,texts);
        autoCompleteTextView.setAdapter(adapter);

    } //Final del primer proceso del ciclo de vida de Android, "OnCreate"//


} //Fin de la clase Main Activity//