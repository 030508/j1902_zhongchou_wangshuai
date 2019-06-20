package com.qf.j1902.pojo;

import lombok.Data;

import java.util.Objects;


public class User {
    /*uid	int(11)
uname	varchar(50)
password	varchar(50)
customer	varchar(5)*/
    private int uid;
    private String uname;
    private String password;
    private String customer;
    private  String email;
    public User() {
    }

    public User(String uname, String password, String customer) {
            this.uname = uname;
            this.password = password;
            this.customer = customer;
    }

    public User(String uname, String password, String email, String customer) {
        this.uname = uname;
        this.password = password;
        this.email = email;
        this.customer = customer;
    }

    public User(int uid, String uname, String password, String customer, String email) {
        this.uid = uid;
        this.uname = uname;
        this.password = password;
        this.customer = customer;
        this.email = email;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public int getUid() {
        return uid;
    }

    public void setUid(int uid) {
        this.uid = uid;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "User{" +
                "uid=" + uid +
                ", uname='" + uname + '\'' +
                ", password='" + password + '\'' +
                ", customer='" + customer + '\'' +
                ", email='" + email + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof User)) return false;
        User user = (User) o;
        return uname.equals(user.uname) &&
                password.equals(user.password) &&
                customer.equals(user.customer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uname, password, customer);
    }
}
