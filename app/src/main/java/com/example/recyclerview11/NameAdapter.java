package com.example.recyclerview11;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class NameAdapter extends RecyclerView.Adapter<NameViewHolder> {

    private final ArrayList<String> names;

    public NameAdapter(ArrayList<String> names) {
        this.names = names;
    }

    @NonNull
    @Override
    public NameViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new NameViewHolder(LayoutInflater.from(parent.getContext()).inflate(R.layout.item_layout, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull NameViewHolder holder, int position) {
        holder.bind(names.get(position));
    }

    @Override
    public int getItemCount() {
        return names.size();
    }
}
