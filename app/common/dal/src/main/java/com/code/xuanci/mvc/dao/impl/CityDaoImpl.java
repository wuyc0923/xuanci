/*
 * Copyright 2014 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.code.xuanci.mvc.dao.impl;

import org.springframework.orm.ibatis.support.SqlMapClientDaoSupport;

import com.code.xuanci.mvc.DO.City;
import com.code.xuanci.mvc.dao.CityDao;

/**
 * 类CityDaoImpl.java的实现描述：TODO 类实现描述
 * 
 * @author yuci.wyc 2014年8月31日 下午6:34:00
 */

public class CityDaoImpl extends SqlMapClientDaoSupport implements CityDao {

    /*
     * (non-Javadoc)
     * @see com.code.xuanci.mvc.dao.CityDao#getCityById(java.lang.Integer)
     */
    public City getCityById(Integer id) {
        return (City) this.getSqlMapClientTemplate().queryForObject("City.getById", id);
    }

}
