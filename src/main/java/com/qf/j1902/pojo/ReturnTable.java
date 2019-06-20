package com.qf.j1902.pojo;


/*
*
*回报表格设置
* */
public class ReturnTable {
    /*id	int(11)
pinfoid	int(11)
return_type	varchar(20)
amount	double(10,2)
return_content	varchar(20)
explain	varchar(100)
quantities	int(11)
quota	int(11)
freight	double(10,2)
receipt	varchar(10)
return_time	varchar(20)*/
    private int  id;
    private String  entryname;
    private String  returnType;
    private double  amount;
    private String  returnContent;
    private String  explain;
    private int  quantities	;
    private int quota;
    private double  freight;
    private String  receipt	;
    private String  returnTime;

    public ReturnTable() {
    }

    public ReturnTable(String entryname, String returnType, double amount, String returnContent, String explain, int quantities, int quota, double freight, String receipt, String returnTime) {
        this.entryname = entryname;
        this.returnType = returnType;
        this.amount = amount;
        this.returnContent = returnContent;
        this.explain = explain;
        this.quantities = quantities;
        this.quota = quota;
        this.freight = freight;
        this.receipt = receipt;
        this.returnTime = returnTime;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEntryname() {
        return entryname;
    }

    public void setEntryname(String entryname) {
        this.entryname = entryname;
    }

    public String getReturnType() {
        return returnType;
    }

    public void setReturnType(String returnType) {
        this.returnType = returnType;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public String getReturnContent() {
        return returnContent;
    }

    public void setReturnContent(String returnContent) {
        this.returnContent = returnContent;
    }

    public String getExplain() {
        return explain;
    }

    public void setExplain(String explain) {
        this.explain = explain;
    }

    public int getQuantities() {
        return quantities;
    }

    public void setQuantities(int quantities) {
        this.quantities = quantities;
    }

    public int getQuota() {
        return quota;
    }

    public void setQuota(int quota) {
        this.quota = quota;
    }

    public double getFreight() {
        return freight;
    }

    public void setFreight(double freight) {
        this.freight = freight;
    }

    public String getReceipt() {
        return receipt;
    }

    public void setReceipt(String receipt) {
        this.receipt = receipt;
    }

    public String getReturnTime() {
        return returnTime;
    }

    public void setReturnTime(String returnTime) {
        this.returnTime = returnTime;
    }

    @Override
    public String toString() {
        return "ReturnTable{" +
                "id=" + id +
                ", entryname='" + entryname + '\'' +
                ", returnType='" + returnType + '\'' +
                ", amount=" + amount +
                ", returnContent='" + returnContent + '\'' +
                ", explain='" + explain + '\'' +
                ", quantities=" + quantities +
                ", quota=" + quota +
                ", freight=" + freight +
                ", receipt='" + receipt + '\'' +
                ", returnTime='" + returnTime + '\'' +
                '}';
    }
}
