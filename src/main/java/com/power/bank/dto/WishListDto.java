package com.power.bank.dto;

public class WishListDto {

    private String userId;

    private String productId;

    private Integer flag;

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    public String getProductId() {
        return productId;
    }

    public void setProductId(String productId) {
        this.productId = productId;
    }

    public Integer getFlag() {
        return flag;
    }

    public void setFlag(Integer flag) {
        this.flag = flag;
    }

    @Override
    public String toString() {
        return "WishListDto{" +
                "userId='" + userId + '\'' +
                ", productId='" + productId + '\'' +
                ", flag='" + flag + '\'' +
                '}';
    }
}
