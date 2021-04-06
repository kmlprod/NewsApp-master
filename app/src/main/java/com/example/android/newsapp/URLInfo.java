package com.example.android.newsapp;

/**
 * Created by Kamal ZAKOUNE.
 * Time : 19:05
 * Date : 06-04-2021
 */

public class URLInfo {
    private static String baseURL = "http://soltana.ma/wp-json/wp/v2/posts?page=1";
    private static String keyIs = "q=";
    private static String baseTopHeadlinesURL = "http://soltana.ma/wp-json/wp/v2/posts?page=1";
    private static String sources = "sources=", sortBy = "sortBy=", sort1 = "published";
    private static String source1 = "the-hindu", source2 = "bbc-news", source3 = "";
    private static String apiKey = "apiKey=";

    static String getBasicURL() {
        return baseTopHeadlinesURL + sources + source1 + "," + source2
                + "&" + sortBy + sort1
                + "&" + apiKey;

    }

    public static String getKeyNews(String key) {
        return baseURL + keyIs + key
                + "&" + sortBy + sort1
                + "&" + apiKey;
    }

    public static String getEveryNews() {
        return "http://soltana.ma/wp-json/wp/v2/posts?page=1";
    }

}
