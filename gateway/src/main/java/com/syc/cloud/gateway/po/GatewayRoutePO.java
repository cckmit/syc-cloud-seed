package com.syc.cloud.gateway.po;

import com.baomidou.mybatisplus.annotation.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

/**
 * @author 33992
 * @since 2021/10/19
 **/
@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@TableName(value = "config_info_route")
public class GatewayRoutePO {

    @TableId(type = IdType.AUTO)
    private Integer id;

    private String uri;

    private String routeId;

    private String predicates;

    private String filters;

    private String description;

    private Integer intercept;

    @TableLogic(value = "1")
    private Integer status;

    private Integer orders;

    @TableField(fill = FieldFill.INSERT)
    private LocalDate createTime;

    @TableField(fill = FieldFill.UPDATE)
    private LocalDate updateTime;
}
