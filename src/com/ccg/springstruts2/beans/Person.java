package com.ccg.springstruts2.beans;

import lombok.Data;

@Data
public class Person {

	private String name;
	
	public void hello(){
		System.out.println("my name is" + name);
	}
}
