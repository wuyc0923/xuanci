/*
 * Copyright 2014 Alibaba.com All right reserved. This software is the
 * confidential and proprietary information of Alibaba.com ("Confidential
 * Information"). You shall not disclose such Confidential Information and shall
 * use it only in accordance with the terms of the license agreement you entered
 * into with Alibaba.com.
 */
package com.code.xuanci.mvc.DO;

/**
 * 类City.java的实现描述：TODO 类实现描述
 * 
 * @author yuci.wyc 2014年8月31日 下午6:30:37
 */
public class City {

    private Integer id;
    private Integer cityIndex;
    private Integer provinceId;
    private String  name;

    /**
     * @return the id
     */
    public Integer getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(Integer id) {
        this.id = id;
    }

    /**
     * @return the cityIndex
     */
    public Integer getCityIndex() {
        return cityIndex;
    }

    /**
     * @param cityIndex the cityIndex to set
     */
    public void setCityIndex(Integer cityIndex) {
        this.cityIndex = cityIndex;
    }

    /**
     * @return the provinceId
     */
    public Integer getProvinceId() {
        return provinceId;
    }

    /**
     * @param provinceId the provinceId to set
     */
    public void setProvinceId(Integer provinceId) {
        this.provinceId = provinceId;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

}
