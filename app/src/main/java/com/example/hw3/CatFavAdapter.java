package com.example.hw3;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CatFavAdapter extends RecyclerView.Adapter<CatFavAdapter.CatFavViewHolder> {

    private List<Cat> catFavs = CatDatabase.getCatFavourites();

    @NonNull
    @Override
    public CatFavViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.cat_list, parent, false);
        return new CatFavAdapter.CatFavViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull CatFavViewHolder holder, int position) {
        final Cat catAtPosition = catFavs.get(position);
        holder.catName.setText(catAtPosition.getName());
    }

    @Override
    public int getItemCount() {
        return catFavs.size();
    }

    public class CatFavViewHolder extends RecyclerView.ViewHolder {
        public View view;
        public TextView catName;

        public CatFavViewHolder(@NonNull View v) {
            super(v);
            view = v;
            catName = v.findViewById(R.id.cat_list_name);
        }
    }
}
