package com.example.tareaaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Seccion2 extends AppCompatActivity {
    private Button volver;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seccion2);
        volver = (Button) findViewById(R.id.btn_volver);

        volver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent volver = new Intent(getApplicationContext(), Principal.class);
                if(getIntent().resolveActivity(getPackageManager()) != null) {
                    startActivity(volver);
                }
            }
        });
    }
}