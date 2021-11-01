package com.syc.cloud.admin.controller;

import com.syc.cloud.admin.pojo.vo.MenuVO;
import com.syc.cloud.core.common.response.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 33992
 * @since 2021/10/21
 **/
@RestController
@RequestMapping("/admin/menu")
@Api(tags = "菜单模块")
public class MenuController {

    @RequestMapping("/{type}")
    @ApiOperation("根据类型查询菜单")
    public Result<MenuVO> getMenusByType(@PathVariable("type") Integer type) {
        return Result.ok(new MenuVO());
    }
}
