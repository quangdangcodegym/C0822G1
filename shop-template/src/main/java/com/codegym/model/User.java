package com.codegym.model;

import com.codegym.utils.DateUtils;

import java.text.SimpleDateFormat;
import java.util.Date;

public class User {
    private Long id;
    private String name;
    private String email;
    private String address;
    private String phone;
    private Date createAt;
    private int idRole;
    public User() {

    }

    public User(Long id, String name, String email, String address, String phone, Date createAt, int idRole) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.address = address;
        this.phone = phone;
        this.createAt = createAt;
        this.idRole = idRole;
    }

    public Date getCreateAt() {
        return createAt;
    }

    public void setCreateAt(Date createAt) {
        this.createAt = createAt;
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

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public int getIdRole() {
        return idRole;
    }

    public void setIdRole(int idRole) {
        this.idRole = idRole;
    }

    @Override
    public String toString() {
        String dateCreateAt = DateUtils.formatDateToString(this.createAt);
        return String.format("%10s, %15s, %10s, %10s, %10s, %10s, %5s", this.id, this.name, this.email,
                this.address, this.phone, this.createAt, this.idRole);
    }
}
