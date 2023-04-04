package com.nameless.mobileprogramming.perhitungan;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.nameless.mobileprogramming.R;
import com.nameless.mobileprogramming.perhitungan.konversi.CelsiusToFahrenheit;

public class KonversiSuhu extends AppCompatActivity {

    Button btnCtoF;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_konversi_suhu);

        btnCtoF = findViewById(R.id.btnCtoF);
        btnCtoF.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(KonversiSuhu.this, CelsiusToFahrenheit.class);
                startActivity(intent);
            }
        });

    }
}