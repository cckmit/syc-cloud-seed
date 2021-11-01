package com.syc.cloud.admin.service.impl;

import com.syc.cloud.admin.dao.UserMapper;
import com.syc.cloud.admin.po.UserPO;
import com.syc.cloud.admin.service.UserService;
import com.syc.cloud.core.servlet.BaseServiceImpl;
import org.springframework.stereotype.Service;

/**
 * @author 33992
 * @since 2021/10/21
 **/
@Service
public class UserServiceImpl extends BaseServiceImpl<UserMapper, UserPO> implements UserService {
}
