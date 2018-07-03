package com.m2i.poe.shop;

public class Mainshop {

    public static void main (String [] args) {
        IMedia b =new Book("1", "Moby Dick",10, "Folio","Fiction" ); //create an object
        System.out.println(b.toString());
        System.out.println(b.getNetPrice());
        b.setPublisher(new Publisher(4,"Folio"));
        System.out.println(b.getPublisher());
        b.getAuthorList().add(new Author(5, "Herman", "Melville"));

        IMedia m = new Cd("10", "Orchestra", 15, 5);
        System.out.println(m.toString());
        System.out.println(m.getNetPrice());

        try {
            Cart cart = new Cart ();
            cart.add ( b );
            cart.add ( m );
            cart.remove ( m );
        } catch (MediaException e)  {
            e.printStackTrace();
        }

    }

}
