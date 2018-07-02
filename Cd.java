package com.m2i.poe.shop;

public class Cd extends Media {
    private String id;
    private String title;
    private int track;
    private double price;
    private double getNetPrice;


    public Cd () { //  constructeur vide
    }

    public Cd(String id, String title, double price, int track)  {
       super(id, title, price);
       this.track=track;
    }

    public String toString () {
        return super.toString()+ track;
    }

    @Override
    public double getNetPrice() {

        return getNetPrice*1.2;
    }

}
