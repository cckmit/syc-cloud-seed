package com.syc.cloud.core.utils;

import cn.hutool.crypto.SecureUtil;
import io.jsonwebtoken.Claims;
import io.jsonwebtoken.Jwts;
import io.jsonwebtoken.SignatureAlgorithm;
import lombok.extern.slf4j.Slf4j;

import java.util.Date;

/**
 * @author 33992
 * @since 2021/10/20
 **/
@Slf4j
public final class AuthPasswordUtil {

    private AuthPasswordUtil() {}

    /**
     * 生成 token
     * @param userId 用户主键
     * @param expire 过期时间
     * @return token
     */
    public static String generatePassword(Long userId, int expire) {
        return Jwts.builder()
                .setSubject(userId.toString())
                .setExpiration(new Date(System.currentTimeMillis() + expire))
                .signWith(SignatureAlgorithm.HS256, SecureUtil.md5(userId.toString()))
                .compact();
    }

    public static boolean verify(Long userId, String token) {
        try {
            Claims claims = Jwts.parser().setSigningKey(SecureUtil.md5(userId.toString()))
                    .parseClaimsJws(token).getBody();
            Long uId = Long.parseLong(claims.getSubject());
            log.info("judge token is correct, the user id in token is: {}", uId);
            return true;
        } catch (Exception err) {
            log.info(ExceptionUtils.getExceptionDetail(err));
            return false;
        }
    }
}
