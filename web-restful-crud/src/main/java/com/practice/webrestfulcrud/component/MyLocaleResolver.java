package com.practice.webrestfulcrud.component;

import org.springframework.util.ObjectUtils;
import org.springframework.web.servlet.LocaleResolver;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.util.Locale;

public class MyLocaleResolver implements LocaleResolver {


    @Override
    public Locale resolveLocale(HttpServletRequest httpServletRequest) {

        String l = httpServletRequest.getParameter("l");
        Locale locale = Locale.getDefault();
        if(!ObjectUtils.isEmpty(l)){
            String[] split = l.split("_");
            locale = new Locale(split[0],split[1]);
        }
        return locale;
    }

    @Override
    public void setLocale(HttpServletRequest httpServletRequest, HttpServletResponse httpServletResponse, Locale locale) {

    }
}
