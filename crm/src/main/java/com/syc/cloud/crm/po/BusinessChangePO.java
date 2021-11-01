package com.syc.cloud.crm.po;

import com.baomidou.mybatisplus.annotation.*;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import java.util.Date;

/**
 * @author 33992
 * @since 2021/10/26
 **/
@Data
@TableName("crm_business_change")
@ApiModel(value="CrmBusinessChange对象", description="商机阶段变化表")
public class BusinessChangePO {

    @TableId(value = "change_id", type = IdType.AUTO)
    private Integer changeId;

    @ApiModelProperty(value = "商机ID")
    private Integer businessId;

    @ApiModelProperty(value = "阶段ID")
    private Integer statusId;

    @ApiModelProperty(value = "创建时间")
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    @ApiModelProperty(value = "创建人")
    @TableField(fill = FieldFill.INSERT)
    private Long createUserId;
}
