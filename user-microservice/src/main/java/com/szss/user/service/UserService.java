package com.szss.user.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.szss.user.client.OrderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by xxb_slf on 2016-03-05.
 */
@Service
public class UserService {
    @Autowired
    OrderClient orderClient;

//    @HystrixCommand(fallbackMethod = "fallbackGetOrder")
    public String getMessage(){

        return orderClient.getOrder();
    }

//    public String fallbackGetOrder(){
//        return "get order fail";
//    }

}
