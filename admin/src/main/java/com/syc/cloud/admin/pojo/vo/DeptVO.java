package com.syc.cloud.admin.pojo.vo;

import com.fasterxml.jackson.annotation.JsonInclude;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.List;

/**
 * @author 33992
 * @since 2021/10/24
 **/
@Data
@ApiModel(value="部门查询对象", description="部门对象")
public class DeptVO {

    @ApiModelProperty(value = "部门ID")
    private Integer deptId;

    @ApiModelProperty(value = "部门ID2")
    private Integer id;

    @ApiModelProperty(value = "上级部门ID，0为最上级")
    private Integer pid;

    @ApiModelProperty(value = "部门名称")
    private String name;

    @ApiModelProperty(value = "部门label")
    private String label;

    @ApiModelProperty(value = "部门负责人")
    private Long ownerUserId;

    @ApiModelProperty(value = "下级部门列表")
    @JsonInclude(JsonInclude.Include.NON_EMPTY)
    private List<DeptVO> children;

    @ApiModelProperty("当前部门在职人数")
    private Integer currentNum;
}
