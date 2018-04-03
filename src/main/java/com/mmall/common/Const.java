package com.mmall.common;

/**
 * Create by Hugo Liao
 * Email: i@1800g.net
 * 2018/4/1 14:52
 */

public class Const {

    public static final String CURRENT_USER= "currentUser";

    public static final String EMAIL = "email";
    public static final String USERNAME = "username";

    public interface Role{
        int ROLE_CUSTOMER = 0;//普通用户
        int ROLE_ADMIN = 1;//管理员
    }
}
