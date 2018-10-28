package com.power.bank.dto;

import java.util.List;

public class TemperDto {
    /**
     * 名称
     */
    private String name;

    /**
     * 适用型号
     */
    private String adapter;

    /**
     * 手机膜类别，1 iPhone,2 Huawei,3 Samsung,4 oppo,5 vivo,6 others
     */
    private Integer type;

    private Double price;

    /**
     * 产品介绍
     */
    private String introductions;

    private List<PictureDto> picture;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdapter() {
        return adapter;
    }

    public void setAdapter(String adapter) {
        this.adapter = adapter;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getIntroductions() {
        return introductions;
    }

    public void setIntroductions(String introductions) {
        this.introductions = introductions;
    }

    public List<PictureDto> getPicture() {
        return picture;
    }

    public void setPicture(List<PictureDto> picture) {
        this.picture = picture;
    }

    @Override
    public String toString() {
        return "TemperDto{" +
                "name='" + name + '\'' +
                ", adapter='" + adapter + '\'' +
                ", type=" + type +
                ", price=" + price +
                ", introductions='" + introductions + '\'' +
                ", picture=" + picture +
                '}';
    }
}
