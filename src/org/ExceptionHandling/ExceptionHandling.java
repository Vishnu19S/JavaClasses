package org.ExceptionHandling;

import java.util.Scanner;

public class ExceptionHandling {

	public static void main(String[] args) {
		// try ..catch...Finally
				//ArithmeticException
				System.out.println("The Program is started");
				System.out.println("The Program is inprogress");
				
//				Scanner sc = new Scanner(System.in);
//				System.out.println("Enter a Number:");
//				int num=sc.nextInt();
//				
//				try {
//				System.out.println(100/num);
//				}
//				catch(ArithmeticException e) {
//					System.out.println("Invalid Input");
//					
//				}
				
				int a[]=new int[5];//Index starts from 0....4
				
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter a Number:");
				int num=sc.nextInt();
				
				System.out.println("Where do you want to Insert:");
				
				int pos=sc.nextInt();
				try {
					
				a[pos]=num;
				
				}
				catch(Exception e) {
					
					System.out.println("Invalid Position");
				
				}
				finally
				
				{
				
					System.out.println("Entered into finally block");
				
				}
//				catch(ArithmeticException e) {
//					System.out.println("Invalid Input");
//				}
//				catch(NumberFormatException e) {
//					System.out.println("Invalid Input");
//				}
				
						
				System.out.println("The Program is Completed");
				System.out.println("The Program is Exited");
				
				/*
				 try{
				open the connection to Database
				}
				finally{
				sysout(close the database connection);
		}

		*/


	}

}
