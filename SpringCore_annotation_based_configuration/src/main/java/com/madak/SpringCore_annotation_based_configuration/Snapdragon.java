package com.madak.SpringCore_annotation_based_configuration;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
//@Primary
public class Snapdragon implements MobileProcessor{
	
	public void processorInfo() {
		System.out.println("snapdragon is the best proccessor now a days !");
	}

}
