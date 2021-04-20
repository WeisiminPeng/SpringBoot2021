package com.practice.webrestfulcrud.config;


import com.practice.webrestfulcrud.component.LoginHandlerInterceptor;
import com.practice.webrestfulcrud.component.MyLocaleResolver;
import org.springframework.boot.web.server.WebServerFactory;
import org.springframework.boot.web.server.WebServerFactoryCustomizer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;


//fully manage Spring MVC
//@EnableWebMvc

@Configuration
//use WebMvcConfigurer to expand function of Spring MVC
public class myMVCconfig implements WebMvcConfigurer {

//    public WebServerFactoryCustomizer webServerFactoryCustomizer(){
//        return new WebServerFactoryCustomizer() {
//            @Override
//            public void customize(WebServerFactory factory) {
//                factory.
//            }
//        }
//    }

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
//        web page send /mvc request, it will go to success.html
        registry.addViewController("/mvc").setViewName("success");
    }

//    all WebMvcConfigAdapter components will function toghther
    @Bean
//    register this component into the container
    public WebMvcConfigurer webMvcConfigurerAdapter(){
        WebMvcConfigurer adapter = new WebMvcConfigurer(){
            @Override
            public void addViewControllers(ViewControllerRegistry registry) {
                registry.addViewController("/").setViewName("login");
                registry.addViewController("/index.html").setViewName("login");
                registry.addViewController("/main.html").setViewName("dashboard");
            }

//            register handlerInterceptor
            @Override
            public void addInterceptors(InterceptorRegistry registry) {
//                Intercept all request
//                spring boot already finish the static resources rendering,
//               we don't need to worry about .css or .js are being intercepted
//                registry.addInterceptor(new LoginHandlerInterceptor()).addPathPatterns("/**")
//                        .excludePathPatterns("/index.html", "/", "/user/login");

            }
        };
        return adapter;
    }


    @Bean
    public LocaleResolver localeResolver(){
        return new MyLocaleResolver();
    }
}
