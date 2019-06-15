package com.test.bean;

import java.io.Serializable;

public class Mechant implements Serializable {
    private static final long serialVersionUID = -6706661738213955763L;
    private Integer id;
    private String mechantName;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMechantName() {
        return mechantName;
    }

    public void setMechantName(String mechantName) {
        this.mechantName = mechantName;
    }

    @Override
    public String toString() {
        return "Mechant{" +
                "id=" + id +
                ", mechantName='" + mechantName + '\'' +
                '}';
    }
}
