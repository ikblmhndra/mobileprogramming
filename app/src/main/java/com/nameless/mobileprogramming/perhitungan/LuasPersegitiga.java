package com.nameless.mobileprogramming.perhitungan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.nameless.mobileprogramming.R;

public class LuasPersegitiga extends AppCompatActivity {

    EditText a, t;
    Button btnHitung;
    TextView txtHasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_persegitiga);

        a = findViewById(R.id.etNilaiAlas);
        t = findViewById(R.id.etNilaiTinggi);
        btnHitung = findViewById(R.id.btnHitung);
        txtHasil = findViewById(R.id.txtHasil);

        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Jika alas dan tinggi tidak diisi akan tampil notif error
                if (a.length() == 0 && t.length() == 0) {
                    Toast.makeText(getApplication(), "Panjang dan Lebar belum diisi",
                            Toast.LENGTH_LONG).show();
                } else if (a.length() == 0) {
                    Toast.makeText(getApplication(), "Panjang belum diisi",
                            Toast.LENGTH_LONG).show();
                } else if (t.length() == 0) {
                    Toast.makeText(getApplication(), "Lebar belum diisi",
                            Toast.LENGTH_LONG).show();
                } else {
                    //ubah dari text ke string
                    String isiAlas = a.getText().toString();
                    String isiTinggi = t.getText().toString();

                    //ubah dari string ke double
                    double al = Double.parseDouble(isiAlas);
                    double ti = Double.parseDouble(isiTinggi);
                    double hs = LuasSegitiga(al, ti);

                    String output = String.valueOf(hs);
                    txtHasil.setText(output.toString());
                }
            }
        });
    }
    public double LuasSegitiga(double a, double t){
        return 0.5 * a * t;
    }
}