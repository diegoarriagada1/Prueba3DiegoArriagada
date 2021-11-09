package com.csto.pruebadiegoarriagada;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    Spinner seleccion;
    Button b;

    ArrayList<String> valores= new ArrayList<>();
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        seleccion  = (Spinner) findViewById(R.id.lugar);
        //fechasa = (EditText) findViewById(R.id.txt_fechas);
        b = (Button) findViewById(R.id.button);
        valores.add(".....");
        valores.add("pelluhue");
        valores.add("torres del paine ");
        valores.add("cartajena");

        ArrayAdapter<String> adaptador = new ArrayAdapter<String>(getApplicationContext(),R.layout.support_simple_spinner_dropdown_item,valores);
        seleccion.setAdapter(adaptador);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(seleccion.getSelectedItem()=="pelluhue"){
                    Intent I = new Intent(getApplicationContext(),Ventana2.class);
                    startActivity(I);
                }
                if(seleccion.getSelectedItem()=="..."){
                    Toast.makeText(getApplicationContext(), "Debe seleccionar destino",Toast.LENGTH_LONG).show();
                }


            }
        });
    }
}