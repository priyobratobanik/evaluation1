package com.masai;

public class Course {
	
	int courseId;
	String courseName;
	int courseFee;
	
	void displayCourseDetails(int courseId,String courseName,int courseFee) {
		System.out.println("courseId:"+courseId);
		System.out.println("courseName:"+courseName);
		System.out.println("courseFee:"+courseFee);
	}
	static void authenticate(String username,String password) {
		Course s1=new Course();
		if(username=="Admin" && password=="1234") {
			s1.displayCourseDetails(4, "banik", 20000);
		}
		else {
			System.out.println("Invalid Username or password");
		}
	}
	
	
	
	
	
	
	

	public static void main(String[] args) {
		authenticate("Admin","1234");
		authenticate("priyo","6294");

	}

}
