package com.szss.user.client;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * Created by xxb_slf on 2016-03-05.
 */
@FeignClient("order")
public interface OrderClient {
    @RequestMapping(method = RequestMethod.GET, value = "/findorder")
    String getOrder();
}
