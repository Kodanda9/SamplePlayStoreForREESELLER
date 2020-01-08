package com.pratap.gplaystore.adapters;

import android.app.Activity;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.pratap.gplaystore.DashBoardActivity;
import com.pratap.gplaystore.R;

import java.text.BreakIterator;
import java.util.ArrayList;

public class PLAdapter extends RecyclerView.Adapter<PLAdapter.MyViewHolder> {
    private final ArrayList listNames;
    private final Activity activity;

    public PLAdapter(Activity activity, ArrayList listNames) {
        this.activity = activity;
        this.listNames = listNames;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.lang_item,parent,false);
        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {
      //  MyViewHolder.TvLabel.setText(""+listNames.get(position));
    }

    @Override
    public int getItemCount() {
        return listNames.size();
    }


    public  class MyViewHolder  extends RecyclerView.ViewHolder
    {


        public   TextView TvLabel;

        public MyViewHolder(View itemView) {
            super(itemView);
            TvLabel = (TextView)itemView.findViewById(R.id.tvLabel);
        }
    }

}
