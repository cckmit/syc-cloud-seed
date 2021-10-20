package com.syc.cloud.gateway.router;

import com.syc.cloud.gateway.service.GatewayRouteService;
import org.springframework.cloud.gateway.route.RouteDefinition;
import org.springframework.cloud.gateway.route.RouteDefinitionRepository;
import org.springframework.stereotype.Component;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

/**
 * @author 33992
 * @since 2021/10/19
 **/
@Component
public class RouteRepository implements RouteDefinitionRepository {

    private final GatewayRouteService gatewayRouteService;

    public RouteRepository(GatewayRouteService gatewayRouteService) {
        this.gatewayRouteService = gatewayRouteService;
    }

    @Override
    public Flux<RouteDefinition> getRouteDefinitions() {
        return Flux.fromIterable(gatewayRouteService.getRouteDefinitions());
    }

    @Override
    public Mono<Void> save(Mono<RouteDefinition> route) {
        return route.flatMap(routeDefinition -> {
            gatewayRouteService.saveRouter(routeDefinition);
            return Mono.empty();
        });
    }

    @Override
    public Mono<Void> delete(Mono<String> routeId) {
        return routeId.flatMap(id -> {
            gatewayRouteService.removeRouter(id);
            return Mono.empty();
        });
    }
}
