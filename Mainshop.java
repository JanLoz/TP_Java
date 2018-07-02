package com.m2i.poe.shop;

public class Mainshop {

    public static void main (String [] args) {
        IMedia m1 =new Book("1", "Moby Dick",10, "Folio","Fiction" ); //create an object
        System.out.println(m1.toString());
        System.out.println(m1.getNetPrice());
        m1.setPublisher(new Publisher(4,"Folio"));
        System.out.println(m1.getPublisher());
        m1.getAuthorList().add(new Author(5, "Herman", "Melville"));

        IMedia m2 = new Cd("10", "Orchestra", 15, 5);
        System.out.println(m2.toString());
        System.out.println(m2.getNetPrice());

        Cart c1 = new Cart();
        c1.add(m1);
        c1.add(m2);
        for(CartRow c:c1.getCartRowList()) {
            System.out.println(c.getMedia().toString()); //function
        }

        System.out.println(c1.getTotNetPrice());
    }

}
