package com.syc.cloud.admin.service.impl;

import com.syc.cloud.admin.dao.LoginLogMapper;
import com.syc.cloud.admin.po.LoginLogPO;
import com.syc.cloud.admin.service.LoginLogService;
import com.syc.cloud.core.servlet.BaseServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author 33992
 * @since 2021/10/21
 **/
@Slf4j
@Service
public class LoginLogServiceImpl extends BaseServiceImpl<LoginLogMapper, LoginLogPO> implements LoginLogService {
}
