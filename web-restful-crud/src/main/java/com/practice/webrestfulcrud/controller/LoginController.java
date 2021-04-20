package com.practice.webrestfulcrud.controller;


import org.springframework.stereotype.Controller;
import org.springframework.util.ObjectUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpSession;
import java.util.Map;

@Controller
public class LoginController {

//    @DeleteMapping
//    @PutMapping
//    @GetMapping
    @PostMapping(value="/user/login")
//    @RequestMapping(value="/user/login", method= RequestMethod.POST)
    public String login(@RequestParam("username") String username,
                        @RequestParam("password")String password,
                        Map<String,Object> map,
                        HttpSession session){

        if(!ObjectUtils.isEmpty(username) && "123456".equals(password)){
//            successfully login
//            in order to avoid resubmit the form, use redirection in myMVCconfig.java
            session.setAttribute("loginUser", username);
            return "redirect:/main.html";
        }
//        fail to login
        else{
            map.put("msg", "Wrong username or password!");
            return "login";
        }
    }


}
