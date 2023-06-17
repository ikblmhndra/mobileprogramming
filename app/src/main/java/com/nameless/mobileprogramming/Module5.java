package com.nameless.mobileprogramming;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.nameless.mobileprogramming.login.LoginActivity;
import com.nameless.mobileprogramming.login.RegisterActivity;

public class Module5 extends AppCompatActivity {

    Button btnlogin, btnregister;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module5);

        btnlogin = findViewById(R.id.btnLogin);
        btnregister = findViewById(R.id.btnRegister);

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Module5.this, LoginActivity.class);
                startActivity(intent);
            }
        });

        btnregister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Module5.this, RegisterActivity.class);
                startActivity(intent);
            }
        });
    }
}