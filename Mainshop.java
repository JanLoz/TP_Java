package com.m2i.poe.shop;

public class Mainshop {

    public static void main (String [] args) {
        Media m1 =new Book("1", "Moby Dick",10, "Folio","Fiction" ); //create an object
        System.out.println(m1.toString());
        System.out.println(m1.getNetPrice());
        m1.setPublisher(new Publisher(4,"Folio"));
        System.out.println(m1.getPublisher());
        m1.getAuthorList().add(new Author(5, "Herman", "Melville"));

        Media m2 = new Cd("10", "Orchestra", 15);
        System.out.println(m2.toString());
        System.out.println(m2.getNetPrice());
    }
}
