package com.syc.cloud.admin.controller;

import com.syc.cloud.admin.pojo.dto.AdminCompanyDTO;
import com.syc.cloud.admin.pojo.vo.AdminCompanyVO;
import com.syc.cloud.admin.pojo.vo.LogWelcomeSpeechVO;
import com.syc.cloud.admin.pojo.vo.ModuleSettingVO;
import com.syc.cloud.admin.service.ConfigService;
import com.syc.cloud.core.common.response.Result;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 33992
 * @since 2021/10/24
 **/
@RestController
@Api("系统配置接口")
@RequestMapping("/admin")
public class ConfigController {

    private final ConfigService configService;

    @Autowired
    public ConfigController(ConfigService configService) {
        this.configService = configService;
    }

    @PostMapping("/company/config")
    @ApiOperation("设置企业配置")
    public Result<Void> setAdminConfig(@RequestBody AdminCompanyDTO company) {
        configService.setAdminConfig(company);
        return Result.ok();
    }

    @GetMapping("/company/config")
    @ApiOperation(value = "查询企业配置")
    public Result<AdminCompanyVO> queryAdminConfig() {
        return Result.ok(configService.queryAdminConfig());
    }

    @GetMapping("/header/model/sort")
    @ApiOperation("头部菜单排序")
    public Result<List<String>> queryHeaderModelSort() {
        return Result.ok(new ArrayList<>());
    }

    @PostMapping("/header/model/sort")
    @ApiOperation("头部菜单排序设置")
    public Result<Void> setHeaderModelSort(@RequestBody List<String> list) {
        return Result.ok();
    }

    @ApiOperation(value = "查询企业模块配置")
    @GetMapping("/module/setting")
    public Result<List<ModuleSettingVO>> queryModuleSetting() {
        return Result.ok(new ArrayList<>());
    }

    @ApiOperation(value = "设置企业模块")
    @PostMapping("/module/setting")
    public Result<Void> setModuleSetting(@Valid @RequestBody ModuleSettingVO setting) {
        return Result.ok();
    }

    @ApiOperation(value = "设置日志欢迎语")
    @PostMapping("/log/welcome/speech")
    public Result<Void> setLogWelcomeSpeech(@Valid @RequestBody List<String> stringList) {
        return Result.ok();
    }

    @ApiOperation(value = "获取日志欢迎语")
    @GetMapping("/log/welcome/speech")
    public Result<List<LogWelcomeSpeechVO>> getLogWelcomeSpeechList() {
        return Result.ok(new ArrayList<>());
    }

    @ApiOperation(value = "删除配置数据")
    @DeleteMapping("/setting")
    public Result<Void> deleteConfigById(Integer settingId) {
        return Result.ok();
    }
}
