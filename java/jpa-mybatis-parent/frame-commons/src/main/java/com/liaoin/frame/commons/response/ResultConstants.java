package com.liaoin.frame.commons.response;

/**
 * 响应结果常量
 *
 * @author 张权立
 * @date 2018/10/25
 */
public enum ResultConstants {
    /**
     * 成功
     */
    OK(0, "成功"),

    /**
     * 失败
     */
    FAIL(1, "失败"),

    /**
     * 请求参数异常
     */
    BAD_REQUEST(2, "请求参数异常"),

    /**
     * 管理员不存在
     */
    HAVE_NOT_ADMIN(3, "管理员不存在"),

    /**
     * 密码不存在
     */
    PASSWORD_ERROR(4, "密码不正确"),

    /**
     * 请登录
     */
    PLEASE_LOGIN(5, "请登录"),

    /**
     * 权限不足
     */
    HAVE_NOT_POWER(6, "权限不足"),

    /**
     * 请完成作答再提交
     */
    PLEASE_COMPLETE_ANSWER(7, "请完成作答再提交"),

    /**
     * 您未对任何题作答
     */
    FAIL_TO_ANSWER(8, "您未对任何题作答"),

    /**
     * 绑定手机
     */
    BIND_PHONE(9, "绑定手机"),

    /**
     * token过期
     */
    EXPIRED_JWT(10, "token过期"),
    ;

    public int status;
    public String message;

    ResultConstants(int status, String message) {
        this.status = status;
        this.message = message;
    }
}
