package com.qf.j1902.pojo;

import java.util.List;

/*
*
* 文档注释
*
* 项目分类
* */
public class Category {
        private  int cateId;
        private  String name;
        private List<Tag> tags;

    public Category() {
    }

    public Category(String name, List<Tag> tags) {
        this.name = name;
        this.tags = tags;
    }

    @Override
    public String toString() {
        return "Category{" +
                "cateId=" + cateId +
                ", name='" + name + '\'' +
                ", tags=" + tags +
                '}';
    }

    public int getCateId() {
        return cateId;
    }

    public void setCateId(int cateId) {
        this.cateId = cateId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Tag> getTags() {
        return tags;
    }

    public void setTags(List<Tag> tags) {
        this.tags = tags;
    }
}
