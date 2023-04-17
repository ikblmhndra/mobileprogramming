package com.nameless.mobileprogramming;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.nameless.mobileprogramming.newsapi.NewsApi;

public class Module4 extends AppCompatActivity {

    Button btnNewsApi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_module4);

        btnNewsApi = findViewById(R.id.btnNewsApi);
        btnNewsApi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(Module4.this, NewsApi.class);
                startActivity(intent);
            }
        });

    }
}