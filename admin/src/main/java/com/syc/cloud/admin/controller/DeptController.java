package com.syc.cloud.admin.controller;

import com.syc.cloud.admin.pojo.dto.DeptDTO;
import com.syc.cloud.admin.pojo.dto.DeptQueryDTO;
import com.syc.cloud.admin.pojo.vo.DeptVO;
import com.syc.cloud.core.common.response.Result;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 33992
 * @since 2021/10/21
 **/
@RestController
@RequestMapping("/admin/dept")
public class DeptController {

    @GetMapping("/tree")
    @ApiOperation("查询部门列表树")
    public Result<List<DeptVO>> queryDeptTree(DeptQueryDTO dto) {
        return Result.ok(new ArrayList<>());
    }

    @PostMapping
    @ApiOperation("新增部门")
    public Result<Void> add(@Valid @RequestBody DeptDTO dto) {
        return Result.ok();
    }

    @PutMapping
    @ApiOperation("更新部门")
    public Result<Void> update(@Valid @RequestBody DeptDTO dto) {
        return Result.ok();
    }

    @DeleteMapping("/{id}")
    @ApiOperation("删除部门")
    public Result<Void> delete(@PathVariable("id") Integer deptId) {
        return Result.ok();
    }

    @GetMapping("/name/{id}")
    @ApiOperation("根据部门ID获取部门名称")
    public Result<String> getNameByDeptId(@PathVariable("id") Integer deptId) {
        return Result.ok("");
    }

    @GetMapping("/child/ids/{id}")
    @ApiOperation("根据部门ID下的子部门")
    public Result<List<String>> queryChildDeptId(@PathVariable("id") Integer deptId) {
        return Result.ok(new ArrayList<>());
    }
}
