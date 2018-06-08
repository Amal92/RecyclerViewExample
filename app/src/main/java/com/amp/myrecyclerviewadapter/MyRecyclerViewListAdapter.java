package com.amp.myrecyclerviewadapter;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by amal on 08/06/18.
 */

public class MyRecyclerViewListAdapter extends RecyclerView.Adapter<MyRecyclerViewListAdapter.MyViewHolder> {

    private Context mContext;
    private ArrayList<Detail> detailArrayList;

    public MyRecyclerViewListAdapter(ArrayList<Detail> locationDataArrayList, Activity mContext) {
        this.detailArrayList = locationDataArrayList;
        this.mContext = mContext;
    }

    @Override
    public MyRecyclerViewListAdapter.MyViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.adapter_view, parent, false);

        return new MyViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(MyRecyclerViewListAdapter.MyViewHolder holder, int position) {
        Detail detail = detailArrayList.get(position);
        holder.textView.setText(detail.getName());
    }

    @Override
    public int getItemCount() {
        return detailArrayList.size();
    }

    public class MyViewHolder extends RecyclerView.ViewHolder {

        public TextView textView;


        public MyViewHolder(View view) {
            super(view);
            textView = view.findViewById(R.id.textView);

        }
    }

}
