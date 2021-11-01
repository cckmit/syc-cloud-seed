package com.syc.cloud.crm.po;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

/**
 * @author 33992
 * @since 2021/10/26
 **/
@Data
@Accessors(chain = true)
@TableName("crm_activity_relation")
@ApiModel(value="CrmActivityRelation对象", description="活动关联商机联系人表")
public class ActivityRelationPO {

    @TableId(value = "r_id", type = IdType.AUTO)
    private Integer rId;

    private Integer activityId;

    @ApiModelProperty(value = "3 联系人 5 商机")
    private Integer type;

    private Integer typeId;
}
