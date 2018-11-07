package com.ccg.springstruts2.actions;

import com.ccg.springstruts2.service.PersonService;

import lombok.Getter;
import lombok.Setter;

public class PersonAction {
	
	@Setter@Getter
	private PersonService personService;
	
	
	public String execute(){
		
		System.out.println("PersonAction.execute()");
		personService.save();
		return "success";
	}
}
