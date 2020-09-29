package com.phk.miniprogram.domain;

import java.util.List;

/**
 * 朋友圈
 */
public class Moment {
    private String avaImg;
    private String name;
    private String text;
    private Integer imgid;
    private List<String> img;
    private String address;
    private String time;

    public Integer getImgid() {
        return imgid;
    }

    public void setImgid(Integer imgid) {
        this.imgid = imgid;
    }

    public String getAvaImg() {
        return avaImg;
    }

    public void setAvaImg(String avaImg) {
        this.avaImg = avaImg;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public List<String> getImg() {
        return img;
    }

    public void setImg(List<String> img) {
        this.img = img;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        return "Moment{" +
                "avaImg='" + avaImg + '\'' +
                ", name='" + name + '\'' +
                ", text='" + text + '\'' +
                ", img=" + img +
                ", address='" + address + '\'' +
                ", time='" + time + '\'' +
                '}';
    }
}
