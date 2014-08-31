/*
 * Copyright 2014 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.code.xuanci.mvc.dao.impl;

import java.util.Date;

import org.springframework.stereotype.Component;

import com.code.xuanci.mvc.DO.SystemDo;
import com.code.xuanci.mvc.dao.SystemDao;

/**
 * 类SystemDaoImpl.java的实现描述：TODO 类实现描述
 * 
 * @author yuci.wyc 2014年8月31日 下午4:27:53
 */
@Component
public class SystemDaoImpl implements SystemDao {

    /*
     * (non-Javadoc)
     * @see com.code.xuanci.mvc.dao.SystemDao#getSystemInfo()
     */
    @Override
    public SystemDo getSystemDoInfo() {
        SystemDo sysDo = new SystemDo();
        sysDo.setName("xuanci");
        sysDo.setAuthor("yuci.wyc");
        sysDo.setCreateTime(new Date());
        return sysDo;

    }
}
