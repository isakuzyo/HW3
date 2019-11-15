package com.example.hw3;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;


public class CatFavRecyclerFragment extends Fragment {

    private RecyclerView recyclerView;

    public CatFavRecyclerFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_fav_rv, container, false);
        recyclerView = view.findViewById(R.id.fav_rv_id);
        LinearLayoutManager layoutManager = new LinearLayoutManager(view.getContext());
        recyclerView.setLayoutManager(layoutManager);

        CatFavAdapter catFavAdapter = new CatFavAdapter();
        recyclerView.setAdapter(catFavAdapter);

        return view;
    }
}
