package com.syc.cloud.core.utils;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author 33992
 * @since 2021/10/19
 **/
public class UserUtilTest {

    @Test
    public void remove() {
        UserUtil.remove();
        assertNull(UserUtil.getUser());
    }
}