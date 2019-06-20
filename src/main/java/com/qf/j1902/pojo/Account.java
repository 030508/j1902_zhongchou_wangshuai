package com.qf.j1902.pojo;

public class Account {
    private  int id;
    private  String type;
    private String name;
    private String namber;
    private String phone;
    private String img;
    private String email;
    private String uname;
    private String code;
    public Account() {
    }

    public Account(String type, String name, String namber, String phone, String img, String email, String uname, String code) {
        this.type = type;
        this.name = name;
        this.namber = namber;
        this.phone = phone;
        this.img = img;
        this.email = email;
        this.uname = uname;
        this.code = code;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNamber() {
        return namber;
    }

    public void setNamber(String namber) {
        this.namber = namber;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", type='" + type + '\'' +
                ", name='" + name + '\'' +
                ", namber='" + namber + '\'' +
                ", phone='" + phone + '\'' +
                ", img='" + img + '\'' +
                ", email='" + email + '\'' +
                ", uname='" + uname + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
