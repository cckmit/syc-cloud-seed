package com.syc.cloud.core.utils;

import com.syc.cloud.core.entity.UserInfo;

import java.util.Optional;

/**
 * @author 33992
 * @since 2021/10/18
 **/
public class UserUtil {

    private static final ThreadLocal<UserInfo> threadLocal = new ThreadLocal<>();

    public static UserInfo getUser() {
        return threadLocal.get();
    }

    public static Long getUserId() {
        UserInfo user = threadLocal.get();
        return Optional.ofNullable(user).orElse(new UserInfo()).getUserId();
    }

    public static void setUser(UserInfo user) {
        threadLocal.set(user);
    }

    public static void remove() {
        threadLocal.remove();
    }
}
