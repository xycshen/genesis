package com.myth;

import com.myth.config.DataSourceConfig;
import com.myth.config.PackageConfig;
import com.myth.config.StrategyConfig;
import com.myth.config.TemplateConfig;
import com.myth.config.builder.ConfigBuilder;
import org.apache.maven.plugin.AbstractMojo;
import org.apache.maven.plugin.logging.Log;
import org.apache.maven.plugins.annotations.Parameter;

/**
 * @author xuyucheng
 * @Date 2021/7/23
 * @Description 插件基类，用于属性配置 设计成抽象类主要是用于后期可扩展，共享参数配置
 */
public abstract class AbstractGenesisMojo extends AbstractMojo {

    protected ConfigBuilder config;

    /**
     * 日志工具
     */
    protected Log log = getLog();
    /**
     * 数据源配置
     */
    @Parameter(required = true)
    private DataSourceConfig dataSource;
    /**
     * 数据库表配置
     */
    @Parameter
    private StrategyConfig strategy;
    /**
     * 包 相关配置
     */
    @Parameter
    private PackageConfig packageInfo;
    /**
     * 模板 相关配置
     */
    @Parameter
    private TemplateConfig template;
    /**
     * 生成文件的输出目录
     */
    @Parameter
    private String outputDir;
    /**
     * 是否覆盖已有文件 - 全局的覆盖，这个开启覆盖后，独立的覆盖才会生效
     */
    @Parameter(defaultValue = "false")
    private boolean fileOverride;
    /**
     * 开发人员
     */
    @Parameter(defaultValue = "author")
    private String author;

    /**
     * 初始化配置
     */
    protected void initConfig() {
        if (null == config) {
            config = new ConfigBuilder(packageInfo, dataSource, strategy, template, outputDir);
        }
    }

    public String getOutputDir() {
        return outputDir;
    }

    public String getAuthor() {
        return author;
    }

    public boolean isFileOverride() {
        return fileOverride;
    }

    public DataSourceConfig getDataSource() {
        return dataSource;
    }
}
