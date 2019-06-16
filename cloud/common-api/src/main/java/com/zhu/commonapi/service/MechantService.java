package com.zhu.commonapi.service;

import com.zhu.commonapi.bean.Mechant;

import java.util.List;

public interface MechantService {
    Mechant getMehantById(Integer id);
    List<Mechant> getMechantList();
    void createMechant(Mechant mechant);
}
