package com.myth.config;

import org.apache.commons.lang.StringUtils;
import org.apache.maven.plugins.annotations.Parameter;

/**
 * @author xuyucheng
 * @Date 2021/7/22
 * @Description 跟包相关的配置项
 */
public class PackageConfig {
    /**
     * 父包名。如果为空，将下面子包名必须写全部， 否则就只需写子包名
     */
    @Parameter
    private String parent;

    /**
     * 父包模块名
     */
    private String moduleName;

    /**
     * Entity包名
     */
    @Parameter(defaultValue = "entity")
    private String entity;

    /**
     *Repository包名
     */
    @Parameter(defaultValue = "repository")
    private String repository;

    /**
     * Service包名
     */
    @Parameter(defaultValue = "service")
    private String service;

    /**
     * Service Impl包名
     */
    @Parameter(defaultValue = "service.impl")
    private String serviceImpl;

    /**
     * Controller包名
     */
    @Parameter(defaultValue = "controller")
    private String controller;

    public String getParent() {
        if (moduleName != null && !"".equals(moduleName.trim())) {
            return parent + "." + moduleName;
        }
        return parent;
    }

    public String getModuleName() {
        return moduleName;
    }

    public String getEntity() {
        return entity;
    }

    public String getRepository() {
        return repository;
    }

    public String getService() {
        return service;
    }

    public String getServiceImpl() {
        return serviceImpl;
    }

    public String getController() {
        if(StringUtils.isEmpty(controller)){
            return "controller";
        }
        return controller;
    }
}
