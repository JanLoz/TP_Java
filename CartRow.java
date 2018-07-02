package com.m2i.poe.shop;

import java.util.ArrayList;
import java.util.List;

public class CartRow { ///ne voit pas le panier
    private IMedia media;
    private int quantity=1;
    private List<CartRow> cartRowList = new ArrayList<>();

 //creer un constructor vide
    public CartRow() {
    }

    public CartRow(IMedia media)  {
        this.media=media;
}

    public void increment() {
        if(quantity >1) {
            quantity++;
        }
        else {
            System.out.println("Quantity error");
        }
}

    public void decrement() {
        quantity --;
}

    public IMedia getMedia() {
        return media;
    }

    public void setMedia(IMedia media) {
        this.media = media;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public List<CartRow> getCartRowList() {
        return cartRowList;
    }

    public void setCartRowList(List<CartRow> cartRowList) {
        this.cartRowList = cartRowList;
    }
}
