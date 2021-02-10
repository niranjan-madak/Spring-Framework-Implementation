package com.madak.SpringCore_annotation_based_configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.madak.SpringCore_annotation_based_configuration")
public class AppConfig {
//	
//	@Bean
//	public RealMe_phone getphone() {
//		return new RealMe_phone();
//	}
//	                                                      // in place of these beans we can use @componentScan annotation for creation of object 
//	@Bean
//	public MobileProcessor getprocessor() {
//		return new Snapdragon();
//	}
//	
//	@Bean
//	public MobileProcessor getProcessor() {
//		return new MediaTek();
//		
//	}

}
