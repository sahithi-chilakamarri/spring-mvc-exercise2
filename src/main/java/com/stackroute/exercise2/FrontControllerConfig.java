package com.stackroute.exercise2;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;
//This is the dispatcherservlet acts as the front controller
public class FrontControllerConfig extends AbstractAnnotationConfigDispatcherServletInitializer {
    //Mapping the configuration class
    @Override
    protected Class<?>[] getRootConfigClasses() {
        return new Class[]{Config.class};
    }
    @Override
    protected Class<?>[] getServletConfigClasses() {
        return new Class[0];
    }
    //Maps to the request has the / at the end
    @Override
    protected String[] getServletMappings() {
        return new String[]{"/"};
    }
}
