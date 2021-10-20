package com.syc.cloud.authorization.pojo.dto;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;
import lombok.ToString;

import java.util.List;

/**
 * @author 33992
 * @since 2021/10/19
 **/
@Data
@ToString
@Builder
@ApiModel("用户状态修改")
public class AdminUserStatusDTO {

    @ApiModelProperty("ids")
    private List<Long> ids;

    @ApiModelProperty("状态")
    private Integer status;
}
