package com.syc.cloud.core.utils;

/**
 * @author 33992
 * @since 2021/10/20
 **/
public class ExceptionUtils {

    private ExceptionUtils() {}

    /**
     * 获取异常的详细信息
     * */
    public static String getExceptionDetail(Exception ex) {
        StringBuilder stringBuffer = new StringBuilder(ex.toString() + "\n");
        StackTraceElement[] messages = ex.getStackTrace();
        for (StackTraceElement message : messages) {
            stringBuffer.append("\t").append(message.toString()).append("\n");
        }
        return stringBuffer.toString();
    }
}
