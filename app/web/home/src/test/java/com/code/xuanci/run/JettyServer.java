/*
 * Copyright 2014 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.code.xuanci.run;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.mortbay.jetty.Server;
import org.mortbay.jetty.handler.DefaultHandler;
import org.mortbay.xml.XmlConfiguration;
import org.xml.sax.SAXException;

/**
 * 类JettyServer.java的实现描述：TODO 类实现描述
 * 
 * @author yuci.wyc 2014年9月2日 下午11:08:35
 */
public class JettyServer {

    public static void main(String[] args) {
        Server server = new Server(8089);
        server.setHandler(new DefaultHandler());
        XmlConfiguration configuration = null;
        try {
            configuration = new XmlConfiguration(
                                                 new FileInputStream(
                                                                     "D:\\workspace_tem\\xuanci\\app\\web\\home\\src\\main\\resources\\jetty\\jetty.xml"));
        } catch (FileNotFoundException e1) {
            e1.printStackTrace();
        } catch (SAXException e1) {
            e1.printStackTrace();
        } catch (IOException e1) {
            e1.printStackTrace();
        }
        try {
            configuration.configure(server);
            server.start();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
