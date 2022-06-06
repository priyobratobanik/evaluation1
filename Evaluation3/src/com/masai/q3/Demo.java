package com.masai.q3;

import java.util.Scanner;

public class Demo {

private static final Demo Month = null;



void showDetails(Month m) {
	
		switch(m) {
		case JANUARY:
			System.out.println("This is the 1st month of the year");
		case FEBRUARY:
			System.out.println("This is the 2nd month of the year");
		case MARCH:
			System.out.println("This is the 3rd month of the year");
		case APRIL:
			System.out.println("This is the 4th month of the year");
		case MAY:
			System.out.println("This is the 5th month of the year");
		case JUNE:
			System.out.println("This is the 6th month of the year");
		case JULY:
			System.out.println("This is the 7th month of the year");
		case AUGUST:
			System.out.println("This is the 8th month of the year");
		case SEPTEMBER:
			System.out.println("This is the 9th month of the year");
		case OCTOBER:
			System.out.println("This is the 10th month of the year");
		case NOVEMBER:
			System.out.println("This is the 11th month of the year");
		case DECEMBER:
			System.out.println("This is the 12th month of the year");
		
			
		}
	}

	
	
public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter month");
		
		String s=sc.nextLine();
		
		Demo d=Demo.Month;
		System.out.println(d);
		
		
       
	}
}
