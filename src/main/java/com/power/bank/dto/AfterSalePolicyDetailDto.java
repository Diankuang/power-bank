package com.power.bank.dto;

public class AfterSalePolicyDetailDto {

    private String content;

    private Integer orderNo;

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    @Override
    public String toString() {
        return "AfterSalePolicyDetailDto{" +
                "content='" + content + '\'' +
                ", orderNo=" + orderNo +
                '}';
    }
}
