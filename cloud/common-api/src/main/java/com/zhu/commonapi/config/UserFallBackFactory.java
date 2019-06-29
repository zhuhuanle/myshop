package com.zhu.commonapi.config;

import com.zhu.commonapi.bean.User;
import com.zhu.commonapi.service.UserService;
import feign.hystrix.FallbackFactory;

public class UserFallBackFactory implements FallbackFactory<UserService> {
    @Override
    public UserService create(Throwable throwable) {
        return new UserService() {
            @Override
            public User getUserById(Integer id) {
                User user = new User();
                user.setPhone("123456789..");
                user.setName("服务熔断的user");
                user.setId(id);
                return user;
            }

            @Override
            public void createUser(User user) {

            }

            @Override
            public User updateUser(User user) {
                return user;
            }
        };
    }
}
