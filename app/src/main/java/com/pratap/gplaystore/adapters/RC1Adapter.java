package com.pratap.gplaystore.adapters;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.pratap.gplaystore.DashBoardActivity;
import com.pratap.gplaystore.MainActivity;
import com.pratap.gplaystore.R;

import java.util.ArrayList;

public class RC1Adapter extends RecyclerView.Adapter<RC1Adapter.MyViewHolder> {
    private final Activity activity;
    private final ArrayList namesList;
    private final ArrayList imagesList;

    public RC1Adapter(Activity activity, ArrayList namesList, ArrayList imagesList) {
        this.activity=activity;
        this.namesList=namesList;
        this.imagesList=imagesList;
    }

    @Override
    public MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.rc1_layout, parent, false);
        return  new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyViewHolder holder, int position) {

        holder.tvName.setText(""+ namesList.get(position));
        holder.Img.setImageResource((Integer) imagesList.get(position));

        holder.Img.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent in = new Intent(activity, MainActivity.class);
                activity.startActivity(in);
            }
        });

    }

    @Override
    public int getItemCount() {
        return namesList.size();
    }


    public  class MyViewHolder extends RecyclerView.ViewHolder{
        TextView tvName;
        ImageView Img;
        public MyViewHolder(View itemView) {
            super(itemView);
            tvName = (TextView)itemView.findViewById(R.id.tvName);
            Img = (ImageView)itemView.findViewById(R.id.img);
        }
    }
}
