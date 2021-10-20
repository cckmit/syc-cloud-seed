package com.syc.cloud.gateway.dao;

import com.syc.cloud.core.servlet.CommonMapper;
import com.syc.cloud.gateway.po.GatewayRoutePO;
import org.apache.ibatis.annotations.Mapper;

/**
 * @author 33992
 * @since 2021/10/19
 **/
@Mapper
public interface GatewayRouterMapper extends CommonMapper<GatewayRoutePO> {
}
