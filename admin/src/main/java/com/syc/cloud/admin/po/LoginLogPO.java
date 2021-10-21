package com.syc.cloud.admin.po;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.Date;

/**
 * @author 33992
 * @since 2021/10/21
 **/
@Data
@EqualsAndHashCode(callSuper = false)
@Accessors(chain = true)
@TableName("admin_login_log")
@ApiModel(value="AdminLoginLog对象", description="系统登录日志表")
public class LoginLogPO implements Serializable {


    private static final long serialVersionUID=1L;

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "操作人id")
    @TableField(fill = FieldFill.INSERT)
    private Long userId;

    @ApiModelProperty(value = "操作人")
    private String realName;

    @ApiModelProperty(value = "登录时间")
    private Date loginTime;

    @ApiModelProperty(value = "登录ip地址")
    private String ipAddress;

    @ApiModelProperty(value = "登录地点")
    private String loginAddress;

    @ApiModelProperty(value = "设备类型")
    private String deviceType;

    @ApiModelProperty(value = "终端内核")
    private String core;

    @ApiModelProperty(value = "平台")
    private String platform;

    @ApiModelProperty(value = "认证结果 1成功 2失败")
    private Integer authResult;

    @ApiModelProperty(value = "失败结果")
    private String failResult;
}
