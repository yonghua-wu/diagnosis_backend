package com.wyhwy.diagnosis_backend;

import lombok.Data;

/**
 * http的公共相应体
 * @param <T>
 */
@Data
public class HttpResult <T> {
    private int code;
    private String msg;
    private T data;
    public HttpResult() {
        this.data = null;
        this.code = 200;
        this.msg = "success";
    }

    public HttpResult(T data) {
        this.data = data;
        this.code = 200;
        this.msg = "success";
    }

    public HttpResult(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

    public HttpResult(int code, String msg, T data) {
        this.code = code;
        this.msg = msg;
        this.data = data;
    }

    public static <T> HttpResult<T> success() {
        return new HttpResult<T>();
    }

    public static <T> HttpResult<T> success(T data) {
        return new HttpResult<T>(data);
    }

    public static <T> HttpResult<T> error(int code, String msg) {
        return new HttpResult<T>(code, msg);
    }

    public static <T> HttpResult<T> error(int code, String msg, T data) {
        return new HttpResult<T>(code, msg, data);
    }
}
