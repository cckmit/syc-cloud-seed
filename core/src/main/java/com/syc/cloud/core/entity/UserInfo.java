package com.syc.cloud.core.entity;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonIgnore;
import io.swagger.annotations.ApiModelProperty;
import lombok.Data;
import lombok.experimental.Accessors;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * @author 33992
 * @since 2021/10/15
 **/
@Data
@Accessors(chain = true)
public class UserInfo implements Serializable {

    private static final long serialVersionUID = 1L;

    private Long userId;

    private String username;

    private String img;

    @JsonFormat(pattern="yyyy-MM-dd HH:mm:ss")
    private Date createTime;

    private String realName;

    private Integer deptId;

    private String deptName;

    private Integer status;

    private String parentName;

    private Long parentId;

    private String companyName;

    @ApiModelProperty("登录类型 1 pc")
    private Integer loginType = 1;

    private List<String> authoritiesUrlList = new ArrayList<>();

    @JsonIgnore
    private transient HttpServletRequest request;

    @JsonIgnore
    private transient HttpServletResponse response;

    private List<Integer> roles;

    private Integer emailAccount;

    private Long superUserId;

    private Integer superRoleId;

    private String post;
}
