package com.power.bank.dto;

public class NewsDto {

    /**
     * 新闻标题
     */
    private String title;

    /**
     * 新闻内容
     */
    private String content;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    @Override
    public String toString() {
        return "NewsDto{" +
                "title='" + title + '\'' +
                ", content='" + content + '\'' +
                '}';
    }
}
