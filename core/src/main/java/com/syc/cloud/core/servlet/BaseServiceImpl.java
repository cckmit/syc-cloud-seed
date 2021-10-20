package com.syc.cloud.core.servlet;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;

/**
 * @author 33992
 * @since 2021/10/19
 **/
public class BaseServiceImpl<M extends CommonMapper<T>, T> extends ServiceImpl<M, T> implements BaseService<T> {
}
