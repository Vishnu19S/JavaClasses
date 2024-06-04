package org.ArraySample;

public class TwoDimensionalArray {

	public static void main(String[] args) {
		
		/*
		 //Approach 1
		 
		int a[][]=new int[3][3]; //Declare the array
		
		//Insert values into an array
		
		a[0][0]=100;
		a[0][1]=200;
		a[0][2]=300;
		a[1][0]=400;
		a[1][1]=500;
		a[1][2]=600;
		a[2][0]=700;
		a[2][1]=800;
		a[2][2]=900;
		
		*/
		
		//Approach 2  
		
		int a[][] = {{100,200,500},
				     {300,400,600},
				     {500,600,700}	
		            };
		
		System.out.println("No of Rows:"+ a.length);
		
		System.out.println("No of columns in 0th index"+a[0].length);//3
		System.out.println("No of Columns in 1st row:"+a[1].length);//3
		System.out.println("No of Columns in 2nd row:"+a[2].length);//3
		
		
		System.out.println(a[1][0]);//300
		
//		Nested For loop
		
		for(int r =0 ; r < a.length ; r++) { //Outer Loop //Rows //3
			
			for(int c=0 ; c<a[r].length ; c++) {  //Inner Loop //Columns //3
			
				System.out.print(a[r][c] +  " ");
			
			}
			
			System.out.println();
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
