package com.nameless.mobileprogramming;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.nameless.mobileprogramming.perhitungan.KonversiSuhu;
import com.nameless.mobileprogramming.perhitungan.LuasLingkaran;
import com.nameless.mobileprogramming.perhitungan.LuasPersegipanjang;
import com.nameless.mobileprogramming.perhitungan.LuasPersegitiga;

public class Module2 extends AppCompatActivity {

    Button btnPersegiPanjang, btnPersegiTiga, btnLingkaran, btnSuhu;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module2);

        btnPersegiPanjang = findViewById(R.id.btnPersegiPanjang);
        btnPersegiPanjang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Module2.this, LuasPersegipanjang.class);
                startActivity(intent);
            }
        });

        btnPersegiTiga = findViewById(R.id.btnSegiTiga);
        btnPersegiTiga.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Module2.this, LuasPersegitiga.class);
                startActivity(intent);
            }
        });

        btnLingkaran = findViewById(R.id.btnLingkaran);
        btnLingkaran.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Module2.this, LuasLingkaran.class);
                startActivity(intent);
            }
        });

        btnSuhu = findViewById(R.id.btnSuhu);
        btnSuhu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent =  new Intent(Module2.this, KonversiSuhu.class);
                startActivity(intent);
            }
        });

    }
}