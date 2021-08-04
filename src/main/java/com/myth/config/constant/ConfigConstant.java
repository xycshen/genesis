package com.myth.config.constant;


import com.myth.config.PackageConfig;
import com.myth.config.TemplateConfig;
import com.myth.util.PackageUtils;

import java.io.File;

/**
 * @author xuyucheng
 * @Date 2021/7/22
 * @Description 常量的配置
 */
public class ConfigConstant {
    /**
     * vm中的包名
     */
    private String packageInfoKey;
    /**
     * 文件path的key
     */
    private String pathInfoKey;
    /**
     * class文件的生成规则
     */
    private String outputFilesRuleValue;
    /**
     * 包的路径
     */
    private String packageValue;
    /**
     * 模板路径
     */
    private String templatePath;

    /**
     * 独立的覆盖开关
     */
    private Boolean fileOverride = true;


    /**
     * 初始化常量数据
     *
     * @param config
     * @param template
     */
    public static void initConstant(PackageConfig config, TemplateConfig template) {
        ConfigConstant constant = new ConfigConstant("Entity", "entity_path", File.separator + "%s.java", PackageUtils.joinPackage(config.getParent(), config.getEntity()), template.getEntity());
        ConstVal.configConstantList.add(constant);
        constant=new ConfigConstant("Repository","repository_path",File.separator+"%sRepository.java",PackageUtils.joinPackage(config.getParent(),config.getRepository()),template.getRepository());
        ConstVal.configConstantList.add(constant);
        constant = new ConfigConstant("Service", "serivce_path", File.separator + "I%sService.java", PackageUtils.joinPackage(config.getParent(), config.getService()), template.getService());
        ConstVal.configConstantList.add(constant);
        constant = new ConfigConstant("ServiceImpl", "serviceimpl_path", File.separator + "%sServiceImpl.java", PackageUtils.joinPackage(config.getParent(), config.getServiceImpl()), template.getServiceImpl());
        ConstVal.configConstantList.add(constant);
        constant = new ConfigConstant("Controller", "controller_path", File.separator + "%sController.java", PackageUtils.joinPackage(config.getParent(), config.getController()), template.getController());
        ConstVal.configConstantList.add(constant);
        constant = new ConfigConstant("ResultCodeEnum", "result_code_enum", File.separator + "ResultCodeEnum.java", PackageUtils.joinPackage(config.getParent(), "enums"), ConstVal.TEMPLATE_RESULT_CODE_ENUM);
        ConstVal.configConstantList.add(constant);
        constant = new ConfigConstant("ResultModel", "result_model", File.separator + "ResultModel.java", PackageUtils.joinPackage(config.getParent(), "result"), ConstVal.TEMPLATE_RESULT_MODEL);
        ConstVal.configConstantList.add(constant);
        constant = new ConfigConstant("ExceptionAdvice", "exception_advice", File.separator + "ExceptionAdvice.java", PackageUtils.joinPackage(config.getParent(), "result"), ConstVal.TEMPLATE_EXCEPTION_ADVICE);
        ConstVal.configConstantList.add(constant);
        constant = new ConfigConstant("Bootstrap", "bootstrap", File.separator + "Bootstrap.java", config.getParent(), ConstVal.TEMPLATE_BOOTSTRAP);
        ConstVal.configConstantList.add(constant);
        constant = new ConfigConstant("Config", "web_mvc_config", File.separator + "WebMvcConfig.java", PackageUtils.joinPackage(config.getParent(), "config"), ConstVal.TEMPLATE_WEB_MVC_CONFIG);
        ConstVal.configConstantList.add(constant);
        constant = new ConfigConstant("SwaggerConfig", "swagger_config", File.separator + "SwaggerConfig.java", PackageUtils.joinPackage(config.getParent(), "config.swagger"), ConstVal.TEMPLATE_SWAGGER_CONFIG);
        ConstVal.configConstantList.add(constant);
        constant = new ConfigConstant("EntityVO", "vo_path", File.separator + "%sVO.java", PackageUtils.joinPackage(config.getParent(), "vo"), ConstVal.TEMPLATE_ENTITY_VO);
        ConstVal.configConstantList.add(constant);
        constant = new ConfigConstant("SaveEntityVO", "vo_path", File.separator + "Save%sVO.java", PackageUtils.joinPackage(config.getParent(), "vo"), ConstVal.TEMPLATE_SAVE_ENTITY_VO);
        ConstVal.configConstantList.add(constant);
        constant = new ConfigConstant("UpdateEntityVO", "vo_path", File.separator + "Update%sVO.java", PackageUtils.joinPackage(config.getParent(), "vo"), ConstVal.TEMPLATE_UPDATE_ENTITY_VO);
        ConstVal.configConstantList.add(constant);
        constant = new ConfigConstant("Utils", "utils_path", File.separator + "SnowFlake.java", PackageUtils.joinPackage(config.getParent(), "utils"), ConstVal.TEMPLATE_SNOW_FLAKE);
        ConstVal.configConstantList.add(constant);
        constant = new ConfigConstant("IDGenerator", "utils_path", File.separator + "DefaultIDGenerator.java", PackageUtils.joinPackage(config.getParent(), "utils"), ConstVal.TEMPLATE_DEFAULT_ID_GENERATOR);
        ConstVal.configConstantList.add(constant);
        constant = new ConfigConstant("application.properties", ConstVal.APPLICATION, File.separator + "application.properties", "", ConstVal.TEMPLATE_APPLICATION_PROPERTIES);
        ConstVal.configConstantList.add(constant);
    }


    public ConfigConstant(String packageInfoKey, String pathInfoKey, String outputFilesRuleValue, String packageValue, String templatePath) {
        this.packageInfoKey = packageInfoKey;
        this.pathInfoKey = pathInfoKey;
        this.outputFilesRuleValue = outputFilesRuleValue;
        this.packageValue = packageValue;
        this.templatePath = templatePath;
    }

    public String getPackageInfoKey() {
        return packageInfoKey;
    }

    public String getPathInfoKey() {
        return pathInfoKey;
    }

    public String getOutputFilesRuleValue() {
        return outputFilesRuleValue;
    }

    public String getPackageValue() {
        return packageValue;
    }

    public String getTemplatePath() {
        return templatePath;
    }

    public Boolean getFileOverride() {
        return fileOverride;
    }

    public void setFileOverride(Boolean fileOverride) {
        this.fileOverride = fileOverride;
    }
}
