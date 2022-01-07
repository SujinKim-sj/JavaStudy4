package com.java.s8.rpg;

public class Magition extends Character implements Act{
	
	//마법사 is a 캐릭터
	//마법서 has a 캐릭터
	int mp;
	
	@Override
	public void attack() {
		System.out.println("마법 공격");
	}

	@Override
	public void move() {
		System.out.println("걸어다니기");
		
	}

}
