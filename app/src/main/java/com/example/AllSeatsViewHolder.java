package com.example;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.pepperfry.R;

public class AllSeatsViewHolder extends RecyclerView.ViewHolder {
    private ImageView IvSeats;
    private TextView TvSeats_Name,TvSeats_Brand,TvSeats_Price;
    private ItemClickListener itemClickListener;
    public AllSeatsViewHolder(@NonNull View itemView,ItemClickListener itemClickListener) {
        super(itemView);
        this.itemClickListener = itemClickListener;
        InitViews(itemView);
    }

    private void InitViews(View itemView) {
        IvSeats = itemView.findViewById(R.id.IvSeats);
        TvSeats_Name = itemView.findViewById(R.id.TvSeats_Name);
        TvSeats_Brand = itemView.findViewById(R.id.TvSeats_Brand);
        TvSeats_Price = itemView.findViewById(R.id.TvSeats_Price);
    }

    public void SetSeats(AllSeats seats){
        Glide.with(IvSeats).load(seats.getSeat_image()).into(IvSeats);
        TvSeats_Name.setText(seats.getTitle());
        TvSeats_Brand.setText(seats.getBrand());
        TvSeats_Price.setText(" ₹ " + seats.getPrice());
        IvSeats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClickListener.onSeatsClicked(seats);
            }
        });
    }
}
