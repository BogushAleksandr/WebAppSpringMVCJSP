package com.prosfori.dao;

/**
 * Created by Admin on 13.05.2017.
 */
public class Prosfori {
    private int id;
    private String name;
    private int price;

    public Prosfori(String name, int price) {
        this.name = name;
        this.price = price;
    }

    public Prosfori() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
