package com.syc.cloud.gateway.controller;

import com.syc.cloud.core.common.response.Result;
import com.syc.cloud.gateway.service.GatewayRouteService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 33992
 * @since 2021/10/19
 **/
@RestController
@RequestMapping("/gateway")
public class GatewayRouteController {

    private final GatewayRouteService gatewayRouteService;

    public GatewayRouteController(GatewayRouteService gatewayRouteService) {
        this.gatewayRouteService = gatewayRouteService;
    }

    @GetMapping
    public Result<Void> ok() {
        return Result.ok();
    }

    @GetMapping("/reload-config")
    public Result<Void> reloadConfig() {
        gatewayRouteService.loadConfig();
        return Result.ok();
    }
}
