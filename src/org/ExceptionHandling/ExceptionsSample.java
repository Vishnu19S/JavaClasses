package org.ExceptionHandling;

import java.util.Scanner;

public class ExceptionsSample {
	

	public static void main(String[] args) {
		
		//Arithmetic Exception
		
		System.out.println("The program is Started");
		System.out.println("The program is in Progress");
		/*
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		int num = scan.nextInt();
		
		try {
		System.out.println(100/num);
		
		}
		catch(ArithmeticException e){
			System.out.println("Enter Valid Number");
			
		}
	*/	
		
		//ArrayIndexOutOfBoundsException
		
		int a[] = new int[5]; //index starts from 0....4
	
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter a number:");
		
		int num = scan.nextInt();
		
		System.out.println("Where do you want to Insert");
		
		int pos = scan.nextInt();
		
		try {
			
		a[pos]=num;
		
		}
		catch(Exception e){
		
		System.out.println("Enter  Valid Position");
		
		}
//		catch(Exception e) {
//			
//			System.out.println("Enter Valid Position 1");
//		}
		
		finally {
			System.out.println("Entered into the FInally");
		}
		
		
		
		
//		try ... catch...finally blocks
		
		System.out.println("The program is completed");
		System.out.println("The program is in Exited");
		
		
		

	}

}
