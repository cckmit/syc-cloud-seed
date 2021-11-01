package com.syc.cloud.admin.service;

import com.syc.cloud.admin.pojo.dto.AdminCompanyDTO;
import com.syc.cloud.admin.pojo.vo.AdminCompanyVO;

/**
 * @author 33992
 * @since 2021/10/24
 **/
public interface ConfigService {

    /**
     * 设置企业配置
     */
    void setAdminConfig(AdminCompanyDTO company);

    /**
     * 查询企业配置
     * @return adminCompanyBO
     */
    AdminCompanyVO queryAdminConfig();
}
