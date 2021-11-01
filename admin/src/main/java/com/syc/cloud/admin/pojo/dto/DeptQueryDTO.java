package com.syc.cloud.admin.pojo.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import io.swagger.annotations.ApiParam;
import lombok.Data;

/**
 * @author 33992
 * @since 2021/10/24
 **/
@Data
@ApiModel(value="部门编辑对象", description="部门对象")
public class DeptQueryDTO {

    @ApiParam(name = "id", value = "父级ID", required = true, example = "0")
    private Integer id;

    @ApiModelProperty(value = "类型")
    private String type;
}
