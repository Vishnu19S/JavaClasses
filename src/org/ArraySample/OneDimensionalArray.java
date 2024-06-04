package org.ArraySample;

public class OneDimensionalArray {

	public static void main(String[] args) {
		
		
		/*
		 * SINGLE DIMENSIONAL ARRAY: Index Based
		• How Declare array 
		• Insert values into array 
		• Find the size of array 
		• How to read/access values from array
		 */
	//Approach 1	
	/*	int a[] = new int[5]; //Index starts from 0....4
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		a[3]=40;
		a[4]=50;
//		a[6]=60;
		*/
		//ArrayIndexOutOfBoundsException
		//Approach 2
		
		int b[]= {10,20,30,40,50};
		
		System.out.println(b.length);
		
		System.out.println(b[3]);
//		System.out.println(b[0]);
//		System.out.println(b[1]);
//		System.out.println(b[2]);
//		System.out.println(b[4]);
		
		
		for(int i=0 ; i< b.length ; i++ ) { //Length =5
			System.out.println(b[i]);
		}
		
		
//		for(int p:b) {
//			System.out.println(p);
//		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}