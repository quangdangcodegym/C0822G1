package com.codegym.model;

import com.codegym.utils.DateUtils;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.util.Date;

public class Product {
    private Long id;
    private String name;
    private float price;
    private int quantity;
    private EnumManufacturer manufacturer;
    private Date createAt;
    private Instant updateAt;


    public Product() {

    }
    public Product(Long id, String name, float price, int quantity,
                   EnumManufacturer manufacturer, Date createAt, Instant updateAt) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.manufacturer = manufacturer;
        this.createAt = createAt;
        this.updateAt = updateAt;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public EnumManufacturer getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(EnumManufacturer manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
    }

    public Instant getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(Instant updateAt) {
        this.updateAt = updateAt;
    }

    @Override
    public String toString() {
        String dateCreateAt = DateUtils.formatDateToString(this.createAt);
        String dateUpdateAt = DateUtils.formatInstanstToString(this.updateAt);

//        return String.format("%5s, %15s, %5s, %5s, %5s, %5s, %5s", this.id, this.name, this.price,
//                this.quantity, this.manufacturer, dateCreateAt, dateUpdateAt);

        return String.format("%s,%s,%s,%s,%s,%s,%s", this.id, this.name, this.price,
                this.quantity, this.manufacturer.getId(), dateCreateAt, dateUpdateAt);
    }

    public String showInfo() {
        String dateCreateAt = DateUtils.formatDateToString(this.createAt);
        String dateUpdateAt = DateUtils.formatInstanstToString(this.updateAt);

        return String.format("%s,%s,%s,%s,%s,%s,%s", this.id, this.name, this.price,
                this.quantity, this.manufacturer.getName(), dateCreateAt, dateUpdateAt);
    }
}
