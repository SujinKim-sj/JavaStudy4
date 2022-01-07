package com.java.s8.rpg;

public class RpgMain {

	public static void main(String[] args) {
		Knight k1 = new Knight();
		Magition m1 = new Magition();
		Archer a1 = new Archer();
		
		Character [] ch = new Character[3];
		ch[0] = k1;
		ch[1] = m1;
		ch[2] = a1;
		
		
		
		/*
		int num = 10;
		//c1 = k1;
		//m1 = c1;		불가능
		
		m1.name = "간달프";
		m1.hp = 100;
		m1.mp = 50;
		
		//Magition type은 Character type이다
		Character c1 = m1;

		System.out.println(c1.name);	//100.character.name
		System.out.println(c1.hp);
		//System.out.println(c1.mp);
		
		m1 = (Magition)c1;
		
		System.out.println(m1.name);	//100.magition.name
		System.out.println(m1.hp);
		System.out.println(m1.mp);
	
		*/
	}

}
