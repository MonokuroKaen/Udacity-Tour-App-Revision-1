package com.example.android.tourappv5;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class SiteAdapter extends RecyclerView.Adapter<SiteAdapter.SiteViewHolder> {

    private ArrayList<Site>sites;
    private ViewGroup parent;

    SiteAdapter(ArrayList<Site> sites) {
        this.sites = sites;

    }


    @NonNull
    @Override
    public SiteViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView = LayoutInflater.from(parent.getContext()).inflate(R.layout.list_item,parent,false);
        return new SiteViewHolder(itemView);
    }

    @Override
    public void onBindViewHolder(@NonNull SiteViewHolder holder, int position) {


        Site currentSite = sites.get(position);


        holder.imageView.setImageResource(currentSite.getImageResourceId());
        holder.titleView.setText(currentSite.getPlaceName());
        holder.addressView.setText(currentSite.getPlaceAddress());
        holder.phonenumberView.setText(currentSite.getPlacePhoneNumber());


    }

    @Override
    //returns the size of the ArrayList
    public int getItemCount() {
        return sites.size();
    }

    class SiteViewHolder extends RecyclerView.ViewHolder {
        ImageView imageView;
        TextView titleView ;
        TextView addressView ;
        TextView placeHours;
        TextView phonenumberView ;

        SiteViewHolder(@NonNull View itemView) {
            super(itemView);
            imageView=itemView.findViewById(R.id.image);
            titleView = itemView.findViewById(R.id.title);
            addressView = itemView.findViewById(R.id.address);
            placeHours = itemView.findViewById(R.id.hours);
            phonenumberView =itemView.findViewById(R.id.phone);

            titleView.setSelected(true);
            addressView.setSelected(true);
            placeHours.setSelected(true);
            phonenumberView.setSelected(true);

        }
    }
}