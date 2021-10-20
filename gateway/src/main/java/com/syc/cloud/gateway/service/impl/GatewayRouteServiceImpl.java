package com.syc.cloud.gateway.service.impl;

import com.alibaba.fastjson.JSON;
import com.syc.cloud.core.servlet.BaseServiceImpl;
import com.syc.cloud.gateway.common.GatewayConst;
import com.syc.cloud.gateway.dao.GatewayRouterMapper;
import com.syc.cloud.gateway.po.GatewayRoutePO;
import com.syc.cloud.gateway.service.GatewayRouteService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.gateway.filter.FilterDefinition;
import org.springframework.cloud.gateway.handler.predicate.PredicateDefinition;
import org.springframework.cloud.gateway.route.RouteDefinition;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.net.URI;
import java.util.*;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @author 33992
 * @since 2021/10/19
 **/
@Slf4j
@Service
public class GatewayRouteServiceImpl extends BaseServiceImpl<GatewayRouterMapper, GatewayRoutePO>
        implements GatewayRouteService {

    private final Map<String, RouteDefinition> routes = new ConcurrentHashMap<>();

    @Override
    public void removeRouter(String routerId) {
        routes.remove(routerId);
    }

    @Override
    public void saveRouter(RouteDefinition routeDefinition) {
        routes.put(routeDefinition.getId(), routeDefinition);
    }

    @Override
    public Collection<RouteDefinition> getRouteDefinitions() {
        return routes.values();
    }

    @Override
    @PostConstruct
    public void loadConfig() {
        List<GatewayRoutePO> routeList = list();
        routeList.forEach(router -> {
            log.info("加载路由，路由 id: {}，路由 uri: {}，路由 filters: {}，路由 predicates: {}",
                    router.getRouteId(), router.getUri(), router.getFilters(), router.getPredicates());
            RouteDefinition routeDefinition = new RouteDefinition();
            routeDefinition.setId(router.getRouteId());
            routeDefinition.setOrder(router.getOrders());
            routeDefinition.setUri(URI.create(router.getUri()));
            routeDefinition.setFilters(JSON.parseArray(router.getFilters(), FilterDefinition.class));
            routeDefinition.setPredicates(JSON.parseArray(router.getPredicates(), PredicateDefinition.class));
            Map<String, Object> metadata = new HashMap<>(6);
            metadata.put(GatewayConst.ROUTER_INTERCEPT, router.getIntercept());
            metadata.put(GatewayConst.ROUTER_DESC, router.getDescription());
            routeDefinition.setMetadata(metadata);
            routes.put(routeDefinition.getId(), routeDefinition);
        });
    }
}
