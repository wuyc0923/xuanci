/*
 * Copyright 2014 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.code.xuanci.mvc.controller;

import javax.servlet.ServletRequest;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.code.xuanci.mvc.manager.SystemMamager;

/**
 * 类IndexController.java的实现描述：TODO 类实现描述
 * 
 * @author yuci.wyc 2014年8月31日 下午4:38:27
 */
@Controller
@RequestMapping("/index.htm")
public class IndexController {

    private static Log          logger = LogFactory.getLog(IndexController.class);

    @Autowired
    private SystemMamager       systemMamager;

    private static final String PAGE   = "index";

    @RequestMapping(method = { RequestMethod.GET, RequestMethod.POST })
    public String init(ModelMap map, ServletRequest request) {
        map.put("bean", systemMamager.getSystemDoInfo());
        logger.info("++++++++++++++++++++++++++++++++++++++++");
        System.out.println("--------------------------------");
        return PAGE;
    }
}
