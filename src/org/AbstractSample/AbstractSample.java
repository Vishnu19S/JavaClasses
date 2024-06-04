package org.AbstractSample;


/*
 *       Abstract Class --Partial Abstract
	
        .) Abstract class must declared with an abstract keyword.
	    .) It can have abstract and non abstract method
		abstract void method1(); --> Abstract method
                void method 1(){         -->Non abstract method
		//implementation part
		}
	    .) Contains definition but not body
	    .) Cannot be instantiated(Cannot create object)
    	.) Can have static method also.

 */


abstract class Animal{
	
	abstract void eat(); //Abstract Method
		
	void run() {   //Non Abstract Method
		System.out.println("Runs Fast");
	}
	
	static void sleep() { //Static Method
		System.out.println("Sleeps");
	}
	
}


//abstract class Animal1{
//	
//	abstract void eat(); //Abstract Method
//		
//	void run() {   //Non Abstract Method
//		System.out.println("Runs Fast");
//	}
//	
//	static void sleep() { //Static Method
//		System.out.println("Sleeps");
//	}
//	
//}
public class AbstractSample extends Animal {
	
	@Override
	void eat() {
		System.out.println("Eats Grass");
		
	}
	
	
	public static void main(String[] args) {
		
		AbstractSample abobj =new AbstractSample();
		
		abobj.eat();
		abobj.run();
		
		Animal.sleep();
		
	}

	
}
