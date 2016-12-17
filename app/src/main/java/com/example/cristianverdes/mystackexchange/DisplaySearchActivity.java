package com.example.cristianverdes.mystackexchange;

import android.content.Context;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.DefaultItemAnimator;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.cristianverdes.mystackexchange.controller.GodClass;
import com.example.cristianverdes.mystackexchange.model.SearchRow;
import com.example.cristianverdes.mystackexchange.model.SearchRowsAdapter;

import java.util.ArrayList;
import java.util.List;

public class DisplaySearchActivity extends AppCompatActivity {
    private List<SearchRow> searchRows = new ArrayList<>();
    private RecyclerView recyclerView;
    private SearchRowsAdapter searchRowsAdapter;

    public static void start(Context context) {
        Intent starter = new Intent(context, DisplaySearchActivity.class);
        context.startActivity(starter);
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = (RecyclerView) findViewById(R.id.recycler_view);

        searchRowsAdapter = new SearchRowsAdapter(this, searchRows);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this);
        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setItemAnimator(new DefaultItemAnimator());
        recyclerView.setAdapter(searchRowsAdapter);

        /* Call controller here
        ** GodClass godClass = new GodClass();
        ** searchRows = godClass.getSearchRows();
        */

        addSearchRows();
        searchRowsAdapter.notifyDataSetChanged();
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
}
