package com.masai.q1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
	
		System.out.println("enter the number of elements in the array");
		int num=scanner.nextInt();
		int arr[]=new int[num];
		System.out.println("enter the elements in the array");
		
		
		try {
			for(int i=0;i<num;i++) {
				arr[i]=scanner.nextInt();
			}
			System.out.println("enter the index of the array element you want to access");
			int index=scanner.nextInt();
			
			System.out.println("the array element at index" +index +"-"+arr[index]);
			System.out.println("the array element successfully accessed");		
		}
		catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("java.lang.ArrayIndexOutOfBoundsException");
			
		}
		catch (NumberFormatException e) {
			System.out.println("java.lang.NumberFormatException");
		}
		scanner.close();

	}

}
