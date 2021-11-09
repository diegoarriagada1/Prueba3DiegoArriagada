package com.csto.pruebadiegoarriagada;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ventana2 extends AppCompatActivity {
    Button e;
    Button v;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana2);
        e = (Button) findViewById(R.id.entrar3);
        v = (Button) findViewById(R.id.volver);
        e.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent I = new Intent(getApplicationContext(),Satelite.class);
                startActivity(I);




            }
        });
        v.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent I = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(I);




            }
        });
    }
}