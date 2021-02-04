package com.example;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.pepperfry.R;

public class ShoeRackViewHolder extends RecyclerView.ViewHolder {
    private ImageView image;
    private TextView Heading;
    private TextView company;
    private TextView rupees;
    private TextView Save;
    private TextView CashBack;
    private TextView Limited;
    private TextView Delivery;


    public ShoeRackViewHolder(@NonNull View itemView) {
        super(itemView);
        initViews(itemView);

    }

    private void initViews(View view) {
        image=view.findViewById(R.id.Image);
        Heading=view.findViewById(R.id.MainHeading);
        company=view.findViewById(R.id.CompanyName);
        rupees=view.findViewById(R.id.Rupees);
        Save=view.findViewById(R.id.Save);
        CashBack=view.findViewById(R.id.CashBack);
        Limited=view.findViewById(R.id.Limit);
        Delivery=view.findViewById(R.id.Delivery);



    }
    public  void setData(SectionalModel sectionalModel){
        image.setImageResource(sectionalModel.getImage());
        Heading.setText(sectionalModel.getMainHeading());
        company.setText(sectionalModel.getCompany());
        rupees.setText(sectionalModel.getRupees());
        Save.setText(sectionalModel.getSave());
        CashBack.setText(sectionalModel.getCashBack());
        Limited.setText(sectionalModel.getLimitedOffer());
        Delivery.setText(sectionalModel.getDelivery());
    }
}
