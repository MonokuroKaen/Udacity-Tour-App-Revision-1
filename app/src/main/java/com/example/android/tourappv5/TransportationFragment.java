package com.example.android.tourappv5;

import android.database.DataSetObserver;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListAdapter;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class TransportationFragment extends Fragment {

    final ArrayList<Site> sites = new ArrayList<Site>();

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.recycler_view, container, false);

        RecyclerView recyclerView = rootView.findViewById(R.id.my_recycler_viewId);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        sites.add(new Site(getString(R.string.uber),getString(R.string.uber_address), getString(R.string.uber_description),getString(R.string.uber_description),R.drawable.uber));
        sites.add(new Site(getString(R.string.lyft),getString(R.string.lyft_address), getString(R.string.lyft_description),getString(R.string.lyft_hours),R.drawable.lyft));
        sites.add(new Site(getString(R.string.taxi),getString(R.string.taxi_address), getString(R.string.taxi_description),getString(R.string.taxi_hours),R.drawable.taxi));

        // locating the listView and setting the adapter to it

        recyclerView.setAdapter(new SiteAdapter(sites));

        return rootView;
    }

}