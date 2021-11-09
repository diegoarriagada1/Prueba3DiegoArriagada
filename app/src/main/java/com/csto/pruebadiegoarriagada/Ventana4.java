package com.csto.pruebadiegoarriagada;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Ventana4 extends AppCompatActivity {
    Button c;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana4);
        c = (Button) findViewById(R.id.entrar3);

        c.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent I = new Intent(getApplicationContext(),Satelite3.class);
                startActivity(I);




            }
        });

    }
}