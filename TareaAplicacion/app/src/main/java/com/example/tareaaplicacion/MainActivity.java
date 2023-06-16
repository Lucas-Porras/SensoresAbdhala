package com.example.tareaaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView resultado;
    EditText numero1, numero2;
    Button btn_sumar, btn_restar, btn_dividir, btn_multiplicar;
    private Button volver_calculadora;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        volver_calculadora = (Button) findViewById(R.id.btn_volver_calculadora);

        volver_calculadora.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent volver_calculadora = new Intent(getApplicationContext(), Principal.class);
                if(getIntent().resolveActivity(getPackageManager()) != null) {
                    startActivity(volver_calculadora);
                }
            }
        });


        //Aca lo comenzamos a declarar en el codigo
        numero1=findViewById(R.id.btn_numero1);
        numero2=findViewById(R.id.btn_numero2);

        resultado=findViewById(R.id.txt_resultado);

        btn_sumar=findViewById(R.id.btn_sumar);
        btn_sumar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado.setText( suma( Integer.parseInt(numero1.getText().toString()), Integer.parseInt(numero2.getText().toString()) ) +"");
            }
        });
        btn_restar=findViewById(R.id.btn_restar);
        btn_restar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado.setText( resta( Integer.parseInt(numero1.getText().toString()), Integer.parseInt(numero2.getText().toString()) ) +"");
            }
        });
        btn_dividir=findViewById(R.id.btn_dividir);
        btn_dividir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado.setText( division( Integer.parseInt(numero1.getText().toString()), Integer.parseInt(numero2.getText().toString()) ) +"");
            }
        });
        btn_multiplicar=findViewById(R.id.btn_multiplicar);
        btn_multiplicar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                resultado.setText( multiplicacion( Integer.parseInt(numero1.getText().toString()), Integer.parseInt(numero2.getText().toString()) ) +"");
            }
        });
    }
    public int suma(int a, int b){
        return a+b;
    }
    public int resta(int a, int b){
        return a-b;
    }
    public int division(int a, int b){
        return a/b;
    }
    public int multiplicacion(int a, int b){
        return a*b;
    }
}
