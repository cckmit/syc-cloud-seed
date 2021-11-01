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
@TableName("crm_business_data")
@ApiModel(value="CrmBusinessData对象", description="商机扩展字段数据表")
public class BusinessDataPO {

    @TableId(value = "id", type = IdType.AUTO)
    private Integer id;

    private Integer fieldId;

    @ApiModelProperty(value = "字段名称")
    private String name;

    private String value;

    @TableField(fill = FieldFill.INSERT)
    private Date createTime;

    private String batchId;
}
