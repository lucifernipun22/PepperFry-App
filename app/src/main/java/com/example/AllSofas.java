package com.example;

public class AllSofas {
    private String title;
    private String price;
    private String Brand;
    private String Dimensions;
    private String Weight;
    private String Warranty;
    private String Assembly;
    private String Primary_Material;
    private String Room_Type;
    private String Collection;
    private String Seating_Height;
    private String Sku;
    private String Sofa_image;

    public AllSofas(String title, String price, String brand, String dimensions, String weight, String warranty, String assembly, String primary_Material, String room_Type, String collection, String seating_Height, String sku, String sofa_image) {
        this.title = title;
        this.price = price;
        Brand = brand;
        Dimensions = dimensions;
        Weight = weight;
        Warranty = warranty;
        Assembly = assembly;
        Primary_Material = primary_Material;
        Room_Type = room_Type;
        Collection = collection;
        Seating_Height = seating_Height;
        Sku = sku;
        Sofa_image = sofa_image;
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

    public String getCollection() {
        return Collection;
    }

    public String getSeating_Height() {
        return Seating_Height;
    }

    public String getSku() {
        return Sku;
    }

    public String getSofa_image() {
        return Sofa_image;
    }
}
