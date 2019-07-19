package com.stackroute.exercise2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;

@Configuration
@EnableWebMvc
@ComponentScan("com.stackroute")
public class Config extends WebMvcConfigurerAdapter {
        @Bean
        public InternalResourceViewResolver viewResolver()
        {
            //Creating object for viewresolver
            InternalResourceViewResolver viewResolver=new InternalResourceViewResolver();
            //set location for views
            viewResolver.setPrefix("/WEB-INF/");
            //set extension for views
            viewResolver.setSuffix(".jsp");
            return viewResolver;
        }
    }

