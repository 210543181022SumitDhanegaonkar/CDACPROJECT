package com.app;

import org.springframework.beans.factory.annotation.Autowired;

public class Human {
	@Autowired
	Heart heart;
	
	public Human() {
		
	}
   // @Autowired
	public Human(Heart heart) {
		super();
		System.out.println("constructor invoked");
		this.heart = heart;
	}

	//@Autowired
	public void setHeart(Heart heart) {
		this.heart = heart;
	}
	public void startPumping() {
		
		if(heart!=null) {
		heart.pump();
		}
		else
			System.out.println("you are dead");
	}
	
	

}
