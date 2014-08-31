/*
 * Copyright 2014 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.code.xuanci.mvc.manager.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.code.xuanci.mvc.DO.SystemDo;
import com.code.xuanci.mvc.dao.SystemDao;
import com.code.xuanci.mvc.manager.SystemMamager;

/**
 * 类SystemMamagerImpl.java的实现描述：TODO 类实现描述
 * 
 * @author yuci.wyc 2014年8月31日 下午4:36:44
 */

@Component
public class SystemMamagerImpl implements SystemMamager {

    @Autowired
    private SystemDao systemDao;

    /*
     * (non-Javadoc)
     * @see com.code.xuanci.mvc.manager.SystemMamager#getSystemDoInfo()
     */
    @Override
    public SystemDo getSystemDoInfo() {
        return systemDao.getSystemDoInfo();
    }

}
