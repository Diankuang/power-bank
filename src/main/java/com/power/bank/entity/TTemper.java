package com.power.bank.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_temper")
public class TTemper implements Serializable {
    @Id
    private String id;

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

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    private String remark;

    /**
     * 产品介绍
     */
    private String introductions;

    @Transient
    private String picture;

    private static final long serialVersionUID = 1L;

    public String getPicture() {
        return picture;
    }

    public void setPicture(String picture) {
        this.picture = picture;
    }

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
     * 获取名称
     *
     * @return name - 名称
     */
    public String getName() {
        return name;
    }

    /**
     * 设置名称
     *
     * @param name 名称
     */
    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    /**
     * 获取适用型号
     *
     * @return adapter - 适用型号
     */
    public String getAdapter() {
        return adapter;
    }

    /**
     * 设置适用型号
     *
     * @param adapter 适用型号
     */
    public void setAdapter(String adapter) {
        this.adapter = adapter == null ? null : adapter.trim();
    }

    /**
     * 获取手机膜类别，1 iPhone,2 Huawei,3 Samsung,4 oppo,5 vivo,6 others
     *
     * @return type - 手机膜类别，1 iPhone,2 Huawei,3 Samsung,4 oppo,5 vivo,6 others
     */
    public Integer getType() {
        return type;
    }

    /**
     * 设置手机膜类别，1 iPhone,2 Huawei,3 Samsung,4 oppo,5 vivo,6 others
     *
     * @param type 手机膜类别，1 iPhone,2 Huawei,3 Samsung,4 oppo,5 vivo,6 others
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * @return price
     */
    public Double getPrice() {
        return price;
    }

    /**
     * @param price
     */
    public void setPrice(Double price) {
        this.price = price;
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
     * 获取产品介绍
     *
     * @return introductions - 产品介绍
     */
    public String getIntroductions() {
        return introductions;
    }

    /**
     * 设置产品介绍
     *
     * @param introductions 产品介绍
     */
    public void setIntroductions(String introductions) {
        this.introductions = introductions == null ? null : introductions.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", name=").append(name);
        sb.append(", adapter=").append(adapter);
        sb.append(", type=").append(type);
        sb.append(", price=").append(price);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", remark=").append(remark);
        sb.append(", introductions=").append(introductions);
        sb.append("]");
        return sb.toString();
    }
}