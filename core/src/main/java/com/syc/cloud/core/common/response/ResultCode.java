package com.syc.cloud.core.common.response;

/**
 * 默认响应类，所有返回消息需要继承这个类
 */
public interface ResultCode {

    /**
     * 系统响应码
     *
     * @return code
     */
    int getCode();

    /**
     * 默认系统响应提示，code=0时此处为空
     *
     * @return msg
     */
    String getMsg();
}
