package com.java.s3.member;

public class MemberMain {

	public static void main(String[] args) {

		Member member = new Member();
		member.setAge(40);
		member.setKi(163);
 		member.setEmail("test@gmail.com");
 		
		System.out.println(member.getAge());
		System.out.println(member.getKi());
		System.out.println(member.getEmail());
	}

}
