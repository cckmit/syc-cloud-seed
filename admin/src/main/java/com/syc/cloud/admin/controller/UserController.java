package com.syc.cloud.admin.controller;

import com.syc.cloud.admin.pojo.dto.AdminUserDTO;
import com.syc.cloud.admin.pojo.dto.UserDeptDTO;
import com.syc.cloud.admin.pojo.vo.AdminUserVO;
import com.syc.cloud.core.common.response.Result;
import com.syc.cloud.core.entity.UserInfo;
import com.syc.cloud.core.pojo.vo.PageVO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.validation.constraints.NotNull;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 33992
 * @since 2021/10/21
 **/
@RestController
@Api(tags = "员工管理相关接口")
@RequestMapping("/admin/user")
public class UserController {

    @PutMapping
    @ApiOperation("更新用户信息")
    public Result<Void> update(@RequestBody AdminUserVO user) {
        return Result.ok();
    }

    @PutMapping("/dept")
    @ApiOperation("批量修改用户部门")
    public Result<Void> updateDeptUser(@RequestBody UserDeptDTO dto) {
        return Result.ok();
    }

    @PostMapping
    @ApiOperation("新增用户")
    public Result<Void> add(@RequestBody AdminUserVO user) {
        return Result.ok();
    }

    @PutMapping("/account")
    @ApiOperation("重置登录账号")
    public Result<Void> resetAccount() {
        return Result.ok();
    }

    @PutMapping("/status")
    @ApiOperation("禁用启用用户")
    public Result<Void> setUserStatus() {
        return Result.ok();
    }

    @PutMapping("/activate")
    @ApiOperation("激活账号")
    public Result<Void> activateUser() {
        return Result.ok();
    }

    @PutMapping("/reset/pwd")
    @ApiOperation("重置密码")
    public Result<Void> resetPassword() {
        return Result.ok();
    }

    @PutMapping("/pwd")
    @ApiOperation("修改密码")
    public Result<Void> updatePassword() {
        return Result.ok();
    }

    @GetMapping("/by-username")
    @ApiOperation("通过 username 查询用户")
    public Result<Object> findByUsername(String username) {
        return Result.ok("");
    }

    @GetMapping("/page")
    @ApiOperation("通过条件分页查询员工列表")
    public Result<PageVO<AdminUserVO>> queryUserList(AdminUserDTO dto) {
        return Result.ok(new PageVO<>());
    }

    @GetMapping("/by-label")
    @ApiOperation("根据状态查询员工认数")
    public Result<Void> countUserByLabel() {
        return Result.ok();
    }

    @GetMapping("/ids/by-type")
    @ApiOperation("根据类型查询角色主键")
    public Result<List<Long>> queryUserIds(@RequestParam(value = "type", required = false) Integer type) {
        return Result.ok(new ArrayList<>());
    }

    @GetMapping("/all")
    @ApiOperation("查询所有用户信息")
    public Result<List<UserInfo>> queryAllUsers() {
        return Result.ok(new ArrayList<>());
    }

    @GetMapping("/current")
    @ApiOperation("查询当前登录用户")
    public Result<AdminUserVO> queryCurrentUser() {
        return Result.ok(new AdminUserVO());
    }

    @GetMapping("/role-ids")
    @ApiOperation("查询用户下的角色列表")
    public Result<List<Integer>> queryUserRoles(@RequestParam("userId") @NotNull Long userId) {
        return Result.ok(new ArrayList<>());
    }

    @GetMapping("/child/user-ids")
    @ApiOperation("根据用户ID下的子用户")
    public Result<List<Long>> queryChildUserIds(@NotNull Long userId) {
        return Result.ok(new ArrayList<>());
    }

    @GetMapping("/by-id")
    @ApiOperation("根据主键查询用户信息")
    public Result<AdminUserVO> queryUserById(@RequestParam("userId") @NotNull Long userId) {
        return Result.ok(new AdminUserVO());
    }
}
