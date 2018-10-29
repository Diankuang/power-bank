package com.power.bank.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_product_picture")
public class TProductPicture implements Serializable {
    @Id
    private String id;

    /**
     * 产品编号
     */
    @Column(name = "product_id")
    private String productId;

    private String picture;

    /**
     * 产品类型
     */
    private String type;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    private String remark;

    /**
     * 图片排序
     */
    @Column(name = "order_no")
    private Integer orderNo;

    private static final long serialVersionUID = 1L;

    /**
     * @return id
     */
    public String getId() {
        return id;
    }

    /**
     * @param id
     */
    public void setId(String id) {
        this.id = id == null ? null : id.trim();
    }

    /**
     * 获取产品编号
     *
     * @return product_id - 产品编号
     */
    public String getProductId() {
        return productId;
    }

    /**
     * 设置产品编号
     *
     * @param productId 产品编号
     */
    public void setProductId(String productId) {
        this.productId = productId == null ? null : productId.trim();
    }

    /**
     * @return picture
     */
    public String getPicture() {
        return picture;
    }

    /**
     * @param picture
     */
    public void setPicture(String picture) {
        this.picture = picture == null ? null : picture.trim();
    }

    /**
     * 获取产品类型
     *
     * @return type - 产品类型
     */
    public String getType() {
        return type;
    }

    /**
     * 设置产品类型
     *
     * @param type 产品类型
     */
    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }

    /**
     * @return create_time
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * @param createTime
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * @return update_time
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * @param updateTime
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * @return remark
     */
    public String getRemark() {
        return remark;
    }

    /**
     * @param remark
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 获取图片排序
     *
     * @return order_no - 图片排序
     */
    public Integer getOrderNo() {
        return orderNo;
    }

    /**
     * 设置图片排序
     *
     * @param orderNo 图片排序
     */
    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", productId=").append(productId);
        sb.append(", picture=").append(picture);
        sb.append(", type=").append(type);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", remark=").append(remark);
        sb.append(", orderNo=").append(orderNo);
        sb.append("]");
        return sb.toString();
    }
}