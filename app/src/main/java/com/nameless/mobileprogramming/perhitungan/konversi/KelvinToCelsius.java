package com.nameless.mobileprogramming.perhitungan.konversi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.nameless.mobileprogramming.R;

public class KelvinToCelsius extends AppCompatActivity {

    EditText k;
    Button btnKonversi;
    TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kelvin_to_celsius);

        k = findViewById(R.id.etNilaikelvin);
        btnKonversi = findViewById(R.id.btnKonversi4);
        txtHasil = findViewById(R.id.txtHasil);

        btnKonversi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (k.length() == 0){
                    Toast.makeText(getApplication(), "Nilai Kelvin Belum diinput",
                            Toast.LENGTH_LONG).show();
                }else {
                    String isiCelsius = k.getText().toString();
                    double ik = Double.parseDouble(isiCelsius);
                    double hk = kelvinTocelsius(ik);

                    String output = String.valueOf(hk + "\u00B0" + " Celsius");
                    txtHasil.setText(output.toString());
                }
            }
        });
    }

    public double kelvinTocelsius(double k){
        return k - 273.15;
    }

}