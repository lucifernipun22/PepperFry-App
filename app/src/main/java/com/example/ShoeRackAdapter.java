package com.example;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pepperfry.R;

import java.util.List;

public class ShoeRackAdapter extends RecyclerView.Adapter<SectionalViewHolder> {
    private List<SectionalModel> sectionalModels;

    public ShoeRackAdapter(List<SectionalModel> sectionalModels) {
        this.sectionalModels=sectionalModels;
    }

    @NonNull
    @Override
    public SectionalViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.sectional_item, parent, false);
        return new SectionalViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull SectionalViewHolder holder, int position) {
         SectionalModel sectionalModel =sectionalModels.get(position);
         holder.setData(sectionalModel);
    }

    @Override
    public int getItemCount() {
        return sectionalModels.size();
    }
}
