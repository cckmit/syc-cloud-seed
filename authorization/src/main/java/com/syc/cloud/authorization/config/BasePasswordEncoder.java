package com.syc.cloud.authorization.config;

import cn.hutool.core.util.StrUtil;
import com.alibaba.fastjson.JSON;
import com.syc.cloud.authorization.pojo.vo.AuthorizationUser;
import com.syc.cloud.authorization.utils.AuthPasswordUtil;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;

/**
 * @author 33992
 * @since 2021/10/20
 **/
@Slf4j
public class BasePasswordEncoder implements PasswordEncoder {

    @Override
    public String encode(CharSequence charSequence) {
        return charSequence.toString();
    }

    @Override
    public boolean matches(CharSequence charSequence, String userJson) {
        if (StrUtil.isBlank(userJson)) {
            return false;
        }
        try {
            AuthorizationUser user = JSON.parseObject(userJson, AuthorizationUser.class);
            return AuthPasswordUtil.verify(user.getUserId(), user.getToken());
        } catch (Exception err) {
            log.warn("JSON 转换错误 {}", userJson);
        }
        return false;
    }
}
