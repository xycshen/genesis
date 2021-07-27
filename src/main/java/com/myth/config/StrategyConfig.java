package com.myth.config;

import com.myth.config.constant.ConstVal;
import com.myth.config.enums.IdStrategy;
import com.myth.config.enums.NamingStrategy;
import org.apache.maven.plugins.annotations.Parameter;

/**
 * @author xuyucheng
 * @Date 2021/7/22
 * @Description 策略配置项
 */
public class StrategyConfig {
    /**
     * 数据库表映射到实体的命名策略
     */
    @Parameter(defaultValue = "nochange")
    private NamingStrategy naming;

    private NamingStrategy fieldNaming;

    /**
     * 表前缀
     */
    @Parameter(defaultValue = "")
    private String tablePrefix;

    /**
     * Entity 中的ID生成类型
     */
    @Parameter(defaultValue = "ID_WORKER")
    private IdStrategy idGenType;

    /**
     * 自定义继承的Entity类全称，带包名
     */
    @Parameter
    private String superEntityClass;

    /**
     * 自定义继承的Repository类全称，带包名
     */
    @Parameter()
    private String superRepositoryClass;

    /**
     * 自定义继承的Service类全称，带包名
     */
    @Parameter()
    private String superServiceClass;

    /**
     * 自定义继承的ServiceImpl类全称，带包名
     */
    @Parameter()
    private String superServiceImplClass;

    /**
     * 自定义继承的Controller类全称，带包名
     */
    @Parameter
    private String superControllerClass;

    /**
     * 需要包含的表名（与exclude二选一配置）
     */
    @Parameter
    private String[] include = null;

    /**
     * 需要排除的表名
     */
    @Parameter
    private String[] exclude = null;

    public NamingStrategy getNaming() {
        return naming;
    }

    public NamingStrategy getFieldNaming() {
        if (fieldNaming == null){
            return naming;
        }
        return fieldNaming;
    }

    public String getTablePrefix() {
        return tablePrefix;
    }

    public IdStrategy getIdGenType() {
        return idGenType;
    }

    public String[] getInclude() {
        return include;
    }

    public String[] getExclude() {
        return exclude;
    }

    public String getSuperServiceClass() {
        return superServiceClass;
    }

    public String getSuperEntityClass() {
        return superEntityClass;
    }

    public void setSuperEntityClass(String superEntityClass) {
        this.superEntityClass = superEntityClass;
    }

    public String getSuperRepositoryClass() {
        return superRepositoryClass;
    }

    public String getSuperServiceImplClass() {
        return superServiceImplClass;
    }

    public String getSuperControllerClass() {
        return superControllerClass;
    }
}
