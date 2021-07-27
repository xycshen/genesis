package com.myth.config.constant;

import java.nio.charset.Charset;
import java.util.ArrayList;
import java.util.List;

/**
 * @author xuyucheng
 * @Date 2021/7/22
 * @Description 定义常量
 */
public class ConstVal {
    public static List<ConfigConstant> configConstantList = new ArrayList<ConfigConstant>();

    /**
     * 实体包名的KEY 查询配置的key名
     */
    public static final String PARENT = "Parent";
    public static final String MODULENAME = "ModuleName";

    public static final String REPOSITORY = "Repository";
    public static final String SERIVCE = "Service";
    public static final String SERVICEIMPL = "ServiceImpl";
    public static final String CONTROLLER = "Controller";
    public static final String APPLICATION = "Application";

    /**
     * Java输入输出临时路径
     */
    public static final String JAVA_TMPDIR = "java.io.tmpdir";
    public static final String UTF8 = Charset.forName("UTF-8").name();
    public static final String UNDERLINE = "_";
    public static final String PROPERTIES_PATH = "src/main/resources";


    public static final String TEMPLATE_ENTITY = "/template/entity.java.vm";
    public static final String TEMPLATE_REPOSITORY = "/template/repository.java.vm";
    public static final String TEMPLATE_SERVICE = "/template/service.java.vm";
    public static final String TEMPLATE_SERVICEIMPL = "/template/serviceImpl.java.vm";
    public static final String TEMPLATE_CONTROLLER = "/template/controller.java.vm";
    public static final String TEMPLATE_RESULT_CODE_ENUM = "/template/result_code_enum.java.vm";
    public static final String TEMPLATE_RESULT_MODEL = "/template/result_model.java.vm";
    public static final String TEMPLATE_EXCEPTION_ADVICE = "/template/exception_advice.java.vm";
    public static final String TEMPLATE_BOOTSTRAP = "/template/bootstrap.java.vm";
    public static final String TEMPLATE_APPLICATION_PROPERTIES = "/template/application.properties.vm";


    /**
     * 配置使用classloader加载资源
     */
    public static final String VM_LOADPATH_KEY = "file.resource.loader.class";
    public static final String VM_LOADPATH_VALUE = "org.apache.velocity.runtime.resource.loader.ClasspathResourceLoader";
}
