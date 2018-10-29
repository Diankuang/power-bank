package com.power.bank.dto;

import java.util.List;

public class AfterSalePolicyDto {

    private String title;

    private Integer orderNo;

    private List<AfterSalePolicyDetailDto> content;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    public List<AfterSalePolicyDetailDto> getContent() {
        return content;
    }

    public void setContent(List<AfterSalePolicyDetailDto> content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "AfterSalePolicyDto{" +
                "title='" + title + '\'' +
                ", orderNo=" + orderNo +
                ", content=" + content +
                '}';
    }
}
