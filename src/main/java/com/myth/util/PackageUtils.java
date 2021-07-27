package com.myth.util;

import org.apache.commons.lang.StringUtils;

/**
 * @author xuyucheng
 * @Date 2021/7/22
 * @Description 包工具类
 */
public class PackageUtils {

    /**
     * 连接父子包名
     *
     * @param parent     父包名
     * @param subPackage 子包名
     * @return 连接后的包名
     */
    public static String joinPackage(String parent, String subPackage) {
        if (StringUtils.isBlank(parent)) {
            return subPackage;
        }
        return parent + "." + subPackage;
    }
}
