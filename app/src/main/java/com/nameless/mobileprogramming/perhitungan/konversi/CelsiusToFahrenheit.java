package com.nameless.mobileprogramming.perhitungan.konversi;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.nameless.mobileprogramming.R;

public class CelsiusToFahrenheit extends AppCompatActivity {

    EditText c;
    Button btnKonversi;
    TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_celsius_to_fahrenheit);

        c = findViewById(R.id.etNilaiCelsius);
        btnKonversi = findViewById(R.id.btnKonversi1);
        txtHasil = findViewById(R.id.txtHasil);

        btnKonversi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (c.length() == 0){
                    Toast.makeText(getApplication(), "Nilai Celsius Belum diinput",
                            Toast.LENGTH_LONG).show();
                } else{
                    String isiCelsius = c.getText().toString();
                    double ic = Double.parseDouble(isiCelsius);
                    double hk = CelsiusToFahrenheit(ic);

                    String output = String.valueOf(hk + "\u00B0" + " Fahrenheit");
                    txtHasil.setText(output.toString());
                }
            }
        });
    }

    public double CelsiusToFahrenheit(double c){
        return (c * 1.8) + 32;
    }

}