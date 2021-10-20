package com.syc.cloud.authorization.utils;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author 33992
 * @since 2021/10/20
 **/
@Slf4j
public class AuthPasswordUtilTest {

    @Test
    public void generatePassword() {
        String token = AuthPasswordUtil.generatePassword(1L, 100000);
        log.info("token {}", token);
        assertNotNull(token);
    }

    @Test
    public void verify() {
        String token = AuthPasswordUtil.generatePassword(1L, 100000);
        boolean correct = AuthPasswordUtil.verify(1L, token);
        assertTrue(correct);
        correct = AuthPasswordUtil.verify(2L, token);
        assertFalse(correct);
        correct = AuthPasswordUtil.verify(1L, "a.b.c");
        assertFalse(correct);
    }
}