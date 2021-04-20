package com.practice.webrestfulcrud.component;

import org.springframework.web.servlet.HandlerInterceptor;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


//HandlerInterceptor mainly uses to do login check

public class LoginHandlerInterceptor implements HandlerInterceptor {

//    before target function
    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        Object user = request.getSession().getAttribute("loginUser");
        if(user != null){
            return true;
        }else{
            request.setAttribute("msg", "Not found session, please login!");
            request.getRequestDispatcher("/index.html").forward(request,response);
            return false;
        }
    }

    @Override
    public void postHandle(HttpServletRequest request, HttpServletResponse response, Object handler, ModelAndView modelAndView) throws Exception {

    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {

    }
}
