package com.m2i.poe.shop;

import java.util.ArrayList;

public abstract class Media implements IMedia {

    private String id;
    private String title;
    private double price;
    private double taxe = 0.2;
    private Publisher publisher;
    private ArrayList<Author> authorList= new ArrayList<>();

    public Media() { // constructeur vide appele dans mainshop
    }

    public Media(String id, String title, double price) { // constructeur avec de parameters pour creer des objets
        this.id=id;
        this.title=title;
        this.price=price;
    }

    @Override
    public String toString() { //Sortie affiche , renvioe de chaine
        return  id+" "+ title+" "+ price+ " ";
    }


    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getTitle() {
        return title;
    }

    @Override
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double getTaxe() {
        return taxe;
    }

    @Override
    public void setTaxe(double taxe) {
        this.taxe = taxe;
    }


    @Override
    public Publisher getPublisher() {
        return publisher;
    }

    @Override
    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    @Override
    public ArrayList<Author> getAuthorList() {
        return authorList;
    }

    @Override
    public void setAuthorList(ArrayList<Author> authorList) {
        this.authorList=authorList;
    }
}