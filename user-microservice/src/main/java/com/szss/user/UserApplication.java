package com.szss.user;

//import com.szss.user.entity.Contributor;
import com.szss.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.cloud.client.SpringCloudApplication;
import org.springframework.cloud.netflix.feign.EnableFeignClients;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by xxb_slf on 2016-03-05.
 */
@SpringCloudApplication
@EnableFeignClients
@RestController
public class UserApplication {


    @Autowired
    UserService userService;

    @RequestMapping("/message")
    public String getMessage() {
        return userService.getMessage();
    }

    @RequestMapping("/index")
    public String home() {
        return "index";
    }

//    @RequestMapping("/{owner}/{repo}")
//    @ResponseBody
//    public List<Contributor> contributors(@PathVariable String owner, @PathVariable String repo) {
//        return gitHub.contributors(owner, repo);
//    }


    public static void main(String[] args) {
        SpringApplication.run(UserApplication.class, args);
    }

}
