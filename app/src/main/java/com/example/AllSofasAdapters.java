package com.example;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pepperfry.R;

import java.util.List;

public class AllSofasAdapters extends RecyclerView.Adapter<AllSofasViewsHolder> {
    private List<AllSofas> sofasList;
    private ItemClickListener itemClickListener;

    public AllSofasAdapters(List<AllSofas> sofasList, ItemClickListener itemClickListener) {
        this.sofasList = sofasList;
        this.itemClickListener = itemClickListener;
    }

    @NonNull
    @Override
    public AllSofasViewsHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_sofas_layout, parent, false);
        return new AllSofasViewsHolder(view, itemClickListener);
    }

    @Override
    public void onBindViewHolder(@NonNull AllSofasViewsHolder holder, int position) {
        AllSofas allSofas = sofasList.get(position);
        holder.SetSofas(allSofas);
    }

    @Override
    public int getItemCount() {
        return sofasList.size();
    }
}
