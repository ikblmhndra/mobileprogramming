package com.nameless.mobileprogramming.perhitungan.konversi;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.nameless.mobileprogramming.R;

public class FahrenheitToCelsius extends AppCompatActivity {

    EditText f;
    Button btnKonversi;
    TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fahrenheit_to_celsius);

        f = findViewById(R.id.etNilaiFahrenheit);
        btnKonversi = findViewById(R.id.btnKonversi2);
        txtHasil = findViewById(R.id.txtHasil);

        btnKonversi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (f.length() == 0){
                    Toast.makeText(getApplication(), "Nilai Fahrenheit Belum diinput",
                            Toast.LENGTH_LONG).show();
                }else {
                    String isiFahrenheit = f.getText().toString();
                    double iF = Double.parseDouble(isiFahrenheit);
                    double hk = fahrenheitTocelsius(iF);

                    String output = String.valueOf(hk + "\u00B0" + " Celsius");
                    txtHasil.setText(output.toString());
                }
            }
        });

    }

    public double fahrenheitTocelsius(double f){
        return (f - 32) / 1.8;
    }

}