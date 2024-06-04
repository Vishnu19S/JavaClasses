package org.AbstractSample;

/*
 Interface:/Fully Abstract
	.) Interface in JAVA is a blueprint of a class.
	.) Interface contains final and static variables
	.) Interface contains abstract methods(An abstract methods is a method contains definition but not body)
	.) Methods in interface are public by default
	.) Interface supports the functionality of multiple Inheritance.
	.) We can define interface with interface keyword.
	.) A class EXTENDS another class, An INterface implements another interface but class implements an interface. 
 
 */


interface shape{  //Parent 1
	
	int length =10;   //final and static 
	int width =20;
	
	void circle();
	
}

interface sample1{ //Parent 2
	
	int a =10;   //final and static 
	int b =20;
	
	void add();
	
}

public class InterfaceDemo implements shape,sample1{   ///Child class
	
	@Override
	public void add() {
		System.out.println(a+b);
		
	}

	@Override
	public void circle() {
		System.out.println("Circle Implemented");
		
	}
	public static void main(String[] args) {
		
		InterfaceDemo obj = new InterfaceDemo();
		
		obj.add();
		obj.circle();
		
			}

	

}
