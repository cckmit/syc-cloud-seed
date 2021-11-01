package com.syc.cloud.admin.pojo.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author 33992
 * @since 2021/10/25
 **/
@Data
public class AdminRoleDTO {

    @ApiModelProperty("人员id列表")
    private List<Long> userIds;

    @ApiModelProperty("部门id列表")
    private List<Integer> deptIds;

    @ApiModelProperty("权限id列表")
    private List<Integer> roleIds;
}
