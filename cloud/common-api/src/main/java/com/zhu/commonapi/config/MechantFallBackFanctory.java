package com.zhu.commonapi.config;

import com.zhu.commonapi.bean.Mechant;
import com.zhu.commonapi.service.MechantService;
import feign.hystrix.FallbackFactory;
import org.springframework.stereotype.Component;

@Component
public class MechantFallBackFanctory implements FallbackFactory<MechantService> {
    @Override
    public MechantService create(Throwable throwable) {
        return new MechantService() {
            @Override
            public Mechant getMehantById(Integer id) {
                Mechant mechant = new Mechant();
                mechant.setId(99999999);
                mechant.setName("服务降级的商品请求");
                return mechant;
            }

            @Override
            public Mechant updateMechantList(Mechant mechant) {
                Mechant mechant1 = new Mechant();
                mechant1.setId(99999999);
                mechant1.setName("服务降级的商品请求");
                return mechant1;
            }

            @Override
            public void createMechant(Mechant mechant) {

            }
        };
    }
}
