package com.prosfori.dao;


import java.sql.Timestamp;
import java.util.Date;

public class Ordering {
    private String comment;
    private int confirmed;
    private int delivered;
    private String deliveryAddress;
    private long deliveryDate;
    private int id;
    private long order_date;
    private int prosforaId;
    private int quantity;
    private int userId;

    public Ordering(String comment, int confirmed, int delivered, String deliveryAddress, long deliveryDate, long order_date, int prosforaId, int quantity, int userId) {
        this.comment = comment;
        this.confirmed = confirmed;
        this.delivered = delivered;
        this.deliveryAddress = deliveryAddress;
        this.deliveryDate = deliveryDate;
        this.order_date = order_date;
        this.prosforaId = prosforaId;
        this.quantity = quantity;
        this.userId = userId;
    }

    public Ordering() {
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public int getConfirmed() {
        return confirmed;
    }

    public void setConfirmed(int confirmed) {
        this.confirmed = confirmed;
    }

    public int getDelivered() {
        return delivered;
    }

    public void setDelivered(int delivered) {
        this.delivered = delivered;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public long getDeliveryDate() {
        return deliveryDate;
    }

    public void setDeliveryDate(long deliveryDate) {
        this.deliveryDate = deliveryDate;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public long getOrder_date() {
        return order_date;
    }

    public void setOrder_date(long order_date) {
        this.order_date = order_date;
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

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }
}
