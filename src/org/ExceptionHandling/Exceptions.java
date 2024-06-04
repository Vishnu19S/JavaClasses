package org.ExceptionHandling;

import java.util.Scanner;

public class Exceptions {

	public static void main(String[] args) {
		// ArithmeticException
		
				System.out.println("The Program is started");
				System.out.println("The Program is inprogress");
				
				/*Scanner sc = new Scanner(System.in);
				System.out.println("Enter a Number:");
				int num=sc.nextInt();
				System.out.println(100/num);*/
				
		//ArrayIndexOutOFBoundsException
			
				/*int a[]=new int[5];//Index starts from 0....4
				
				Scanner sc = new Scanner(System.in);
				
				System.out.println("Enter a Number:");
				int num=sc.nextInt();
				
				System.out.println("Where do you want to Insert:");
				
				int pos=sc.nextInt();
				a[pos]=num;
				*/
				
		//NumberFormatException
				
				Scanner sc= new Scanner(System.in);
				System.out.println("Enter a String");
				
				String s=sc.next();
				
				int num=Integer.parseInt(s);
			

				System.out.println("The Program is Completed");
				System.out.println("The Program is Exited");
				
				
				


	}

}
