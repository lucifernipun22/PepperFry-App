package com.example;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

import com.example.pepperfry.R;

import java.util.ArrayList;
import java.util.List;

public class SeatingActivity extends AppCompatActivity implements ItemClickListener {

    private ImageView mIVLeftArrow, mIvSettings, mIvHeart, mIvAlert, mIvDepartment, mIvHome;
    private RecyclerView SetsRecyclerView;
    private Intent intent;
    private List<AllSeats> allSeatsList = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seating);
        initViews();
        BuildSeatasData();
        setAllSeatsToRecycler();
    }

    private void initViews() {
        mIVLeftArrow = findViewById(R.id.ivLeftArrowSofas);
        mIvSettings = findViewById(R.id.ivSettings);
        mIvHeart = findViewById(R.id.ivHeart);
        mIvAlert = findViewById(R.id.ivAlert);
        mIvDepartment = findViewById(R.id.ivDepartment);
        mIvHome = findViewById(R.id.ivHome);
        SetsRecyclerView = findViewById(R.id.RvAllSeat);
        mIVLeftArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(SeatingActivity.this, Furniture.class);
                startActivity(intent);
            }
        });
        mIvSettings.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(SeatingActivity.this, ProfileSection.class);
                startActivity(intent);
                finish();
            }
        });
        mIvHeart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(SeatingActivity.this, WhishList.class);
                startActivity(intent);
                finish();
            }
        });
        mIvAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(SeatingActivity.this, AlertsActivity.class);
                startActivity(intent);
                finish();
            }
        });
        mIvHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(SeatingActivity.this, HomeScreen.class);
                startActivity(intent);
                finish();
            }
        });
        mIvDepartment.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                intent = new Intent(SeatingActivity.this, DepartmentsActivity.class);
                startActivity(intent);
                finish();
            }
        });
    }

    private void BuildSeatasData() {
        for (int i = 0; i < 50; i++) {
            if (i % 10 == 0){
                allSeatsList.add(new AllSeats("Utah Settee in Colonial Maple Finish", "23,099", "Stories",
                        "H 33 x W 63 D x 24 ;Seating Height:17(All Dimensions are in inches)", "15 KG", "12 Months' Warranty",
                        "Carpenter Assembly", "Solid Wood", "Living Room", "17", "FN1788167-S-PM31835",
                        "https://ii1.pepperfry.com/media/catalog/product/u/t/568x625/utah-bench-in-colonial-maple-color-finish-by-stories-utah-bench-in-colonial-maple-color-finish-by-st-ktahjs.jpg"));
            }else if (i % 10 == 1){
                allSeatsList.add(new AllSeats("Freddie Settee in Teak Wood Finish", "34,099", "Make Home Happy",
                        "H 33 x W 50 x D 20; Seating Height : 17(all dimensions are in inches)", "15 KG", "12 Months' Warranty",
                        "No Assembly Required", "Teak Wood", "Living Room", "17", "FN1788167-S-PM31835",
                        "https://ii1.pepperfry.com/media/catalog/product/f/r/568x625/freddie-settee-in-teak-wood-finish-by-make-home-happy-freddie-settee-in-teak-wood-finish-by-make-hom-lnlz3n.jpg"));
            }else if (i % 10 == 2){
                allSeatsList.add(new AllSeats("Rafael Bench in Provincial Teak Finish", "16,499", "Bohemiana",
                        "H 18 x W 52 x D 18 (all dimensions in inches)", "15 KG", "36 Months' Warranty",
                        "No Assembly Required", "Sheesham Wood", "Living Room", "17", "FM1750565-S-WH32486",
                        "https://ii1.pepperfry.com/media/catalog/product/r/a/568x625/rafael-upholstered-bench-in-provincial-teak-finish-by-bohemiana-rafael-upholstered-bench-in-provinci-qlupa5.jpg"));
            }else if (i % 10 == 3){
                allSeatsList.add(new AllSeats("Woodway Solid Wood Bench in Provincial Teak Finish", "8,499", "Woodsworth",
                        "H 18 x W 46 x D 16; Seating Height - 18 (all dimensions in inches)", "16 KG", "36 Months' Warranty",
                        "Carpenter Assembly", "Sheesham  Wood", "Living Room", "18", "FM1524484-S-WH32479",
                        "https://ii1.pepperfry.com/media/catalog/product/w/o/568x625/woodway-solid-wood-bench-in-provincial-teak-finish-by-woodsworth-woodway-solid-wood-bench-in-provinc-tnleiv.jpg"));
            }else if (i % 10 == 4){
                allSeatsList.add(new AllSeats("Garret Solid Wood Chaise Lounger In Provincial Teak Finish", "57,999", "Amberville",
                        "Height: 37.8, Width: 74.8, Depth: 27.9 In Inches", "32 KG", "36 Months' Warranty",
                        "Carpenter Assembly", "Sheesham  Wood", "Living Room", "17", "FM1846558-S-WH32502",
                        "https://ii1.pepperfry.com/media/catalog/product/g/a/568x625/garret-solid-wood-chaise-lounger-in-provincial-teak-finish-by-bohemiana-garret-solid-wood-chaise-lou-ozdweu.jpg"));
            }else if (i % 10 == 5){
                allSeatsList.add(new AllSeats("Amigo Lounger in Black Colour", "24,499", "Trevi Furniture",
                        "H 27.5 x W 57 x D 30 (All dimensions are in inches)", " 35 KG", "12 Months' Warranty",
                        "Carpenter Assembly", "Leatherette  Wood", "Living Room", "17", "FN1866830-S-PM29923",
                        "https://ii1.pepperfry.com/media/catalog/product/a/m/568x625/amigo-lounger-in-black-colour-by-trevi-furniture-amigo-lounger-in-black-colour-by-trevi-furniture-b67cbz.jpg"));
            }else if (i % 10 == 6){
                allSeatsList.add(new AllSeats("Asira Solid Wood Recamier in Honey Oak Finish", "5,999", "CasaCraft",
                        "H 16 x W 18 x D 18 (all dimensions in inches)", "5 KG", "36 Months' Warranty",
                        "No Assembly Required", "Engineered Wood", "Living Room", "17", "FN1664164-P-WH18278",
                        "https://ii1.pepperfry.com/media/catalog/product/a/s/568x625/asira-solid-wood-recamier-in-honey-oak-finish-by-mudramark-asira-solid-wood-recamier-in-honey-oak-fi-ydhw55.jpg"));
            }else if (i % 10 == 7){
                allSeatsList.add(new AllSeats("Ana Ottoman in Walnut with Denim Blue Colour", "19,999", "Mudramark",
                        "H 26 x W 56 x D 16 (all dimensions in inches)", "9 KG", "36 Months' Warranty",
                        "No Assembly Required", "Metal", "Living Room", "17", "FM1618582-P-WH18110",
                        "https://ii1.pepperfry.com/media/catalog/product/t/a/568x625/tasarika-trunk-with-weaving-work-in-red-and-white-colour-by-mudramark-tasarika-trunk-with-weaving-wo-uuilkh.jpg"));
            }else if (i % 10 == 8){
                allSeatsList.add(new AllSeats("Tasarika Trunk with Weaving Work in Red and White Colour", "6,999", "Mudramark",
                        "H 16 x W 16 x D 16 (all dimensions in inches)", "13.6 KG", "36 Months' Warranty",
                        "Carpenter Assembly", "Sheesham   Wood", "Living Room", "17", "FM1618565-S-WH32486",
                        "https://ii1.pepperfry.com/media/catalog/product/a/n/568x625/ana-pouffe-with-storage-in-walnut-with-denim-blue-colour-by-casacraft-ana-pouffe-with-storage-in-wal-nbojlr.jpg"));
            }else if (i % 10 == 9){
                allSeatsList.add(new AllSeats("Arama Pouffe in Red Abstract Print", "6,499", "Mudramark",
                        "H 16 x W 20 x D 20 (all dimensions in inches)", "8 KG", "36 Months' Warranty",
                        "No Assembly Required", "Sheesham   Wood", "Living Room", "17", "FM1618597-P-WH18110",
                        "https://ii1.pepperfry.com/media/catalog/product/a/r/568x625/arama-pouffe-in-red-abstract-print-by-mudramark-arama-pouffe-in-red-abstract-print-by-mudramark-2xrwfm.jpg"));
            }
        }
    }

    private void setAllSeatsToRecycler() {
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2, GridLayoutManager.VERTICAL, false);
        AllSeatsAdapters allSeatsAdapters = new AllSeatsAdapters(allSeatsList, this);
        SetsRecyclerView.setAdapter(allSeatsAdapters);
        SetsRecyclerView.setLayoutManager(gridLayoutManager);
    }

    @Override
    public void onSeatsClicked(AllSeats seats) {
       /* ShowToast(seats.getPrice());*/
        Intent intent0 = new Intent(SeatingActivity.this, BuyActivity.class);
        String Name = seats.getTitle();
        String Price = seats.getPrice();
        String Brand = seats.getBrand();
        String Dimension = seats.getDimensions();
        String Weight = seats.getWeight();
        String Warranty = seats.getWarranty();
        String Assembly = seats.getAssembly();
        String Primary_Material = seats.getPrimary_Material();
        String Room_Type = seats.getRoom_Type();
        String Collection = "";
        String Seating_Height = seats.getSeating_Height();
        String Sku = seats.getSku();
        String Image = seats.getSeat_image();
        intent0.putExtra("Name",Name);
        intent0.putExtra("Price",Price);
        intent0.putExtra("Dimension",Dimension);
        intent0.putExtra("Weight",Weight);
        intent0.putExtra("Warranty",Warranty);
        intent0.putExtra("Assembly",Assembly);
        intent0.putExtra("Primary_Material",Primary_Material);
        intent0.putExtra("Room_Type",Room_Type);
        intent0.putExtra("Collection",Collection);
        intent0.putExtra("Brand",Brand);
        intent0.putExtra("Seating_Height",Seating_Height);
        intent0.putExtra("Sku",Sku);
        intent0.putExtra("Image",Image);
        startActivity(intent0);
    }

    @Override
    public void onSofasClicked(AllSofas sofas) {
        // This Fun For Sofas
    }

    public void ShowToast(String message) {
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }

}