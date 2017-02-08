package com.example.pikachu.ghanto;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Pikachu on 02/07/17.
 */

public class FragmentA extends android.app.Fragment {

    AdapterOne adapterOne;
    RecyclerView recyclerView;
    String[] persons = {"one","teo","three"};
    int[] images = {R.drawable.dropbox,R.drawable.facebook,R.drawable.google_plus};


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        adapterOne = new AdapterOne(persons,images);
        View view;
        view = inflater.inflate(R.layout.fragment_a,container,false);
        recyclerView = (RecyclerView) view.findViewById(R.id.recycler_view1);
        recyclerView.setAdapter(adapterOne);
        RecyclerView.LayoutManager manager = new LinearLayoutManager(getContext());
        recyclerView.setLayoutManager(manager);

        return view;
    }
}
