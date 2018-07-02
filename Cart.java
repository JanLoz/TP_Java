package com.m2i.poe.shop;

import java.util.ArrayList;

public class Cart {

    public void Cart (){    // un panier est toujour au debut vide

    }

    private ArrayList<Media> mediaList= new ArrayList<>();
    private double totNetPrice;

    public void add (Media media)  {
        mediaList.add(media);
    }

    public void remove (Media media)  {
        mediaList.remove(media);
    }

    public double getTotNetPrice() {
        double totNetPrice=0;
        for (Media m1:mediaList) { ///toute est en la liste media
            totNetPrice+= m1.getNetPrice();// puor chaque media m parcourue, le prix total est l addition de chaque prix
        }
        return totNetPrice;
    }

}
