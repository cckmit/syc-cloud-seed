package com.syc.cloud.gateway.common;

import com.syc.cloud.core.common.Const;

/**
 * @author 33992
 * @since 2021/10/19
 **/
public class GatewayConst extends Const {

    private GatewayConst() {}

    /**
     * 路由是否要进行权限认证标识
     */
    public static final String ROUTER_INTERCEPT = "intercept";

    /**
     * 不需要进行权限认证标识
     */
    public static final Integer ROUTER_INTERCEPT_OK = 0;

    /**
     * 路由说明标识
     */
    public static final String ROUTER_DESC = "description";

    public static final String API_URI = "/v2/api-docs";
}
