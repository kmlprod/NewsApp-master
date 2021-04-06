package com.example.android.newsapp;

/**
 * Created by KamalzWeb on 06-04-2021.
 */

public class News {

    private String mHeading, mSubHeading, mUrlImage, mUrlSite;

    public News(String heading, String subHeading, String urlImage, String urlSite) {

        mHeading = heading;
        mSubHeading = subHeading;
        mUrlImage = urlImage;
        mUrlSite = urlSite;
    }

    String getHeading() {
        return mHeading;
    }

    String getSubHeading() {
        return mSubHeading;
    }

    String getUrlImage() {
        return mUrlImage;
    }

    String getUrlSite() {
        return mUrlSite;
    }
}
