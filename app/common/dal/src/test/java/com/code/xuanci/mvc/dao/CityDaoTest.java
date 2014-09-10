/*
 * Copyright 2014 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.code.xuanci.mvc.dao;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.code.xuanci.mvc.DO.City;

/**
 * 类CityDaoTest.java的实现描述：TODO 类实现描述
 * 
 * @author yuci.wyc 2014年8月31日 下午6:36:09
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:/META-INF/spring/spring-dal.xml", "../../../../applicationContext.xml" })
public class CityDaoTest {

    @Autowired
    private CityDao cityDao;

    @Test
    public void getUserTest() {
        City city = cityDao.getCityById(111);
    }

    // public static void main(String[] args) {
    // ApplicationContext context = new ClassPathXmlApplicationContext("spring-dal.xml");
    // CityDao cityDao = (CityDao) context.getBean("cityDao");
    // City city = cityDao.getCityById(111);
    // }

}
