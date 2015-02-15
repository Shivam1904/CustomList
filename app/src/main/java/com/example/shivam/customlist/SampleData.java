package com.example.shivam.customlist;

public class SampleData {

    private String name;

    private String detail;

    public Integer imgid;

    public SampleData(Integer imgid,String name, String detail) {
        super();
        this.imgid=imgid;
        this.name = name;
        this.detail = detail;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDetail() {
        return detail;
    }

    public void setDetail(boolean selected) {
        this.detail = detail;
    }

    public Integer getId() {
        return imgid;
    }

    public void setId(Integer id) {
        this.imgid = id;
    }
}