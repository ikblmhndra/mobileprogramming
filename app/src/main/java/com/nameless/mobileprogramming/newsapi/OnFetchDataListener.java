package com.nameless.mobileprogramming.newsapi;

import com.nameless.mobileprogramming.newsapi.models.NewsHeadlines;

import java.util.List;

public interface OnFetchDataListener<NewsApiResponses> {

    void onFetchData(List<NewsHeadlines> list, String message);
    void onError(String message);

}
