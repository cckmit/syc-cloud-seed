package com.syc.cloud.admin.service.impl;

import com.syc.cloud.admin.dao.DeptMapper;
import com.syc.cloud.admin.po.DeptPO;
import com.syc.cloud.admin.service.DeptService;
import com.syc.cloud.core.servlet.BaseServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author 33992
 * @since 2021/10/21
 **/
@Slf4j
@Service
public class DeptServiceImpl extends BaseServiceImpl<DeptMapper, DeptPO> implements DeptService {
}
