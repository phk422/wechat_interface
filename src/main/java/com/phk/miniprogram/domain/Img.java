package com.phk.miniprogram.domain;

/**
 * 图片
 */
public class Img {
    private Integer id;
    private String path;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "Img{" +
                "id=" + id +
                ", path='" + path + '\'' +
                '}';
    }
}
