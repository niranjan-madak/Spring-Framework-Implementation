package com.madak.schedular;

import java.text.SimpleDateFormat;
import java.util.Date;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class JobSchedular {
	
	SimpleDateFormat sdf=new SimpleDateFormat("HH:mm:ss");
	
//	@Scheduled(fixedRate = 4000)
//	public void displayCurrentTime() {
//		
//		System.out.println(sdf.format(new Date()));
//		
//	}
	
//	@Scheduled(fixedDelay= 4000 ,initialDelay = 2000)
//	public void displayCurrentTime() {
//		
//		System.out.println(sdf.format(new Date()));
//		
//	}

	
	@Scheduled(cron="* * * ? * *") // this will run the task at every second
	public void displayCurrentTime() {
		
		System.out.println(sdf.format(new Date()));
		
	}
}
