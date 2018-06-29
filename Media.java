package com.m2i.poe.shop;

public class Media {

    private String id;
    private String title;
    private double price;
    private double taxe = 0.2;



    public Media() { // constructeur vide appele dans mainshop
    }

    public Media(String id, String title, double price) { // constructeur avec de parameters pour creer des objets
        this.id=id;
        this.title=title;
        this.price=price;
    }


    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public double getTaxe() {
        return taxe;
    }

    public void setTaxe(double taxe) {
        this.taxe = taxe;
    }

    public double getNetPrice()  {
        return price*1.2;
    }
}