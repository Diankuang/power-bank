package com.power.bank.entity;

import java.io.Serializable;
import java.util.Date;
import javax.persistence.*;

@Table(name = "t_news")
public class TNews implements Serializable {
    /**
     * 新闻ID，唯一
     */
    @Id
    @Column(name = "news_id")
    private String newsId;

    /**
     * 新闻标题
     */
    private String title;

    /**
     * 状态，0生效，1作废
     */
    private String status;

    /**
     * 创建时间
     */
    @Column(name = "create_time")
    private Date createTime;

    /**
     * 更新时间
     */
    @Column(name = "update_time")
    private Date updateTime;

    /**
     * 备注
     */
    private String remark;

    /**
     * 新闻内容
     */
    private byte[] content;

    private static final long serialVersionUID = 1L;

    /**
     * 获取新闻ID，唯一
     *
     * @return news_id - 新闻ID，唯一
     */
    public String getNewsId() {
        return newsId;
    }

    /**
     * 设置新闻ID，唯一
     *
     * @param newsId 新闻ID，唯一
     */
    public void setNewsId(String newsId) {
        this.newsId = newsId == null ? null : newsId.trim();
    }

    /**
     * 获取新闻标题
     *
     * @return title - 新闻标题
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置新闻标题
     *
     * @param title 新闻标题
     */
    public void setTitle(String title) {
        this.title = title == null ? null : title.trim();
    }

    /**
     * 获取状态，0生效，1作废
     *
     * @return status - 状态，0生效，1作废
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置状态，0生效，1作废
     *
     * @param status 状态，0生效，1作废
     */
    public void setStatus(String status) {
        this.status = status == null ? null : status.trim();
    }

    /**
     * 获取创建时间
     *
     * @return create_time - 创建时间
     */
    public Date getCreateTime() {
        return createTime;
    }

    /**
     * 设置创建时间
     *
     * @param createTime 创建时间
     */
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    /**
     * 获取更新时间
     *
     * @return update_time - 更新时间
     */
    public Date getUpdateTime() {
        return updateTime;
    }

    /**
     * 设置更新时间
     *
     * @param updateTime 更新时间
     */
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    /**
     * 获取备注
     *
     * @return remark - 备注
     */
    public String getRemark() {
        return remark;
    }

    /**
     * 设置备注
     *
     * @param remark 备注
     */
    public void setRemark(String remark) {
        this.remark = remark == null ? null : remark.trim();
    }

    /**
     * 获取新闻内容
     *
     * @return content - 新闻内容
     */
    public byte[] getContent() {
        return content;
    }

    /**
     * 设置新闻内容
     *
     * @param content 新闻内容
     */
    public void setContent(byte[] content) {
        this.content = content;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", newsId=").append(newsId);
        sb.append(", title=").append(title);
        sb.append(", status=").append(status);
        sb.append(", createTime=").append(createTime);
        sb.append(", updateTime=").append(updateTime);
        sb.append(", remark=").append(remark);
        sb.append(", content=").append(content);
        sb.append("]");
        return sb.toString();
    }
}