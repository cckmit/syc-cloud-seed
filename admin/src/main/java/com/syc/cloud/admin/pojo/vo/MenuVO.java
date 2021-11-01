package com.syc.cloud.admin.pojo.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * @author 33992
 * @since 2021/10/24
 **/
@Data
public class MenuVO implements Serializable {

    private static final long serialVersionUID=1L;

    @ApiModelProperty(value = "菜单ID")
    private Integer menuId;

    @ApiModelProperty(value = "上级菜单ID")
    private Integer parentId;

    @ApiModelProperty(value = "菜单名称")
    private String menuName;

    @ApiModelProperty(value = "权限标识")
    private String realm;

    @ApiModelProperty(value = "权限URL")
    private String realmUrl;

    @ApiModelProperty(value = "所属模块")
    private String realmModule;

    @ApiModelProperty(value = "菜单类型  1目录 2 菜单 3 按钮 4特殊")
    private Integer menuType;

    @ApiModelProperty(value = "排序（同级有效）")
    private Integer sort;

    @ApiModelProperty(value = "状态 1 启用 0 禁用")
    private Integer status;

    @ApiModelProperty(value = "菜单说明")
    private String remarks;

    @ApiModelProperty(value = "数据权限")
    private Integer dataType;

    private List<MenuVO> children = new ArrayList<>();
}
