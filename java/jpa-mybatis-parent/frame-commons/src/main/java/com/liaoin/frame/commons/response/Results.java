package com.liaoin.frame.commons.response;

/**
 * 响应结果工具类
 *
 * @author 张权立
 * @date 2018/10/23 14:48
 */
public class Results {

    public static Result build(int status, String message, Object data) {
        return new Result(status, message, data);
    }

    public static Result build(ResultConstants resultConstants, Object data) {
        return build(resultConstants.status, resultConstants.message, data);
    }

    public static Result ok() {
        return build(ResultConstants.OK.status, ResultConstants.OK.message, null);
    }

    public static Result ok(Object data) {
        return build(ResultConstants.OK.status, ResultConstants.OK.message, data);
    }

    public static Result ok(String message, Object data) {
        return build(ResultConstants.OK.status, message, data);
    }

    public static Result fail(String message) {
        return build(ResultConstants.FAIL.status, message, null);
    }

    public static Result fail(String message, Object data) {
        return build(ResultConstants.FAIL.status, message, data);
    }

    public static Result badRequest(String message, Object data) {
        return build(ResultConstants.BAD_REQUEST.status, message, data);
    }
}
