package com.m2i.poe.shop;

public class Mainshop {

    public static void main (String [] args) {
        Media m =new Book("1", "Moby Dick",10, "Folio","Fiction" ); //create an object

        System.out.println(m.getNetPrice());

    }


}
