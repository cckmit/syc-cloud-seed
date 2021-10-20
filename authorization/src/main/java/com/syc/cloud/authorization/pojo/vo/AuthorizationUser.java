package com.syc.cloud.authorization.pojo.vo;

import cn.hutool.core.bean.BeanUtil;
import com.syc.cloud.core.entity.UserInfo;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.Accessors;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/**
 * @author 33992
 * @since 2021/10/19
 **/
@Data
@EqualsAndHashCode(callSuper = false)
@AllArgsConstructor
@NoArgsConstructor
@Accessors(chain = true)
@ApiModel(value = "权限认证对象")
public class AuthorizationUser extends UserInfo implements UserDetails {

    private String token;

    @ApiModelProperty("用户密码")
    private String password;

    private List<UserInfo> userInfoList = new ArrayList<>();

    public void setUserInfoList(List<Object> objectList) {
        objectList.forEach(obj -> this.userInfoList.add(BeanUtil.copyProperties(obj, AuthorizationUser.class)));
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        List<GrantedAuthority> authorities = new ArrayList<>();
        getAuthoritiesUrlList().forEach(authoritiesUrl -> {
            GrantedAuthority grantedAuthority = new SimpleGrantedAuthority(authoritiesUrl);
            authorities.add(grantedAuthority);
        });
        return authorities;
    }

    @Override
    public String getPassword() {
        return null;
    }

    @Override
    public boolean isAccountNonExpired() {
        return false;
    }

    @Override
    public boolean isAccountNonLocked() {
        return false;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return false;
    }

    @Override
    public boolean isEnabled() {
        return false;
    }
}
