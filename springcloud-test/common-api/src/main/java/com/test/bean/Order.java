package com.test.bean;

import java.io.Serializable;

public class Order implements Serializable {
    private static final long serialVersionUID = 589647947617882388L;
    private Integer id;
    private  Integer userId;
    private Integer merchantId;
    private Integer mun;

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

    public Integer getMerchantId() {
        return merchantId;
    }

    public void setMerchantId(Integer merchantId) {
        this.merchantId = merchantId;
    }

    public Integer getMun() {
        return mun;
    }

    public void setMun(Integer mun) {
        this.mun = mun;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", userId=" + userId +
                ", merchantId=" + merchantId +
                ", mun=" + mun +
                '}';
    }
}
