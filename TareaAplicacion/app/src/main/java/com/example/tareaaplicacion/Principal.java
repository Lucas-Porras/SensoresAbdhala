package com.example.tareaaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Principal extends AppCompatActivity {
    private Button calculadora;
    private Button Seccion2;

    private Button sensor;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_principal);
        sensor = (Button) findViewById(R.id.btn_sensor);
        calculadora = (Button) findViewById(R.id.btn_calculadora);
        Seccion2 = (Button) findViewById(R.id.btn_seccion2);

        calculadora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent calculadoraa = new Intent(getApplicationContext(), MainActivity.class);
                if(getIntent().resolveActivity(getPackageManager()) != null){
                    startActivity(calculadoraa);
                }
            }
        });

        Seccion2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Seccionn2 = new Intent(getApplicationContext(), Seccion2.class);
                if(getIntent().resolveActivity(getPackageManager()) != null){
                    startActivity(Seccionn2);
                }
            }
        });

        sensor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent sensor = new Intent(getApplicationContext(), Sensor1.class);
                if(getIntent().resolveActivity(getPackageManager()) != null){
                    startActivity(sensor);
                }
            }
        });
    }
}