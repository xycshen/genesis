package com.myth.config;

import com.myth.config.constant.ConstVal;
import org.apache.commons.lang.StringUtils;
import org.apache.maven.plugins.annotations.Parameter;

/**
 * @author xuyucheng
 * @Date 2021/7/22
 * @Description 模板路径配置项
 */
public class TemplateConfig {
    @Parameter(defaultValue = ConstVal.TEMPLATE_ENTITY)
    private String entity;

    @Parameter(defaultValue = ConstVal.TEMPLATE_REPOSITORY)
    private String repository;

    @Parameter(defaultValue = ConstVal.TEMPLATE_SERVICE)
    private String service;

    @Parameter(defaultValue = ConstVal.TEMPLATE_SERVICEIMPL)
    private String serviceImpl;

    @Parameter(defaultValue = ConstVal.TEMPLATE_CONTROLLER)
    private String controller;

    public String getEntity() {
        if (entity == null) {
            return ConstVal.TEMPLATE_ENTITY;
        }
        return entity;
    }

    public String getRepository() {
        if (repository == null) {
            return ConstVal.TEMPLATE_REPOSITORY;
        }
        return repository;
    }

    public String getService() {
        if (service == null) {
            return ConstVal.TEMPLATE_SERVICE;
        }
        return service;
    }

    public String getServiceImpl() {
        if (serviceImpl == null) {
            return ConstVal.TEMPLATE_SERVICEIMPL;
        }
        return serviceImpl;
    }

    public String getController() {
        if (controller == null) {
            return ConstVal.TEMPLATE_CONTROLLER;
        }
        return controller;
    }
}
