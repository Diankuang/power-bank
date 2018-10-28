package com.power.bank.dto;

import com.power.bank.utils.Page;

public class QueryTemDto extends Page {

    private String type;

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "QueryTemDto{" +
                "type='" + type + '\'' +
                '}';
    }
}
