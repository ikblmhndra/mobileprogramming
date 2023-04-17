package com.nameless.mobileprogramming.newsapi;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.app.ProgressDialog;
import android.os.Bundle;

import com.nameless.mobileprogramming.R;

import com.nameless.mobileprogramming.newsapi.models.NewsApiResponses;
import com.nameless.mobileprogramming.newsapi.models.NewsHeadlines;

import java.util.List;


public class NewsApi extends AppCompatActivity {
    RecyclerView recyclerView;
    CustomAdapter adapter;
    ProgressDialog dialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_news_api);

        /*dialog = new ProgressDialog(this);
        dialog.setTitle("Ambil Data News");
        dialog.show();*/

        RequestManager manager = new RequestManager(this);
        manager.getNewsHeadlines(listener, null, "general");
    }

    private final OnFetchDataListener<NewsApiResponses> listener = new OnFetchDataListener<NewsApiResponses>() {
        @Override
        public void onFetchData(List<NewsHeadlines> list, String message) {
            showNews(list);
            //dialog.dismiss();
        }

        @Override
        public void onError(String message) {

        }
    };

    private void showNews(List<NewsHeadlines> list) {
        recyclerView = findViewById(R.id.rv_main);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new GridLayoutManager(this, 1));
        adapter = new CustomAdapter(this, list);
        recyclerView.setAdapter(adapter);
    }
}