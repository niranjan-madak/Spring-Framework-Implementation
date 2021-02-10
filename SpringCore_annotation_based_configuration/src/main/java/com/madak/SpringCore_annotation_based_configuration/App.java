package com.madak.SpringCore_annotation_based_configuration;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext ac=new AnnotationConfigApplicationContext(AppConfig.class);
        RealMe_phone pro=ac.getBean(RealMe_phone.class);
        pro.configuration();
        
    }
}
