package com.example.android.tourappv5;


import android.database.DataSetObserver;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.Display;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class ShoppingFragment extends Fragment {
    final ArrayList<Site> sites = new ArrayList<Site>();

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.recycler_view, container, false);

        RecyclerView recyclerView = rootView.findViewById(R.id.my_recycler_viewId);
        recyclerView.setHasFixedSize(true);
        recyclerView.setLayoutManager(new LinearLayoutManager(getActivity()));

        sites.add(new Site(getString(R.string.shop_old_san_juan),getString(R.string.shop_old_san_juan_addresss), getString(R.string.shop_old_san_juan_description),getString(R.string.shop_old_san_juan_hours),R.drawable.oldsan));
        sites.add(new Site(getString(R.string.shop_plaza_las_americas),getString(R.string.shop_plaza_address), getString(R.string.shop_plaza_description),getString(R.string.shop_plaza_hours),R.drawable.plaza));


        recyclerView.setAdapter(new SiteAdapter(sites));

        return rootView;
    }

}