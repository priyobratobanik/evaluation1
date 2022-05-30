package com.masai.ev2.q2;

import java.util.Scanner;

public class Demo {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("enter the number of students:- ");
		int n=sc.nextInt();
		sc.nextLine();
		
		Student s[]=new Student[n];
		for(int i=0;i<n;i++) {
			
			System.out.println("enter details of student"+(i+1));
			s[i]=new Student();
			System.out.println("enter name :-");
			s[i].setName(sc.nextLine());
			System.out.println("enter roll :-");
			s[i].setRoll(sc.nextInt());
			System.out.println("enter marks :-");
			s[i].setMarks(sc.nextInt());
			sc.nextLine();
			System.out.println("enter address :-");
			s[i].setAddress(sc.nextLine());
		}
		System.out.println();
		int sum=0;
		for(int i=0;i<n;i++)
		{
			System.out.println("Student details :"+(i+1));
			System.out.println("name :"+s[i].getName());
			System.out.println("marks :" +s[i].getMarks());
			System.out.println("Address :"+s[i].getAddress());
			
			sum+=s[i].getMarks();
			
		}
		System.out.println("average"+(sum/n));
	}

}
