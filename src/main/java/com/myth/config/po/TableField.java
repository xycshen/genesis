package com.myth.config.po;

/**
 * @author xuyucheng
 * @Date 2021/7/22
 * @Description 字段信息
 */
public class TableField {
    private boolean keyFlag;

    /**
     * 表的数据库列名
     */
    private String name;
    private String type;
    private String propertyName;
    private String propertyType;
    private String comment;

    /**
     * 全部大写的表列名
     */
    private String nameUp;

    /**
     * Getter method for property <tt>nameUp</tt>.
     *
     * @return property value of nameUp
     */
    public String getNameUp() {
        return name.toUpperCase();
    }

    public boolean isKeyFlag() {
        return keyFlag;
    }

    public void setKeyFlag(boolean keyFlag) {
        this.keyFlag = keyFlag;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getPropertyName() {
        return propertyName;
    }

    public void setPropertyName(String propertyName) {
        this.propertyName = propertyName;
    }

    public String getPropertyType() {
        return propertyType;
    }

    public void setPropertyType(String propertyType) {
        this.propertyType = propertyType;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public boolean isConvert() {
        return !name.equals(propertyName);
    }

    public String getCapitalName() {
        return propertyName.substring(0, 1).toUpperCase() + propertyName.substring(1);
    }
}
