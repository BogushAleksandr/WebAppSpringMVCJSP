package com.prosfori.dao;

import javax.persistence.*;
import java.util.Date;

@Entity
public class Order {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private Integer user_id;

    private Integer prosfora_id;

    private Integer quantity;

    private String comment;

    @Temporal(TemporalType.TIMESTAMP)
    private Date order_date;

    @Temporal(TemporalType.TIMESTAMP)
    private Date delivery_date;

    public Order(){}

}
