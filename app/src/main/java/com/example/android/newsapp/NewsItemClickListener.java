package com.example.android.newsapp;

import android.view.View;

/**
 * Created by Kamal.
 * Time : 23:30
 * Date : 06-04-2021
 */

public interface NewsItemClickListener {
    public void onItemClick(View v, int position, NewsAdapter.ViewHolder holder, News newsItem);
}
