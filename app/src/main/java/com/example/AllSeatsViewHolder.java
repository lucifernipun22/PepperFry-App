package com.example;

import android.media.Image;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.pepperfry.R;

public class AllSeatsViewHolder extends RecyclerView.ViewHolder {
    private ImageView IvSeatsImages;
    private TextView TvSeats_Name, TvSeats_Brand, TvSeats_Price;
    private ItemClickListener itemClickListener;

    public AllSeatsViewHolder(@NonNull View itemView, ItemClickListener itemClickListener) {
        super(itemView);
        this.itemClickListener = itemClickListener;
        initViews(itemView);
    }

    private void initViews(View itemView) {
        IvSeatsImages = itemView.findViewById(R.id.IvSeatsImages);
        TvSeats_Name = itemView.findViewById(R.id.TvSeats_Name);
        TvSeats_Brand = itemView.findViewById(R.id.TvSeats_Brand);
        TvSeats_Price = itemView.findViewById(R.id.TvSeats_Price);
    }

    public void SetAllSeats(AllSeats allSeats) {
        Glide.with(IvSeatsImages).load(allSeats.getSeat_image()).into(IvSeatsImages);
        TvSeats_Name.setText(allSeats.getTitle());
        TvSeats_Brand.setText(allSeats.getBrand());
        TvSeats_Price.setText(allSeats.getPrice());
        IvSeatsImages.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClickListener.onSeatsClicked(allSeats);
            }
        });
    }
}
