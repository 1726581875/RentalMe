package com.util;

public class Result {
    public static String SUCCESS_CODE = "success";
    public static String FAIL_CODE = "fail";

    String status;
    String msg;
    Object data;

    private Result(String status, String msg, Object data) {
        this.status = status;
        this.msg = msg;
        this.data = data;
    }

    public static Result success() {
        return new Result(SUCCESS_CODE, null, null);
    }

    public static Result success(String msg) {
        return new Result(SUCCESS_CODE, msg, null);
    }

    public static Result success(Object data) {
        return new Result(SUCCESS_CODE, "", data);
    }

    public static Result fail(String msg) {
        return new Result(FAIL_CODE, msg, null);
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

}
