package com.example.feignclient.factory;

import com.example.feignclient.UserApi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class UserFactory implements FallbackFactory<UserApi> {

    @Override
    public UserApi create(Throwable cause) {

        return new UserApi() {

            /**
            * 获取用户信息降级处理。
            * */
            @Override
            public String getUserInfo() {
                log.info("userService获取用户信息异常，请联系运维人员排查！", cause);
                return "userService获取用户信息异常，异常信息为：" + cause.toString();
            }
        };
    }
}
