package com.syc.cloud.admin.pojo.vo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;

/**
 * @author 33992
 * @since 2021/10/25
 **/
@Data
@ApiModel("角色信息")
public class AdminRoleVO implements Serializable {

    @ApiModelProperty("pid")
    private Integer pid;

    @ApiModelProperty("名称")
    private String name;
}
