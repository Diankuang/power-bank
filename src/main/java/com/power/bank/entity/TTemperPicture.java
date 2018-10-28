package com.power.bank.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_temper_picture")
public class TTemperPicture implements Serializable {
    @Id
    private String id;

    /**
     * 手机膜编号
     */
    @Column(name = "temper_id")
    private String temperId;

    private String picture;

    /**
     * 类型
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
     * 获取手机膜编号
     *
     * @return temper_id - 手机膜编号
     */
    public String getTemperId() {
        return temperId;
    }

    /**
     * 设置手机膜编号
     *
     * @param temperId 手机膜编号
     */
    public void setTemperId(String temperId) {
        this.temperId = temperId == null ? null : temperId.trim();
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
     * 获取类型
     *
     * @return type - 类型
     */
    public String getType() {
        return type;
    }

    /**
     * 设置类型
     *
     * @param type 类型
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
        sb.append(", temperId=").append(temperId);
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