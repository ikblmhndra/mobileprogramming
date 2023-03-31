package com.nameless.mobileprogramming;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button btnModule1;
    Button btnModule2;
    Button btnModule3;
    Button btnModule4;
    Button btnModule5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnModule1 = findViewById(R.id.module1);
        btnModule1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Module1.class);
                startActivity(intent);
            }
        });

        btnModule2 = findViewById(R.id.module2);
        btnModule2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Module2.class);
                startActivity(intent);
            }
        });

        btnModule3 = findViewById(R.id.module3);
        btnModule3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Module3.class);
                startActivity(intent);
            }
        });

        btnModule4 = findViewById(R.id.module4);
        btnModule4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Module4.class);
                startActivity(intent);
            }
        });

        btnModule5 = findViewById(R.id.module5);
        btnModule5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, Module5.class);
                startActivity(intent);
            }
        });

    }
}