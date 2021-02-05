package com.example;

public class AllSeats {
    private String title,price,Brand,Dimensions,Weight,Warranty,Assembly;
    private String Primary_Material;
    private String Room_Type;
    private String Seating_Height;
    private String Sku;
    private String Seat_image;

    public AllSeats(String title, String price, String brand, String dimensions, String weight, String warranty, String assembly, String primary_Material, String room_Type, String seating_Height, String sku, String seat_image) {
        this.title = title;
        this.price = price;
        Brand = brand;
        Dimensions = dimensions;
        Weight = weight;
        Warranty = warranty;
        Assembly = assembly;
        Primary_Material = primary_Material;
        Room_Type = room_Type;
        Seating_Height = seating_Height;
        Sku = sku;
        Seat_image = seat_image;
    }

    public String getTitle() {
        return title;
    }

    public String getPrice() {
        return price;
    }

    public String getBrand() {
        return Brand;
    }

    public String getDimensions() {
        return Dimensions;
    }

    public String getWeight() {
        return Weight;
    }

    public String getWarranty() {
        return Warranty;
    }

    public String getAssembly() {
        return Assembly;
    }

    public String getPrimary_Material() {
        return Primary_Material;
    }

    public String getRoom_Type() {
        return Room_Type;
    }

    public String getSeating_Height() {
        return Seating_Height;
    }

    public String getSku() {
        return Sku;
    }

    public String getSeat_image() {
        return Seat_image;
    }
}
