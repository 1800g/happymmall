package com.mmall.util;

import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Properties;


/**
 * Create by Hugo Liao
 * Email: i@1800g.net
 * 2018/4/10 2:41
 */

public class Properties1Util {
    private static Logger logger = LoggerFactory.getLogger(Properties1Util.class);

    private static Properties props;

    static {
        String fileName = "mmall.properties";
        props = new Properties();
        try {
            props.load(new InputStreamReader(Properties1Util.class.getClassLoader().getResourceAsStream(fileName),"UTF-8"));
        } catch (IOException e) {
            logger.error("配置文件读取异常",e);
        }
    }

    public static  String getProperty(String key){
        String value = props.getProperty(key.trim());
        if (StringUtils.isBlank(value)){
            return null;
        }
        return value.trim();
    }

    public static  String getProperty(String key,String defaultValue){
        String value = props.getProperty(key.trim());
        if (StringUtils.isBlank(value)){
            return defaultValue;
        }
        return value.trim();
    }
}
