package com.caixin.data.middle.etl.kettle.common.api.resp;

/**
 * 枚举了一些常用API操作码
 * Created by zhuzhongji on 2019/9/4.
 */
public enum ResultCode implements IErrorCode {
    SUCCESS(102000L, "操作成功"),
    FAILED(102001L, "操作失败"),
    VALIDATE_FAILED(102002L, "参数检验失败"),
    UNAUTHORIZED(102003L, "暂未登录或token已经过期"),
    FORBIDDEN(102004L, "没有相关权限");
    private Long code;
    private String message;

    ResultCode(Long code, String message) {
        this.code = code;
        this.message = message;
    }

    public Long getCode() {
        return code;
    }

    public String getMessage() {
        return message;
    }
}
