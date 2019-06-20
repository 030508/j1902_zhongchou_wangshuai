package com.qf.j1902.pojo;

import java.util.List;

public class PinfoLabel {
    /*id	int(11)
pinfoid	int(11)
labelid	int(11)
labelnamelabename	varchar(10)*/
    private int id ;
    private int labelid;

    private String entryname;
    private String labelname;
    private String uname;
    private List<ProjectInfo> projectInfos;
    public PinfoLabel() {
    }

    public PinfoLabel(int labelid, String entryname, String labelname, String uname) {
        this.labelid = labelid;
        this.entryname = entryname;
        this.labelname = labelname;
        this.uname = uname;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLabelid() {
        return labelid;
    }

    public void setLabelid(int labelid) {
        this.labelid = labelid;
    }

    public String getEntryname() {
        return entryname;
    }

    public void setEntryname(String entryname) {
        this.entryname = entryname;
    }

    public String getLabelname() {
        return labelname;
    }

    public void setLabelname(String labelname) {
        this.labelname = labelname;
    }

    public String getUname() {
        return uname;
    }

    public void setUname(String uname) {
        this.uname = uname;
    }

    public List<ProjectInfo> getProjectInfos() {
        return projectInfos;
    }

    public void setProjectInfos(List<ProjectInfo> projectInfos) {
        this.projectInfos = projectInfos;
    }

    @Override
    public String toString() {
        return "PinfoLabel{" +
                "id=" + id +
                ", labelid=" + labelid +
                ", entryname='" + entryname + '\'' +
                ", labelname='" + labelname + '\'' +
                ", uname='" + uname + '\'' +
                ", projectInfos=" + projectInfos +
                '}';
    }
}
