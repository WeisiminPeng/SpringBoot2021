package com.practice.webrestfulcrud.controller;

import com.practice.webrestfulcrud.exception.UserNotExistException;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Arrays;
import java.util.Map;

@Controller
public class HelloController {

//    @RequestMapping({"/","/login.html"})
//    public String index(){
//        return "login";
//    }

    @ResponseBody
    @RequestMapping("/hello")
    public String hello(@RequestParam("user") String user){
        if(user.equals("aaa")){
            throw new UserNotExistException();
        }
        return "Hello World!";
    }

    @RequestMapping("/success")
    public String success(Map<String, Object> map){
        map.put("hello", "<h1>World</h1>");
        map.put("users", Arrays.asList("user1","user2","user3"));


//        public static final String DEFAULT_PREFIX = "classpath:/templates/";
//        return success.html
        return "success";
    }
}
