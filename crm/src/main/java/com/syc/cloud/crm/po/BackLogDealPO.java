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
@TableName("crm_back_log_deal")
@ApiModel(value="CrmBackLogDeal对象", description="")
public class BackLogDealPO {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    @ApiModelProperty(value = "待办事项模块 1今日需联系客户 2分配给我的线索 3分配给我的客户 4待进入公海的客户 5待审核合同 6待审核回款 7待回款提醒 8即将到期的合同 9待回访合同 10待审核发票")
    private Integer model;

    @ApiModelProperty(value = "数据模块")
    private Integer crmType;

    @ApiModelProperty(value = "数据id")
    private Integer typeId;

    @ApiModelProperty(value = "公海id")
    private Integer poolId;

    @ApiModelProperty(value = "创建时间")
    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    @ApiModelProperty(value = "创建人")
    @TableField(fill = FieldFill.INSERT)
    private Long createUserId;
}
