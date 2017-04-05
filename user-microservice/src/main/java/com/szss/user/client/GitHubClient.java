package com.szss.user.client;

//import com.szss.user.entity.Contributor;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

/**
 * Created by Administrator on 2016/3/5.
 */
/*@FeignClient(url = "https://api.github.com",value = "git")
public interface GitHubClient {
    //e.g. http://localhost:9001/andrefaria/spring-cloud-feign-example

    //https://api.github.com/repos/andrefaria/spring-cloud-feign-example/contributors  的返回结果
    @RequestMapping(method = RequestMethod.GET, value = "/repos/{owner}/{repo}/contributors")
    List<Contributor> contributors(@RequestParam("owner") String owner, @RequestParam("repo") String repo);

}*/
