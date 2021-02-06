package com.example;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pepperfry.R;

import java.util.List;

public class AllSeatsAdapters extends RecyclerView.Adapter<AllSeatsViewHolder> {

    private List<AllSeats> allSeatsList;
    private ItemClickListener itemClickListener;

    public AllSeatsAdapters(List<AllSeats> allSeatsList, ItemClickListener itemClickListener) {
        this.allSeatsList = allSeatsList;
        this.itemClickListener = itemClickListener;
    }

    @NonNull
    @Override
    public AllSeatsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_allseats, parent, false);
        return new AllSeatsViewHolder(view, itemClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull AllSeatsViewHolder holder, int position) {
        AllSeats allSeats = allSeatsList.get(position);
        holder.SetAllSeats(allSeats);
    }

    @Override
    public int getItemCount() {
        return allSeatsList.size();
    }
}
