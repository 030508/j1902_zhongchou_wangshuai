package com.qf.j1902.pojo;
/*
*
* 类型标签
*
* */

import java.util.List;

public class Tag {
    /*
    * tagid	int(11)
    cateid	int(11)
    tagname	varchar(20)
    * */
    private int  tagid;
    private int  cateid;
    private String tagname;

    private List<LabelTag> labelTags;

    public Tag() {
    }

    public Tag(int cateid, String tagname, List<LabelTag> labelTags) {
        this.cateid = cateid;
        this.tagname = tagname;
        this.labelTags = labelTags;
    }

    public int getTagid() {
        return tagid;
    }

    public void setTagid(int tagid) {
        this.tagid = tagid;
    }

    public int getCateid() {
        return cateid;
    }

    public void setCateid(int cateid) {
        this.cateid = cateid;
    }

    public String getTagname() {
        return tagname;
    }

    public void setTagname(String tagname) {
        this.tagname = tagname;
    }

    public List<LabelTag> getLabelTags() {
        return labelTags;
    }

    public void setLabelTags(List<LabelTag> labelTags) {
        this.labelTags = labelTags;
    }

    @Override
    public String toString() {
        return "Tag{" +
                "tagid=" + tagid +
                ", cateid=" + cateid +
                ", tagname='" + tagname + '\'' +
                ", labelTags=" + labelTags +
                '}';
    }
}
