package com.m2i.poe.shop;

public class Publisher {

    private String name;
    private int id;

    public Publisher() {
    }

    public Publisher(int id, String name)  {
        this.id=id;
        this.name=name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String toString() {
        return id + " "+ name;
    }
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
