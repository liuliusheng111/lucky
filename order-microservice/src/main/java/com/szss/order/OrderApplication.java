package com.szss.order;

import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by xxb_slf on 2016-03-05.
 */
@SpringCloudApplication
@RestController
public class OrderApplication {

    @RequestMapping("/findorder")
    public String getOrder(){
        return "get order success";
    }

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class,args);
    }

}
