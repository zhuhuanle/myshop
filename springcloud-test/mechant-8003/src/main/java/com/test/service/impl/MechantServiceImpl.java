package com.test.service.impl;

import com.test.bean.Mechant;
import com.test.service.mechant.MechantService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MechantServiceImpl implements MechantService {
    @Override
    public Mechant getMechantById(Integer id) {
        if (id==5) {
            throw new RuntimeException();
        }
        Mechant mechant = new Mechant();
        mechant.setId(id);
        mechant.setMechantName("西瓜");
        return mechant;
    }

    @Override
    public List<Mechant> getMechantList() {
        return null;
    }

    @Override
    public Integer addMechant(Mechant mechant) {
        return null;
    }
}
