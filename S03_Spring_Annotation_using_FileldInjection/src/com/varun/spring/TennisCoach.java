package com.varun.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("thegoodcoach")
public class TennisCoach implements Coach {
	
	@Autowired
	private FortuneService fortuneService; 
	
	public TennisCoach()
	{
		System.out.println("Inside Default Constructor");
	}
	
    @Override
	public String getDailyWorkout() {
		
		return "Practice your backhand volley";
	}

    @Override
	public String getDailyFortune() {
		
		return fortuneService.getFortune();
	}
    
   /* @Autowired
   	public void setFortuneService(FortuneService fortuneService) {
    	System.out.println("Inside Setter Method");
   		this.fortuneService = fortuneService;
   	}*/
}
