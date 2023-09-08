package com.example.feignclient.factory;

import com.example.feignclient.OrderApi;
import lombok.extern.slf4j.Slf4j;
import org.springframework.cloud.openfeign.FallbackFactory;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class OrderFactory implements FallbackFactory<OrderApi> {

    @Override
    public OrderApi create(Throwable cause) {

        return new OrderApi() {

            /**
            * 获取用户信息降级处理。
            * */
            @Override
            public String getUserInfo() {
                log.info("orderService获取用户信息异常，请联系运维人员排查！", cause);
                return "orderService获取用户信息异常，异常信息为：" + cause.toString();
            }
        };
    }
}
