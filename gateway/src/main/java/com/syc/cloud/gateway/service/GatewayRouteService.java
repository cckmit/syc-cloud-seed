package com.syc.cloud.gateway.service;

import com.syc.cloud.core.servlet.BaseService;
import com.syc.cloud.gateway.po.GatewayRoutePO;
import org.springframework.cloud.gateway.route.RouteDefinition;

import java.util.Collection;

/**
 * @author 33992
 * @since 2021/10/19
 **/
public interface GatewayRouteService extends BaseService<GatewayRoutePO> {

    /**
     * 删除路由
     * @param routerId 路由ID
     */
    void removeRouter(String routerId);

    /**
     * 新增路由
     * @param routeDefinition 路由对象
     */
    void saveRouter(RouteDefinition routeDefinition);

    /**
     * 获取router列表
     */
    Collection<RouteDefinition> getRouteDefinitions();

    /**
     * 从数据库重载配置
     */
    void loadConfig();
}
