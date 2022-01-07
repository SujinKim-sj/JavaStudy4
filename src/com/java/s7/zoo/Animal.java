package com.java.s7.zoo;

public abstract class Animal {
	String name;
	int age;
	
	public void eat() {
		System.out.println("츄베릅");
	}	
	
	public abstract void sleep();	//추상 메서드
}
