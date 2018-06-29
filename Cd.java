package com.m2i.poe.shop;

public class Cd extends Media {
    private String id;
    private String title;
    private int track;
    private double price;

    public Cd () { //  constructeur vide
    }

    public Cd(String id, String title, double price, int track)  {
       super(id, title, price);
       this.track=track;
    }

    public String toString () {
        return super.toString()+ track;
    }

}
