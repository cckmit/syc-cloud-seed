package com.syc.cloud.gateway.config;

import com.syc.cloud.gateway.common.GatewayConst;
import com.syc.cloud.gateway.service.GatewayRouteService;
import lombok.AllArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;
import org.springframework.web.reactive.config.WebFluxConfigurer;
import springfox.documentation.swagger.web.SwaggerResource;
import springfox.documentation.swagger.web.SwaggerResourcesProvider;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * @author 33992
 * @since 2021/10/19
 **/
@Slf4j
@Primary
@Component
@AllArgsConstructor
public class SwaggerProvider implements SwaggerResourcesProvider, WebFluxConfigurer {

    private final GatewayRouteService gatewayRouteService;

    @Override
    public List<SwaggerResource> get() {
        List<SwaggerResource> resources = new ArrayList<>();
        gatewayRouteService.getRouteDefinitions()
                .forEach(routeDefinition -> {
                    if (!Objects.equals(GatewayConst.ROUTER_INTERCEPT_OK, routeDefinition.getMetadata().get(GatewayConst.ROUTER_INTERCEPT))) {
                        resources.add(swaggerResource(routeDefinition.getId(), "/" + routeDefinition.getId() + GatewayConst.API_URI));
                    }
                });
        log.debug("resources:{}", resources);
        return resources;
    }

    private SwaggerResource swaggerResource(String name, String location) {
        SwaggerResource swaggerResource = new SwaggerResource();
        swaggerResource.setName(name);
        swaggerResource.setLocation(location);
        swaggerResource.setSwaggerVersion("2.0");
        return swaggerResource;
    }
}
