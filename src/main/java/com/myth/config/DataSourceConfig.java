package com.myth.config;

import com.myth.config.enums.DbType;
import org.apache.maven.plugins.annotations.Parameter;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 * @author xuyucheng
 * @Date 2021/7/22
 * @Description 数据库配置
 */
public class DataSourceConfig {
    /**
     * 数据库类型
     */
    @Parameter
    private DbType dbType;
    /**
     * 驱动连接的URL
     */
    @Parameter(required = true)
    private String url;
    /**
     * 驱动名称
     */
    @Parameter(required = true)
    private String driverName;
    /**
     * 数据库连接用户名
     */
    @Parameter(required = true)
    private String username;
    /**
     * 数据库连接密码
     */
    @Parameter(required = true)
    private String password;

    /**
     * 判断数据库类型
     *
     * @return 类型枚举值
     */
    public DbType getDbType() {
        if (null == dbType) {
            if (driverName.contains("mysql")) {
                dbType = DbType.MYSQL;
            } else if (driverName.contains("oracle")) {
                dbType = DbType.ORACLE;
            }
        }
        return dbType;
    }

    /**
     * 创建数据库连接对象
     *
     * @return Connection
     */
    public Connection getConn() {
        Connection conn = null;
        try {
            Class.forName(driverName);
            conn = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    public String getUrl() {
        return url;
    }

    public String getDriverName() {
        return driverName;
    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;
    }
}
