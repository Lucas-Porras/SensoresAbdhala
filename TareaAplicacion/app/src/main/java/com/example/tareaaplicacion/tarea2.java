package com.example.tareaaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class tarea2 extends AppCompatActivity {
    private TextView titulo;
    private Button botonsito;
    private Button url;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tarea2);
        titulo = (TextView) findViewById(R.id.id_titulo);
        botonsito = (Button) findViewById(R.id.id_boton);
        url = (Button) findViewById(R.id.boton_url);

        botonsito.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //titulo.setText("Hola");
                Intent segundo = new Intent(getApplicationContext(), MainActivity.class);
                if(getIntent().resolveActivity(getPackageManager()) != null){
                    startActivity(segundo);
                }
            }
        });

        url.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent web = new Intent(Intent.ACTION_VIEW);
                web.setData(Uri.parse("https://www.youtube.com/"));
                startActivity(web);
            }
        });
    }
}