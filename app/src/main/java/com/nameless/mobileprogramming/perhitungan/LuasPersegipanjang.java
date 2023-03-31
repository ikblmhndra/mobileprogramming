package com.nameless.mobileprogramming.perhitungan;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.nameless.mobileprogramming.R;

public class LuasPersegipanjang extends AppCompatActivity {

    EditText p, l;
    Button Hitung;
    TextView hasil;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luas_persegipanjang);

        p = findViewById(R.id.etNilaiPanjang);
        l = findViewById(R.id.etNilaiLebar);
        Hitung = findViewById(R.id.btnHitung);
        hasil = findViewById(R.id.txtHasil);

        Hitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Jika panjang dan lebar tidak diisi akan tampil notif error
                if (p.length() == 0 && l.length() == 0) {
                    Toast.makeText(getApplication(), "Panjang dan Lebar belum diisi",
                            Toast.LENGTH_LONG).show();
                } else if (p.length() == 0) {
                    Toast.makeText(getApplication(), "Panjang belum diisi",
                            Toast.LENGTH_LONG).show();
                } else if (l.length() == 0) {
                    Toast.makeText(getApplication(), "Lebar belum diisi",
                            Toast.LENGTH_LONG).show();
                } else {
                    //ubah dari text ke string
                    String isiPanjang = p.getText().toString();
                    String isiLebar = l.getText().toString();

                    //ubah dari string ke double
                    double pa = Double.parseDouble(isiPanjang);
                    double le = Double.parseDouble(isiLebar);
                    double hs = LuasPersegiPanjang(pa, le);

                    String output = String.valueOf(hs);
                    hasil.setText(output.toString());
                }
            }
        });
    }
    public double LuasPersegiPanjang(double l, double p){
        return l*p;
    }
}