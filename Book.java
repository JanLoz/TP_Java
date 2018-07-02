package com.m2i.poe.shop;

public class Book extends Media { // heritage book is going to media

    private String title;  //definition parameters ; we put here what is extends!!!
    private String genre;
    private String author;
    private String pubyear;
    private String nbPage;
    private double getNetPrice;

    public Book ( String id, String title,  double price, String pubyear,  String genre){
        super(id, title, price);  // super prends l information de media
        this.pubyear = author;
        this.genre = genre;
        this.pubyear = pubyear;
        System.out.println("Construction of Book");
        }

    public void showBook() {
        System.out.println("Book is"+ this.title+ this.author+ this.genre+ this.nbPage+ this.pubyear);
    }

    public String toString() {  // affichage des parametres
        return super.toString();
    }


    public String getTitle() {
        return title;
    }

    public String getGenre() {
        return genre;
    }

    public String getAuthor() {
        return author;
    }

    public String getPubyear() {
        return pubyear;
    }

    public String getNbPage() {
        return nbPage;
    }

    @Override  ///  utilice la methode de calcule en media pour calculeR le prix des livres a 5% taxe
    public double getNetPrice() {
        return getNetPrice * 1.05 * 0.95+0.01;
    }
}
