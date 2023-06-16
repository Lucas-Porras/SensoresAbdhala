package com.example.tareaaplicacion;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Sensor1 extends AppCompatActivity implements SensorEventListener{
    private Button volver2;
    TextView resultadoSensor;
    SensorManager sensorManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sensor1);

        sensorManager = (SensorManager) getSystemService(Context.SENSOR_SERVICE);
        resultadoSensor = findViewById(R.id.resultadoSensor);

        Sensor accelerometerSensor = sensorManager.getDefaultSensor(Sensor.TYPE_ACCELEROMETER);
        if (accelerometerSensor != null) {
            sensorManager.registerListener(this, accelerometerSensor, SensorManager.SENSOR_DELAY_NORMAL);
        }
    }

    @Override
    public void onSensorChanged(SensorEvent event) {
        if (event.sensor.getType() == Sensor.TYPE_ACCELEROMETER) {
            float x = event.values[0];
            float y = event.values[1];
            float z = event.values[2];

            String accelerometerValues = "X: " + x + "\nY: " + y + "\nZ: " + z;
            resultadoSensor.setText(accelerometerValues);
        }

        volver2 = (Button) findViewById(R.id.btn_volver2);
        volver2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent volver2 = new Intent(getApplicationContext(), Principal.class);
                if(getIntent().resolveActivity(getPackageManager()) != null){
                    startActivity(volver2);
                }
            }
        });
    }

    @Override
    public void onAccuracyChanged(Sensor sensor, int accuracy) {

    }
}