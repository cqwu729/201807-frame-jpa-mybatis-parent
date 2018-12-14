package com.liaoin.frame.commons.response;

/**
 * 响应结果封装类
 *
 * @author 张权立
 * @date 2018/10/22 16:44
 */
public class Result {

    private int status;
    private String message;
    private Object data;

    public Result() {
    }

    public Result(int status, String message, Object data) {
        this.status = status;
        this.message = message;
        this.data = data;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Result{" +
                "status=" + status +
                ", message='" + message + '\'' +
                ", data=" + data +
                '}';
    }
}
