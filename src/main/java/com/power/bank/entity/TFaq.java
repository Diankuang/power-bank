package com.power.bank.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_faq")
public class TFaq implements Serializable {
    @Id
    private String id;

    private String title;

    /**
     * 状态，0有效，1失效
     */
    private String status;

    @Column(name = "create_time")
    private Date createTime;

    @Column(name = "update_time")
    private Date updateTime;

    private String content1;

    private String content2;

    private String content3;

    private String content4;

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
     * @return content1
     */
    public String getContent1() {
        return content1;
    }

    /**
     * @param content1
     */
    public void setContent1(String content1) {
        this.content1 = content1 == null ? null : content1.trim();
    }

    /**
     * @return content2
     */
    public String getContent2() {
        return content2;
    }

    /**
     * @param content2
     */
    public void setContent2(String content2) {
        this.content2 = content2 == null ? null : content2.trim();
    }
    /**
     * @return content3
     */
    public String getContent3() {
        return content3;
    }

    /**
     * @param content3
     */
    public void setContent3(String content3) {
        this.content3 = content3 == null ? null : content3.trim();
    }
    /**
     * @return content3
     */
    public String getContent4() {
        return content4;
    }

    /**
     * @param content4
     */
    public void setContent4(String content4) {
        this.content4 = content4 == null ? null : content4.trim();
    }

    @Override
    public String toString() {
        return "TFaq{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", status='" + status + '\'' +
                ", createTime=" + createTime +
                ", updateTime=" + updateTime +
                ", content1='" + content1 + '\'' +
                ", content2='" + content2 + '\'' +
                ", content3='" + content3 + '\'' +
                ", content4='" + content4 + '\'' +
                '}';
    }
}