package com.syc.cloud.admin.pojo.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotEmpty;

/**
 * @author 33992
 * @since 2021/10/24
 **/
@Data
@ApiModel(value="AdminCompany对象", description="企业配置表")
public class AdminCompanyDTO {

    @NotEmpty
    @ApiModelProperty(value = "企业名称", required = true, example = "顶级企业")
    private String name;

    @ApiModelProperty(value = "企业LOGO", example = "/logo", notes = "logo 所在路径")
    private String logo;
}
