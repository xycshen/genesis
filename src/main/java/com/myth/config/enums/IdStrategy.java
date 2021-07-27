package com.myth.config.enums;

/**
 * @author xuyucheng
 * @Date 2021/7/22
 * @Description ID生成策略
 */
public enum IdStrategy {
    auto("AUTO"), id_worker("ID_WORKER"), uuid("UUID"), input("INPUT");

    private String value;

    IdStrategy(String value) {
        this.value = value;
    }

    public String getValue() {
        return value;
    }
}
