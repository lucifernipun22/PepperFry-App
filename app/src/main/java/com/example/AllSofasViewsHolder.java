package com.example;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.example.pepperfry.R;

public class AllSofasViewsHolder extends RecyclerView.ViewHolder {
    private ImageView mIvSofasImage;
    private TextView mTvSofasName, mTvSofasBrand, mTvSofasPrice;
    private ConstraintLayout mConstraintLayout;
    private ItemClickListener itemClickListener;

    public AllSofasViewsHolder(@NonNull View itemView, ItemClickListener itemClickListener) {
        super(itemView);
        this.itemClickListener = itemClickListener;
        initViews(itemView);
    }

    private void initViews(View itemView) {
        mIvSofasImage = itemView.findViewById(R.id.IvSofas);
        mTvSofasName = itemView.findViewById(R.id.TvSofas_Name);
        mTvSofasBrand = itemView.findViewById(R.id.TvSofas_Brand);
        mTvSofasPrice = itemView.findViewById(R.id.TvSofas_Price);
        mConstraintLayout = itemView.findViewById(R.id.ClSofas);
    }

    public void SetSofas(AllSofas sofas) {
        Glide.with(mIvSofasImage).load(sofas.getSofa_image()).into(mIvSofasImage);
        mTvSofasName.setText(sofas.getTitle());
        mTvSofasBrand.setText(sofas.getBrand());
        mTvSofasPrice.setText(" ₹ " + sofas.getPrice());
        mConstraintLayout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                itemClickListener.onSofasClicked(sofas);
            }
        });
    }
}
