package com.nameless.mobileprogramming.perhitungan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.nameless.mobileprogramming.R;

public class LuasLingkaran extends AppCompatActivity {

    EditText j;
    Button btnHitung;
    TextView txtHasil;

    double pi = 3.14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_lingkaran);

        j = findViewById(R.id.etNilaiJari);
        btnHitung = findViewById(R.id.btnHitung);
        txtHasil = findViewById(R.id.txtHasil);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (j.length() == 0){
                    Toast.makeText(getApplication(), "Nilai Jari Jari Belum diinput",
                            Toast.LENGTH_LONG).show();
                }else{
                    String isiCelsius = j.getText().toString();
                    double ij = Double.parseDouble(isiCelsius);
                    double hj = luaslingkaran(ij);

                    String output = String.valueOf(hj);
                    txtHasil.setText(output.toString());
                }
            }
        });

    }

    public double luaslingkaran(double j){
        return pi * j * j;
    }

}