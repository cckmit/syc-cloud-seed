package com.syc.cloud.admin.controller;

import com.syc.cloud.admin.pojo.dto.AdminRoleDTO;
import com.syc.cloud.admin.pojo.vo.AdminRoleVO;
import com.syc.cloud.core.common.response.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author 33992
 * @since 2021/10/21
 **/
@RestController
@RequestMapping("/admin/role")
@Api(tags = "角色模块")
public class RoleController {

    @PostMapping
    @ApiOperation("添加角色")
    public Result<Void> add() {
        return Result.ok();
    }

    @PutMapping
    @ApiOperation("修改角色")
    public Result<Void> update() {
        return Result.ok();
    }

    @DeleteMapping
    @ApiOperation("删除角色")
    public Result<Void> delete() {
        return Result.ok();
    }

    @PostMapping("/copy")
    @ApiOperation("复制角色")
    public Result<Void> copy(@RequestParam("roleId") Integer roleId) {
        return Result.ok();
    }

    @PostMapping("/related/dept/user")
    @ApiOperation("角色关联员工部门")
    public Result<Void> relatedDeptUser(@RequestBody AdminRoleDTO adminRoleDTO) {
        return Result.ok();
    }

    @PostMapping("/related/user")
    @ApiOperation("角色关联员工")
    public Result<Void> relatedUser(@RequestBody AdminRoleDTO adminRoleDTO) {
        return Result.ok();
    }

    @GetMapping("/unbind/user")
    @ApiOperation("取消角色关联员工")
    public Result<Void> unbindUser(@RequestParam("userId") Long userId, @RequestParam("roleId") Integer roleId) {
        return Result.ok();
    }

    @PostMapping("/menu")
    @ApiOperation("保存角色菜单关系")
    public Result<Void> saveRoleMenu() {
        return Result.ok();
    }

    @GetMapping("/auth")
    @ApiOperation("角色权限")
    public Result<Object> auth() {
        return Result.ok("");
    }

    @GetMapping("/no-auth/menu")
    @ApiOperation("获取未授权的菜单")
    public Result<List<String>> queryNoAuthMenu(@RequestParam("userId") @NotNull Long userId) {
        return Result.ok(new ArrayList<>());
    }

    @GetMapping("/when/add-user")
    @ApiOperation("查询新增员工时的可查询角色")
    public Result<List<AdminRoleVO>> queryRoleWhenAddUser() {
        return Result.ok(new ArrayList<>());
    }

    @GetMapping("/all")
    @ApiOperation("全局角色查询")
    public Result<List<AdminRoleVO>> queryAllRole() {
        return Result.ok(new ArrayList<>());
    }

    @GetMapping("/types")
    @ApiOperation("获取角色类型列表")
    public Result<List<Map<String, Object>>> getRoleTypes() {
        return Result.ok(new ArrayList<>());
    }

    @GetMapping("/by-type/{type}")
    @ApiOperation("通过角色类型查询角色")
    public Result<List<AdminRoleVO>> listRoleByType(@PathVariable("type") Integer type) {
        return Result.ok(new ArrayList<>());
    }

    @GetMapping("/by-type")
    @ApiOperation("通过角色类型查询角色")
    public Result<List<Integer>> queryRoleByType(@RequestParam("type") Integer type) {
        return Result.ok(new ArrayList<>());
    }

    @GetMapping("/by/type/and/user-id")
    @ApiOperation("查询当前用户在某个模块下的角色")
    public Result<List<AdminRoleVO>> queryRoleByRoleTypeAndUserId(@RequestParam("type") Integer type) {
        return Result.ok(new ArrayList<>());
    }

    @PostMapping("/by/user-id")
    @ApiOperation("通过用户id查询角色")
    public Result<List<AdminRoleVO>> queryRoleListByUserId(@RequestBody List<Long> userIds) {
        return Result.ok(new ArrayList<>());
    }

    @GetMapping("/user-ids")
    @ApiOperation("根据角色ID查询用户列表")
    public Result<List<Long>> queryUserIdByRoleId(@RequestParam("roleId") Integer roleId) {
        return Result.ok(new ArrayList<>());
    }
}
