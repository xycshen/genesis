package com.myth.config.enums;

/**
 * @author xuyucheng
 * @Date 2021/7/22
 * @Description 数据库类型定义
 */
public enum  DbType {
    MYSQL("mysql"), ORACLE("oracle");

    private String value;

    DbType(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
