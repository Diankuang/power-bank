package com.power.bank.entity;

import java.io.Serializable;
import java.util.Date;
import java.util.List;
import javax.persistence.*;

@Table(name = "t_after_sale_policy")
public class TAfterSalePolicy implements Serializable {
    @Id
    private String id;

    @Column(name = "order_no")
    private Integer orderNo;

    /**
     * 0有效，1无效
     */
    private Integer status;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    private String remark;

    private String title;

    @Transient
    private List<TAfterSalePolicyDetail> detail;

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
     * 获取0有效，1无效
     *
     * @return status - 0有效，1无效
     */
    public Integer getStatus() {
        return status;
    }

    /**
     * 设置0有效，1无效
     *
     * @param status 0有效，1无效
     */
    public void setStatus(Integer status) {
        this.status = status;
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
     * @return title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    public List<TAfterSalePolicyDetail> getDetail() {
        return detail;
    }

    public void setDetail(List<TAfterSalePolicyDetail> detail) {
        this.detail = detail;
    }

    public Integer getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
    }

    @Override
    public String toString() {
        return "TAfterSalePolicy{" +
                "id='" + id + '\'' +
                ", orderNo=" + orderNo +
                ", status=" + status +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", remark='" + remark + '\'' +
                ", title='" + title + '\'' +
                ", detail=" + detail +
                '}';
    }
}