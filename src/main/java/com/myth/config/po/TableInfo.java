package com.myth.config.po;

import org.apache.commons.lang.StringUtils;

import java.util.List;

/**
 * @author xuyucheng
 * @Date 2021/7/22
 * @Description 表信息，关联到当前字段信息
 */
public class TableInfo {
    /**
     * 表名
     */
    private String name;
    /**
     * 表描述
     */
    private String comment;
    /**
     * 实体名（实体的Java类名）
     */
    private String entityName;

    /**
     * repository名称
     */
    private String repositoryName;
    private String serviceName;
    private String serviceImplName;
    private String controllerName;
    private String queryName;

    /**
     * 数据库表字段
     */
    private List<TableField> fields;
    /**
     * 数据库表的字段名称
     */
    private String fieldNames;

    /**
     * 是否有时间类型字段
     */
    private boolean hasDate;
    /**
     * 是否设置开启常量
     */
    private boolean entityColumnConstant = true;

    public boolean isEntityColumnConstant() {
        return entityColumnConstant;
    }

    public void setEntityColumnConstant(boolean entityColumnConstant) {
        this.entityColumnConstant = entityColumnConstant;
    }

    public String getQueryName() {
        return queryName;
    }

    public void setQueryName(String queryName) {
        this.queryName = queryName;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public String getEntityName() {
        return entityName;
    }

    public void setEntityName(String entityName) {
        this.entityName = entityName;
    }

    public String getRepositoryName() {
        return repositoryName;
    }

    public void setRepositoryName(String repositoryName) {
        this.repositoryName = repositoryName;
    }

    public String getServiceName() {
        return serviceName;
    }

    public void setServiceName(String serviceName) {
        this.serviceName = serviceName;
    }

    public String getServiceImplName() {
        return serviceImplName;
    }

    public void setServiceImplName(String serviceImplName) {
        this.serviceImplName = serviceImplName;
    }

    public String getControllerName() {
        return controllerName;
    }

    public void setControllerName(String controllerName) {
        this.controllerName = controllerName;
    }

    public List<TableField> getFields() {
        return fields;
    }

    public void setFields(List<TableField> fields) {
        this.fields = fields;
    }

    /**
     * 转换filed实体为xmlmapper中的basecolumn字符串信息
     *
     * @return
     */
    public String getFieldNames() {
        if (StringUtils.isBlank(fieldNames)) {
            StringBuilder names = new StringBuilder();
            for (int i = 0; i < fields.size(); i++) {
                TableField fd = fields.get(i);
                if (i == fields.size() - 1) {
                    names.append(cov2col(fd));
                } else {
                    names.append(cov2col(fd)).append(", ");
                }
            }
            fieldNames = names.toString();
        }
        return fieldNames;
    }

    /**
     * 判断字段中是否包含日期类型
     *
     * @return 是否
     */
    public boolean isHasDate() {
        for (TableField fieldInfo : fields) {
            if ("Date".equals(fieldInfo.getPropertyType())) {
                hasDate = true;
                break;
            }
        }
        return hasDate;
    }

    /**
     * mapper xml中的字字段添加as
     *
     * @param field 字段实体
     * @return 转换后的信息
     */
    private String cov2col(TableField field) {
        if (null != field) {
            return field.isConvert() ? "`"+field.getName()+"`" + " AS "
                    + "`"+field.getPropertyName()+"`" : "`"+field.getName()+"`";
        }
        return StringUtils.EMPTY;
    }

    /**
     * 首字母转小写
     *
     * @param name 字符串值，必须字母开头
     * @return 首字母转小写
     */
    public static String strConvertLowerCamel(String name) {
        if (name==null || "".equals(name)) {
            return "";
        }
        String at = String.valueOf(name.charAt(0)).toLowerCase();
        return at + name.substring(1);
    }
}
