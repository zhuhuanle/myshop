package com.test.service.mechant;

import com.test.bean.Mechant;
import com.test.hytrixFallbackFactory.MechantFallbackFactory;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(name = "MECHANT-PROVID",fallbackFactory = MechantFallbackFactory.class)
public interface MechantService {
    @RequestMapping(value = "/get/{id}",method = RequestMethod.GET)
    Mechant getMechantById(@PathVariable("id") Integer id);
    @RequestMapping(value = "/getList",method = RequestMethod.GET)
    List<Mechant> getMechantList();
    @RequestMapping(value = "/getAdd",method = RequestMethod.GET)
    Integer addMechant(Mechant mechant);
}
