package com.test.bean;

import java.io.Serializable;

public class Order implements Serializable {
    private static final long serialVersionUID = -6871565841962171868L;
    private Integer id;

    private Integer userId;

    private Integer mechantId;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getMechantId() {
        return mechantId;
    }

    public void setMechantId(Integer mechantId) {
        this.mechantId = mechantId;
    }
}