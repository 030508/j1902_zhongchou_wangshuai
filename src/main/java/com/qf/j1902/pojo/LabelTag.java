package com.qf.j1902.pojo;

import java.util.List;

/*
*
* 产品标签
* */
public class LabelTag {
   /* labelid	int(11)
    tagid	int(11)
    labelname	varchar(20)*/

   private int labelId;
    private int tagid;
    private String labelname;
    private List<PinfoLabel> pinfoLabels;

    public LabelTag() {
    }

    public LabelTag(int tagid, String labelname) {
        this.tagid = tagid;
        this.labelname = labelname;
    }

    public int getLabelId() {
        return labelId;
    }

    public void setLabelId(int labelId) {
        this.labelId = labelId;
    }

    public int getTagid() {
        return tagid;
    }

    public void setTagid(int tagid) {
        this.tagid = tagid;
    }

    public String getLabelname() {
        return labelname;
    }

    public void setLabelname(String labelname) {
        this.labelname = labelname;
    }

    public List<PinfoLabel> getPinfoLabels() {
        return pinfoLabels;
    }

    public void setPinfoLabels(List<PinfoLabel> pinfoLabels) {
        this.pinfoLabels = pinfoLabels;
    }

    @Override
    public String toString() {
        return "LabelTag{" +
                "labelId=" + labelId +
                ", tagid=" + tagid +
                ", labelname='" + labelname + '\'' +
                ", pinfoLabels=" + pinfoLabels +
                '}';
    }
}
