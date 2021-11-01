package com.syc.cloud.core.pojo.dto;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

/**
 * @author 33992
 * @since 2021/10/26
 **/
@Data
public class PageDTO {

    @ApiModelProperty("当前页数")
    private Integer page = 1;

    @ApiModelProperty("每页展示条数")
    private Integer limit = 15;

    @ApiModelProperty(value = "是否分页，0:不分页 1 分页", allowableValues = "0,1")
    private Integer pageType = 1;
}
