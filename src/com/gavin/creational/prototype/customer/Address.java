package com.gavin.creational.prototype.customer;

import java.io.Serializable;

/**
 * @author gf
 * @date 2018-09-14 09:41
 * @description 地址类
 */
public class Address implements Serializable {
    private String country; //国家
    private String province; //省份
    private String city; //城市

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
