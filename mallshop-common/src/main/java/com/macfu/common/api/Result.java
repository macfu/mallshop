package com.macfu.common.api;

import lombok.Data;

@Data
public class Result<T> {
    private long code;
    private String message;
    private T data;

    protected Result() {

    }

    protected Result(long code, String message, T data) {
        this.code = code;
        this.message = message;
        this.data = data;
    }

    /**
     * 成功返回结果
     * @param data
     * @return
     */
    public static <T> Result<T> success(T data) {
        return new Result<T>(ResultCode.SUCCESS.getCode(), ResultCode.SUCCESS.getMessage(), data);
    }

    /**
     * 成功返回结果
     * @param data
     * @return
     */
    public static <T> Result<T> success(T data, String message) {
        return new Result<T>(ResultCode.SUCCESS.getCode(), message, data);
    }

    /**
     * 失败返回结果
     * @param errorCode
     * @param <T>
     * @return
     */
    public static <T> Result<T> failed(IErrorCode errorCode) {
        return new Result<>(errorCode.getCode(), errorCode.getMessage(), null);
    }

    public static <T> Result<T> failed(String message) {
        return new Result<>(ResultCode.FAILED.getCode(), message, null);
    }

    public static <T> Result<T> failed() {
        return failed(ResultCode.FAILED);
    }

    public static <T> Result<T> validateFailed() {
        return failed(ResultCode.VALIDATE_FAILED);
    }

    public static <T> Result<T> validateFailed(String message) {
        return new Result<>(ResultCode.VALIDATE_FAILED.getCode(), message, null);
    }

    public static <T> Result<T> unauthorized(T data) {
        return new Result<>(ResultCode.UNAUTHORIZED.getCode(), ResultCode.UNAUTHORIZED.getMessage(), data);
    }

    public static <T> Result<T> forbidded(T data) {
        return new Result<>(ResultCode.FORBIDDEN.getCode(), ResultCode.FORBIDDEN.getMessage(), data);
    }
}
