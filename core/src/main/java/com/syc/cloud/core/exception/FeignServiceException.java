package com.syc.cloud.core.exception;

import feign.FeignException;

/**
 * feign 异常
 * @author 33992
 * @since 2021/10/14
 **/
public class FeignServiceException extends FeignException {

    public FeignServiceException(int status, String message) {
        super(status, message);
    }
}
