package com.nameless.mobileprogramming.perhitungan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.nameless.mobileprogramming.R;
import com.nameless.mobileprogramming.perhitungan.konversi.CelsiusToFahrenheit;
import com.nameless.mobileprogramming.perhitungan.konversi.CelsiusToKelvin;
import com.nameless.mobileprogramming.perhitungan.konversi.FahrenheitToCelsius;
import com.nameless.mobileprogramming.perhitungan.konversi.FahrenheitToKelvin;
import com.nameless.mobileprogramming.perhitungan.konversi.KelvinToCelsius;
import com.nameless.mobileprogramming.perhitungan.konversi.KelvinToFahrenheit;

public class KonversiSuhu extends AppCompatActivity {

    Button btnCtoF, btnFtoC, btnCtoK, btnKtoC, btnFtoK, btnKtoF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konversi_suhu);

        btnCtoF = findViewById(R.id.btnCtoF);
        btnFtoC = findViewById(R.id.btnFtoC);
        btnCtoK = findViewById(R.id.btnCtoK);
        btnKtoC = findViewById(R.id.btnKtoC);
        btnFtoK = findViewById(R.id.btnFtoK);
        btnKtoF = findViewById(R.id.btnKtoF);

        btnCtoF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KonversiSuhu.this, CelsiusToFahrenheit.class);
                startActivity(intent);
            }
        });

        btnFtoC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KonversiSuhu.this, FahrenheitToCelsius.class);
                startActivity(intent);
            }
        });

        btnCtoK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KonversiSuhu.this, CelsiusToKelvin.class);
                startActivity(intent);
            }
        });

        btnKtoC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KonversiSuhu.this, KelvinToCelsius.class);
                startActivity(intent);
            }
        });

        btnFtoK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KonversiSuhu.this, FahrenheitToKelvin.class);
                startActivity(intent);
            }
        });

        btnKtoF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KonversiSuhu.this, KelvinToFahrenheit.class);
                startActivity(intent);
            }
        });

    }
}