package com.yifan.spring.springsession.entity;

import java.io.Serializable;
import java.util.Date;

public class Demo implements Serializable {
    private String name;
    private Date createTime;
    private  int id;
    private  String info;

    public String getName() {
        return name;
    }

    public Demo setName(String name) {
        this.name = name;
        return  this;

    }

    public Date getCreateTime() {
        return createTime;
    }

    public Demo setCreateTime(Date createTime) {
        this.createTime = createTime;
        return this;
    }

    public int getId() {
        return id;
    }

    public Demo setId(int id) {
        this.id = id;
        return  this;
    }

    public String getInfo() {
        return info;
    }

    public Demo setInfo(String info) {
        this.info = info;
        return this;
    }
}
