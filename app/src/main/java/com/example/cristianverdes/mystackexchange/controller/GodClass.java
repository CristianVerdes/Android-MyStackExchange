package com.example.cristianverdes.mystackexchange.controller;

import com.example.cristianverdes.mystackexchange.model.SearchRow;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Cristian Verdes on 12/6/2016.
 * We build a God Class to learn why it is not good practice to do so. (Learn form mistakes)
 * We'll optimize this in the near future
 */

public class GodClass {
    private List<SearchRow> searchRows = new ArrayList<>();

    public GodClass(){
        addSearchRows();
    }

    public void addSearchRows(){
        SearchRow searchRow = new SearchRow("something_0", "user_0", "rate_0");
        searchRows.add(searchRow);

        SearchRow searchRow1 = new SearchRow("something_1", "user_1", "rate_1");
        searchRows.add(searchRow1);

        SearchRow searchRow2 = new SearchRow("something_2", "user_2", "rate_2");
        searchRows.add(searchRow2);

        SearchRow searchRow3 = new SearchRow("something_3", "user_3", "rate_3");
        searchRows.add(searchRow3);

        SearchRow searchRow4 = new SearchRow("something_4", "user_4", "rate_4");
        searchRows.add(searchRow4);

        SearchRow searchRow5 = new SearchRow("something_5", "user_5", "rate_5");
        searchRows.add(searchRow5);

        SearchRow searchRow6 = new SearchRow("something_6", "user_6", "rate_6");
        searchRows.add(searchRow6);

        SearchRow searchRow7 = new SearchRow("something_7", "user_7", "rate_7");
        searchRows.add(searchRow7);

        SearchRow searchRow8 = new SearchRow("something_8", "user_8", "rate_8");
        searchRows.add(searchRow8);

        SearchRow searchRow9 = new SearchRow("something_9", "user_9", "rate_9");
        searchRows.add(searchRow9);

        SearchRow searchRow10 = new SearchRow("something_10", "user_10", "rate_10");
        searchRows.add(searchRow10);
    }

    public List<SearchRow> getSearchRows() {
        return searchRows;
    }
}
