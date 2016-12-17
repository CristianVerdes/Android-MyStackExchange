package com.example.cristianverdes.mystackexchange.model;

import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.example.cristianverdes.mystackexchange.R;
import com.example.cristianverdes.mystackexchange.ViewQuestionActivity;

import java.util.List;

/**
 * Created by Cristian Verdes on 11/29/2016.
 */

public class SearchRowsAdapter extends RecyclerView.Adapter<SearchRowsAdapter.MyViewHolder>  {
    private List<SearchRow> searchRows;
    public Context context;

    public class MyViewHolder extends RecyclerView.ViewHolder{
        private TextView title;
        private TextView user;
        private TextView rate;
        private Button button;

        public MyViewHolder(View view){
            super(view);
            this.title = (TextView) view.findViewById(R.id.title);
            this.user = (TextView) view.findViewById(R.id.user);
            this.rate = (TextView) view.findViewById(R.id.rate);
            this.button = (Button) view.findViewById(R.id.button);

            this.button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    ViewQuestionActivity.start(context);
                }
            });
        }
    }

    //Constructor
    public SearchRowsAdapter (Context context, List<SearchRow> searchRows){
        this.context = context;
        this.searchRows = searchRows;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.search_list_row, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
        SearchRow searchRow = searchRows.get(position);

        holder.title.setText(searchRow.getTitle());
        holder.user.setText(searchRow.getUser());
        holder.rate.setText(searchRow.getRate());
    }

    @Override
    public int getItemCount() {
        return searchRows.size();
    }

}
