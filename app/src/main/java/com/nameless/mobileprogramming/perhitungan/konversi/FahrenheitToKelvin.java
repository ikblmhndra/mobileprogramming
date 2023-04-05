package com.nameless.mobileprogramming.perhitungan.konversi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.nameless.mobileprogramming.R;

public class FahrenheitToKelvin extends AppCompatActivity {

    EditText f;
    Button btnKonversi;
    TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fahrenheit_to_kelvin);

        f = findViewById(R.id.etNilaifahrenheit);
        btnKonversi = findViewById(R.id.btnKonversi5);
        txtHasil = findViewById(R.id.txtHasil);

        btnKonversi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (f.length() == 0){
                    Toast.makeText(getApplication(), "Nilai Fahrenheit Belum diinput",
                            Toast.LENGTH_LONG).show();
                }else {
                    String isiCelsius = f.getText().toString();
                    double iF = Double.parseDouble(isiCelsius);
                    double hf = fahrenheitTokelvin(iF);

//                    String output = String.valueOf(hf + "\u00B0" + " Kelvin");
                    String output = String.format("%.2f", hf) ;
                    String output2 = output + "\u00B0" + " Kelvin";
                    txtHasil.setText(output2.toString());
                }
            }
        });
    }

    public double fahrenheitTokelvin(double f){
        return (f - 32) * 5/9 + 273.15;
    }

}