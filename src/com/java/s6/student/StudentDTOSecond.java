package com.java.s6.student;

public class StudentDTOSecond extends StudentDTO{
	//공통 부분 상속 받음
//	
//	public StudentDTOSecond() {
//		super();	//부모 생성자 호출
//		//super("iu");
//	}
//	
	int history;
	
	public int setTotal( ) {
		//overriding
		this.total = this.kor + this.eng + this.math + this.history;
		return this.total;
	}
}
