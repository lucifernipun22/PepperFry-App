package com.example;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pepperfry.R;

import java.util.List;

public class AllSeatsAdapters extends RecyclerView.Adapter<AllSeatsViewHolder> {

    private List<AllSeats> seatsList;
    private ItemClickListener itemClickListener;

    public AllSeatsAdapters(List<AllSeats> seatsList, ItemClickListener itemClickListener) {
        this.seatsList = seatsList;
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
        AllSeats allSteats = seatsList.get(position);
        holder.SetSeats(allSteats);
    }

    @Override
    public int getItemCount() {
        return seatsList.size();
    }
}
