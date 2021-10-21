package com.syc.cloud.admin.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @author 33992
 * @since 2021/10/21
 **/
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("admin_dept")
@ApiModel(value="AdminDept对象", description="部门表")
public class DeptPO implements Serializable {

    private static final long serialVersionUID=1L;

    @TableId(value = "dept_id", type = IdType.AUTO)
    private Integer deptId;

    @ApiModelProperty(value = "父级ID 顶级部门为0")
    private Integer pid;

    @ApiModelProperty(value = "部门名称")
    private String name;

    @ApiModelProperty(value = "排序 越大越靠后")
    private Integer sort;

    @ApiModelProperty(value = "部门备注")
    private String remark;

    @ApiModelProperty(value = "部门负责人")
    private Long ownerUserId;

    @ApiModelProperty("当前部门在职人数")
    @TableField(exist = false)
    private Integer currentNum;
}
