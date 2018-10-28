package com.power.bank.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_after_sale_policy_detail")
public class TAfterSalePolicyDetail implements Serializable {
    @Id
    private String id;

    /**
     * t_after_sale_policy表对应主键
     */
    @Column(name = "asp_id")
    private String aspId;

    @Column(name = "order_no")
    private Integer orderNo;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 0有效，1无效
     */
    private Integer status;

    private String remark;

    private String content;

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
     * 获取t_after_sale_policy表对应主键
     *
     * @return asp_id - t_after_sale_policy表对应主键
     */
    public String getAspId() {
        return aspId;
    }

    /**
     * 设置t_after_sale_policy表对应主键
     *
     * @param aspId t_after_sale_policy表对应主键
     */
    public void setAspId(String aspId) {
        this.aspId = aspId == null ? null : aspId.trim();
    }

    /**
     * @return order_no
     */
    public Integer getOrderNo() {
        return orderNo;
    }

    /**
     * @param orderNo
     */
    public void setOrderNo(Integer orderNo) {
        this.orderNo = orderNo;
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
     * @return content
     */
    public String getContent() {
        return content;
    }

    /**
     * @param content
     */
    public void setContent(String content) {
        this.content = content == null ? null : content.trim();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", aspId=").append(aspId);
        sb.append(", orderNo=").append(orderNo);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", status=").append(status);
        sb.append(", remark=").append(remark);
        sb.append(", content=").append(content);
        sb.append("]");
        return sb.toString();
    }
}