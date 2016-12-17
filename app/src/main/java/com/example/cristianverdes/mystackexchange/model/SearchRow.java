package com.example.cristianverdes.mystackexchange.model;

/**
 * Created by Cristian Verdes on 11/29/2016.
 */

public class SearchRow {
    private String title;
    private String user;
    private String rate;

    public SearchRow(String title, String user, String rate) {
        this.title = title;
        this.user = user;
        this.rate = rate;
    }

    public void changeSearchRow(String title, String user, String rate){
        this.title = title;
        this.user = user;
        this.rate = rate;
    }

    public String getTitle() {
        return title;
    }

    public String getUser() {
        return user;
    }

    public String getRate() {
        return rate;
    }
}
