package com.example;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.bumptech.glide.Glide;
import com.example.pepperfry.R;

public class BuyActivity extends AppCompatActivity {
    private ImageView IvBackToSofas, IvItemImage;
    private TextView TvItemName, TvItemBrand, TvItemPrice, TvBrandName_Details, TvDimensions_Details, TvWeight_Details, TvAssembly_Details,
            TvWarranty_Details, TvPrimaryMaterial_Details, TvRoomTypel_Details, TvCollection_Details, Tv_SeatingHeight_Details, Tv_Sku_Details;
    private EditText EtvPincode;
    private Button BtnPincode, BtnAddToCard, BtnBuyNow;
    String Name,Price;
    String Brand;
    String Dimension;
    String Weight;
    String Warranty;
    String Assembly;
    String Primary_Material;
    String Room_Type;
    String Collection;
    String Seating_Height;
    String Sku;
    String Image;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_buy);
        initViews();
        getDataFromIntent();
    }


    private void initViews() {
        IvBackToSofas = findViewById(R.id.IvBackToSofas);
        TvItemName = findViewById(R.id.TvItemName);
        TvItemBrand = findViewById(R.id.TvItemBrand);
        TvItemPrice = findViewById(R.id.TvItemPrice);
        TvBrandName_Details = findViewById(R.id.TvBrandName_Details);
        TvDimensions_Details = findViewById(R.id.TvDimensions_Details);
        TvWeight_Details = findViewById(R.id.TvWeight_Details);
        TvAssembly_Details = findViewById(R.id.TvAssembly_Details);
        TvWarranty_Details = findViewById(R.id.TvWarranty_Details);
        TvPrimaryMaterial_Details = findViewById(R.id.TvPrimaryMaterial_Details);
        TvRoomTypel_Details = findViewById(R.id.TvRoomTypel_Details);
        Tv_SeatingHeight_Details = findViewById(R.id.Tv_SeatingHeight_Details);
        Tv_Sku_Details = findViewById(R.id.Tv_Sku_Details);
        EtvPincode = findViewById(R.id.EtvPincode);
        BtnPincode = findViewById(R.id.BtnPincode);
        BtnAddToCard = findViewById(R.id.BtnAddToCard);
        BtnBuyNow = findViewById(R.id.BtnBuyNow);
        IvItemImage = findViewById(R.id.IvItemImage);
        IvBackToSofas.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent0 = new Intent(BuyActivity.this, SofasActivity.class);
                startActivity(intent0);
            }
        });
        BtnBuyNow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent1 = new Intent(BuyActivity.this, BuyNowActivity.class);
                intent1.putExtra("Name",Name);
                intent1.putExtra("Price",Price);
                intent1.putExtra("Brand",Brand);
                intent1.putExtra("Warranty",Warranty);
                intent1.putExtra("Image",Image);
                startActivity(intent1);
            }
        });
    }

    private void getDataFromIntent() {
        if (getIntent() != null) {
            Name = getIntent().getStringExtra("Name");
            Price = getIntent().getStringExtra("Price");
            Brand = getIntent().getStringExtra("Brand");
            Dimension = getIntent().getStringExtra("Dimension");
            Weight = getIntent().getStringExtra("Weight");
            Warranty = getIntent().getStringExtra("Warranty");
            Assembly = getIntent().getStringExtra("Assembly");
            Primary_Material = getIntent().getStringExtra("Primary_Material");
            Room_Type = getIntent().getStringExtra("Room_Type");
            Collection = getIntent().getStringExtra("Collection");
            Seating_Height = getIntent().getStringExtra("Seating_Height");
            Sku = getIntent().getStringExtra("Sku");
             Image = getIntent().getStringExtra("Image");
            TvItemName.setText(Name);
            TvItemBrand.setText(Brand + " by Pepperfty");
            TvItemPrice.setText("₹ " + Price);
            TvBrandName_Details.setText(Brand);
            TvDimensions_Details.setText(Dimension);
            TvWeight_Details.setText(Weight);
            TvAssembly_Details.setText(Assembly);
            TvWarranty_Details.setText(Warranty);
            TvPrimaryMaterial_Details.setText(Primary_Material);
            TvRoomTypel_Details.setText(Room_Type);
            Tv_SeatingHeight_Details.setText(Seating_Height);
            Tv_Sku_Details.setText(Sku);
          /*  TvCollection_Details.setText(Collection);*/
            Glide.with(IvItemImage).load(Image).into(IvItemImage);
           /* ShowToast("Name:"+Name+"\n"+"Price "+Price+"\n"+"Brand "+Brand+"\n"+"Dimension"+Dimension+"\n"+"Weight"+"\n"+Weight+"\n"+"" +
                    "Warranty"+Warranty+"\n"+"Assembly"+Assembly+"\n"+"Primary_Material"+Primary_Material+"\n"+"Room_Type"+Room_Type+"\n"+
                    "Collection"+Collection+"\n"+"Seating_Height"+Seating_Height+"\n"+"Sku"+Sku);*/
        }
    }

    public void ShowToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
