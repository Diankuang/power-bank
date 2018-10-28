package com.power.bank.dto;

public class PictureDto {

    private String picture;

    private Integer orderNo;

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    @Override
    public String toString() {
        return "PictureDto{" +
                "picture='" + picture + '\'' +
                ", orderNo=" + orderNo +
                '}';
    }
}
