package com.syc.cloud.crm.po;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import java.util.Date;

/**
 * @author 33992
 * @since 2021/10/26
 **/
@Data
@Accessors(chain = true)
@TableName("crm_action_record")
@ApiModel(value="CrmActionRecord对象", description="字段操作记录表")
public class ActionRecordPO {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "操作人ID")
    @TableField(fill = FieldFill.INSERT)
    private Long createUserId;

    @ApiModelProperty(value = "创建时间")
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    @ApiModelProperty(value = "ip地址")
    private String ipAddress;

    @ApiModelProperty(value = "模块类型")
    private Integer types;

    @ApiModelProperty(value = "被操作对象ID")
    private Integer actionId;

    @ApiModelProperty(value = "对象")
    private String object;

    @ApiModelProperty(value = "行为")
    private Integer behavior;

    @ApiModelProperty(value = "内容")
    private String content;

    @ApiModelProperty(value = "详情")
    private String detail;
}
