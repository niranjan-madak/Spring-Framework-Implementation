package com.madak.SpringCore_annotation_based_configuration;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class RealMe_phone {
	
	@Autowired
	@Qualifier("mediaTek")
	private MobileProcessor processor;
	
	
	public MobileProcessor getProcessor() {
		return processor;
	}


	public void setProcessor(MobileProcessor processor) {
		this.processor = processor;
	}


	public void configuration() {
		System.out.println("ram-16GB, memory-64GB");
		processor.processorInfo();
		
	}

}
