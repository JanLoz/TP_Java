package com.m2i.poe.shop;

import java.util.ArrayList;
import java.util.List;

public class Cart {



    private double getTotNetPrice;

    private List<IMedia> mediaList = new ArrayList<>();
    private List<CartRow> cartRowList = new ArrayList<>();

    public List<IMedia> getMediaList() {
        return mediaList;
    }

    public List<CartRow> getCartRowList() {
        return cartRowList;
    }


    public double getTotNetPrice() {
        double res = 0;
        for (IMedia media : mediaList) { ///toute est en la liste media
            res += media.getNetPrice();// puor chaque media m parcourue, le prix total est l addition de chaque prix
            for (CartRow row : cartRowList) {
                res += row.getMedia().getNetPrice();
            }
        } return res;
    }

    public void add (IMedia media)  {
        mediaList.add(media);
        CartRow row= mediaExists(media);
// si media existe dans le panier
        if(row== null)  {
            row = new CartRow(media);
            cartRowList.add(row);
        }
        else {
            row.increment();
        }
    }

    private CartRow mediaExists(IMedia media) {
        CartRow res=null;
        for (CartRow row: cartRowList) {
            if(media==row.getMedia()) {
                res=row;
            }
        } return res;

    }


    public void remove (IMedia media)  {
        mediaList.remove(media);
        CartRow row = mediaExists(media);
        if (row== null) {
            System.out.println("Cart error");
        }
        else {
            if (row.getQuantity() > 1) {
                row.decrement();
            }
            else {
                cartRowList.remove(row);
            }
        }
    }

}
