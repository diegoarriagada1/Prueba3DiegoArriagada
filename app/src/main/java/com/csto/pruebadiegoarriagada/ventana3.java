package com.csto.pruebadiegoarriagada;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class ventana3 extends AppCompatActivity {
    Button t;
    Button v2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ventana3);
        t = (Button) findViewById(R.id.entrar3);
        v2 = (Button) findViewById(R.id.volver2);
        t.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent I = new Intent(getApplicationContext(),Satelite2.class);
                startActivity(I);




            }
        });
        v2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent I = new Intent(getApplicationContext(),MainActivity.class);
                startActivity(I);




            }
        });
    }
}