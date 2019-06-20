package com.qf.j1902.pojo;


/*
*
* 项目信息表
* */
public class ProjectInfo {
    /*pifnfoid	int(11)
tagid	int(8)
entryname	varchar(50)
synopsis	varchar(150)
amount	double(10,2)
days	int(10)
headimg	varchar(50)
detailsimg	varchar(50)
selfintro	varchar(100)
detailed	varchar(200)
call	varchar(11)
centercall	varchar(12)
account	varchar(20)
idcard	varchar(20)
zhangtai	varchar(12)*/
    private  int pifnfoId;
    private int tagId;
    private String entryName;
    private String synopsis;
    private double amount;
    private int days;
    private String headimg;
    private String detailsimg;
    private String selfintro;
    private String detailed	;
    private String call;
    private String centercall;
    private String account;
    private String idcard;
    private String zhangtai;
    private String uname;
    public ProjectInfo(int i, String s, String nihao, String jianjie, int i1, int i2, String tutu, String xingtu, String zaiwo, String xaingz, String s1, String s2, String wewewe, String 草稿, String qq) {
    }



    public ProjectInfo(int tagId, String entryName, String synopsis, double amount, int days, String headimg, String detailsimg, String selfintro, String detailed, String call, String centercall, String zhangtai, String uname) {
        this.tagId = tagId;
        this.entryName = entryName;
        this.synopsis = synopsis;
        this.amount = amount;
        this.days = days;
        this.headimg = headimg;
        this.detailsimg = detailsimg;
        this.selfintro = selfintro;
        this.detailed = detailed;
        this.call = call;
        this.centercall = centercall;
        this.zhangtai = zhangtai;
        this.uname = uname;
    }
    /*public ProjectInfo(int tagId, String entryName, String synopsis, double amount, int days, String headimg, String detailsimg, String selfintro, String detailed, String call, String centercall) {
        this.tagId = tagId;
        this.entryName = entryName;
        this.synopsis = synopsis;
        this.amount = amount;
        this.days = days;
        this.headimg = headimg;
        this.detailsimg = detailsimg;
        this.selfintro = selfintro;
        this.detailed = detailed;
        this.call = call;
        this.centercall = centercall;
    }
    */

   /* public ProjectInfo(int tagId, String entryName, String synopsis, double amount, int days, String headimg, String detailsimg, String selfintro, String detailed, String call, String centercall, String zhangtai, String uname) {
        this.tagId = tagId;
        this.entryName = entryName;
        this.synopsis = synopsis;
        this.amount = amount;
        this.days = days;
        this.headimg = headimg;
        this.detailsimg = detailsimg;
        this.selfintro = selfintro;
        this.detailed = detailed;
        this.call = call;
        this.centercall = centercall;
        this.zhangtai = zhangtai;
        this.uname = uname;
    }*/

    public int getPifnfoId() {
        return pifnfoId;
    }

    public void setPifnfoId(int pifnfoId) {
        this.pifnfoId = pifnfoId;
    }

    public int getTagId() {
        return tagId;
    }

    public void setTagId(int tagId) {
        this.tagId = tagId;
    }

    public String getEntryName() {
        return entryName;
    }

    public void setEntryName(String entryName) {
        this.entryName = entryName;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getDays() {
        return days;
    }

    public void setDays(int days) {
        this.days = days;
    }

    public String getHeadimg() {
        return headimg;
    }

    public void setHeadimg(String headimg) {
        this.headimg = headimg;
    }

    public String getDetailsimg() {
        return detailsimg;
    }

    public void setDetailsimg(String detailsimg) {
        this.detailsimg = detailsimg;
    }

    public String getSelfintro() {
        return selfintro;
    }

    public void setSelfintro(String selfintro) {
        this.selfintro = selfintro;
    }

    public String getDetailed() {
        return detailed;
    }

    public void setDetailed(String detailed) {
        this.detailed = detailed;
    }

    public String getCall() {
        return call;
    }

    public void setCall(String call) {
        this.call = call;
    }

    public String getCentercall() {
        return centercall;
    }

    public void setCentercall(String centercall) {
        this.centercall = centercall;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getIdcard() {
        return idcard;
    }

    public void setIdcard(String idcard) {
        this.idcard = idcard;
    }

    public String getZhangtai() {
        return zhangtai;
    }

    public void setZhangtai(String zhangtai) {
        this.zhangtai = zhangtai;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    @Override
    public String toString() {
        return "ProjectInfo{" +
                "pifnfoId=" + pifnfoId +
                ", tagId=" + tagId +
                ", entryName='" + entryName + '\'' +
                ", synopsis='" + synopsis + '\'' +
                ", amount=" + amount +
                ", days=" + days +
                ", headimg='" + headimg + '\'' +
                ", detailsimg='" + detailsimg + '\'' +
                ", selfintro='" + selfintro + '\'' +
                ", detailed='" + detailed + '\'' +
                ", call='" + call + '\'' +
                ", centercall='" + centercall + '\'' +
                ", account='" + account + '\'' +
                ", idcard='" + idcard + '\'' +
                ", zhangtai='" + zhangtai + '\'' +
                ", uname='" + uname + '\'' +
                '}';
    }
}


