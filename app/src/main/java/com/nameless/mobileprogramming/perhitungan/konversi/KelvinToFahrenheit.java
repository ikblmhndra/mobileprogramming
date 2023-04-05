package com.nameless.mobileprogramming.perhitungan.konversi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.nameless.mobileprogramming.R;

public class KelvinToFahrenheit extends AppCompatActivity {

    EditText k;
    Button btnKonversi;
    TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kelvin_to_fahrenheit);

        k = findViewById(R.id.etNilaikelvin);
        btnKonversi = findViewById(R.id.btnKonversi6);
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
                    double hk = kelvinTofahrenheit(ik);

//                    String output = String.valueOf(hf + "\u00B0" + " Kelvin");
                    String output = String.format("%.2f", hk) ;
                    String output2 = output + "\u00B0" + " Fahrenheit";
                    txtHasil.setText(output2.toString());
                }
            }
        });

    }

    public double kelvinTofahrenheit(double k){
        return (k - 273.15) * 9/5 + 32;
    }

}