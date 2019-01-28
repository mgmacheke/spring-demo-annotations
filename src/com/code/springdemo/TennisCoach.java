package com.code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component("theTennis")
public class TennisCoach implements Coach {
	
	private FortuneService fortuneService;
	
	/*@Autowired
	public TennisCoach(FortuneService fortuneService){
		this.fortuneService = fortuneService;
		
	}*/

	@Override
	public String getDailyWorkout() {
		return "Practice back hand volley for 5 minutes";
	}

	@Override
	public String getDailyFortune() {
		return fortuneService.getFortune();
	}

	@Autowired
	public void setFortuneService(FortuneService fortuneService) {
		this.fortuneService = fortuneService;
	}
	
	

}
