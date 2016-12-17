package com.example.cristianverdes.mystackexchange;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by Cristian Verdes on 12/6/2016.
 */

public class SearchActivity extends AppCompatActivity {
    @Override
    public void onCreate(Bundle savedInstanceBundle){
        super.onCreate(savedInstanceBundle);
        setContentView(R.layout.activity_search);

        EditText editText = (EditText) findViewById(R.id.editText);
        Button button = (Button) findViewById(R.id.button);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DisplaySearchActivity.start(SearchActivity.this);
            }
        });
    }
}
