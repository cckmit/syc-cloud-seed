package com.syc.cloud.admin.service.impl;

import com.syc.cloud.admin.dao.MenuMapper;
import com.syc.cloud.admin.po.MenuPO;
import com.syc.cloud.admin.service.MenuService;
import com.syc.cloud.core.servlet.BaseServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

/**
 * @author 33992
 * @since 2021/10/21
 **/
@Slf4j
@Service
public class MenuServiceImpl extends BaseServiceImpl<MenuMapper, MenuPO> implements MenuService {
}
