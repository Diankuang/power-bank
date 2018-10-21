package com.power.bank.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_factory_scene")
public class TFactoryScene implements Serializable {
    @Id
    private String id;

    @Column(name = "factory_name")
    private String factoryName;

    @Column(name = "factory_picture")
    private String factoryPicture;

    /**
     * 状态，0有效，1失效
     */
    private String status;

    private String remark;

    @Column(name = "build_time")
    private Date buildTime;

    private String source;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

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
     * @return factory_name
     */
    public String getFactoryName() {
        return factoryName;
    }

    /**
     * @param factoryName
     */
    public void setFactoryName(String factoryName) {
        this.factoryName = factoryName == null ? null : factoryName.trim();
    }

    /**
     * @return factory_picture
     */
    public String getFactoryPicture() {
        return factoryPicture;
    }

    /**
     * @param factoryPicture
     */
    public void setFactoryPicture(String factoryPicture) {
        this.factoryPicture = factoryPicture == null ? null : factoryPicture.trim();
    }

    /**
     * 获取状态，0有效，1失效
     *
     * @return status - 状态，0有效，1失效
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态，0有效，1失效
     *
     * @param status 状态，0有效，1失效
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
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
     * @return build_time
     */
    public Date getBuildTime() {
        return buildTime;
    }

    /**
     * @param buildTime
     */
    public void setBuildTime(Date buildTime) {
        this.buildTime = buildTime;
    }

    /**
     * @return source
     */
    public String getSource() {
        return source;
    }

    /**
     * @param source
     */
    public void setSource(String source) {
        this.source = source == null ? null : source.trim();
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

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", id=").append(id);
        sb.append(", factoryName=").append(factoryName);
        sb.append(", factoryPicture=").append(factoryPicture);
        sb.append(", status=").append(status);
        sb.append(", remark=").append(remark);
        sb.append(", buildTime=").append(buildTime);
        sb.append(", source=").append(source);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append("]");
        return sb.toString();
    }
}