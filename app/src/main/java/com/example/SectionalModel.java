package com.example;

public class SectionalModel {
    private int image;
    private String MainHeading;
    private String Company;
    private String Rupees;
    private String Save;
    private String CashBack;
    private String limitedOffer;
    private String Delivery;

    public SectionalModel(int image, String mainHeading, String company, String rupees, String save, String cashBack, String limitedOffer, String delivery) {
        this.image = image;
        MainHeading = mainHeading;
        Company = company;
        Rupees = rupees;
        Save = save;
        CashBack = cashBack;
        this.limitedOffer = limitedOffer;
        Delivery = delivery;
    }

    public int getImage() {
        return image;
    }

    public String getMainHeading() {
        return MainHeading;
    }

    public String getCompany() {
        return Company;
    }

    public String getRupees() {
        return Rupees;
    }

    public String getSave() {
        return Save;
    }

    public String getCashBack() {
        return CashBack;
    }

    public String getLimitedOffer() {
        return limitedOffer;
    }

    public String getDelivery() {
        return Delivery;
    }
}
