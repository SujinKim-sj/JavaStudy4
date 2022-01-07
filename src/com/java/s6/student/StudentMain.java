package com.java.s6.student;

public class StudentMain {

	public static void main(String[] args) {
		
		//StudentDTO studentDTO = new StudentDTO();
		StudentDTOSecond ss = new StudentDTOSecond();
		StudentDTOThird st = new StudentDTOThird();
		StudentDTOFourth sf = new StudentDTOFourth();
		
		//studentDTO.eng = 10;
		
		ss.history = 30;
		ss.eng = 20;
		ss.name = "김철";
		
		st.physics = 40;
		st.eng = 30;
		st.name = "황미애";
		
		sf.physics = 50;
		sf.music = 70;
		
		ss.setTotal();
	}

}
