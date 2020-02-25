package com.caixin.data.middle.etl.kettle.common.api.resp;

/**
 * 封装API的错误码
 * Created by zhuzhongji on 2019/9/4.
 */
public interface IErrorCode {
    Long getCode();

    String getMessage();
}
