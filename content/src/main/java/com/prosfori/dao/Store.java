package com.prosfori.dao;


public class Store {
    private int id;
    private int prosforaId;
    private int quantity;

    public Store(int prosforaId, int quantity) {
        this.prosforaId = prosforaId;
        this.quantity = quantity;
    }

    public Store() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProsforaId() {
        return prosforaId;
    }

    public void setProsforaId(int prosforaId) {
        this.prosforaId = prosforaId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
