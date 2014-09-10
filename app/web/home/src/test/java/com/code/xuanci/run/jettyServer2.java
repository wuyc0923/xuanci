/*
 * Copyright 2014 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.code.xuanci.run;

import org.mortbay.jetty.Server;
import org.mortbay.jetty.webapp.WebAppContext;

/**
 * 类jettyServer2.java的实现描述：TODO 类实现描述
 * 
 * @author yuci.wyc 2014年9月2日 下午11:31:09
 */
public class jettyServer2 {

    public static void main(String[] args) throws Exception {
        // 获取工程的根目录
        String relativelyPath = System.getProperty("user.dir");
        System.out.println(relativelyPath);

        Server server = new Server(8080);

        WebAppContext context = new WebAppContext();
        context.setContextPath("webapp");
        // context.setDescriptor("D:/JavaProject/jettytest/jetty/webapps/manager/WEB-INF/web.xml");
        // context.setResourceBase("D:/JavaProject/jettytest/jetty/webapps/manager");
        context.setDescriptor("D:/workspace_tem/xuanci/app/web/home/src/main/webapp/WEB-INF/web.xml");
        context.setResourceBase("D:\\workspace_tem\\xuanci\\app\\web\\home\\src\\main\\webapp");
        context.setParentLoaderPriority(true);
        server.setHandler(context);

        server.start();
        server.join();
    }
}
