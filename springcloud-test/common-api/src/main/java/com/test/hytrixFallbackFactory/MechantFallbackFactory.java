package com.test.hytrixFallbackFactory;

import com.test.bean.Mechant;
import com.test.service.mechant.MechantService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class MechantFallbackFactory implements FallbackFactory<MechantService> {
    @Override
    public MechantService create(Throwable throwable) {
        return new MechantService(){

            @Override
            public Mechant getMechantById(Integer id) {
                Mechant mechant = new Mechant();
                mechant.setId(00001);
                mechant.setMechantName("芝麻");
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
        };
    }
}
