package com.syc.cloud.admin.pojo.vo;

import io.swagger.annotations.ApiModelProperty;
import lombok.Data;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * @author 33992
 * @since 2021/10/24
 **/
@Data
public class LogWelcomeSpeechVO {

    @ApiModelProperty(value = "设置ID", required = true)
    @NotNull
    private Integer settingId;

    @ApiModelProperty(value = "日志欢迎语", required = true)
    @NotNull
    @Size(max = 100)
    private String value;
}
