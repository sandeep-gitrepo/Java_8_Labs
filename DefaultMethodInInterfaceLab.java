package com.sandeep.java8.lab;

/*
 * Default methods are methods implemented in an interface, are implicitly public and non-abstract, 
 * and marked by the modifier default. These methods are available to all classes which implement this interface.
 * 
 * An interface can have one or more than one default methods.
 * 
 * @author Sandeep Kumar
 * 
 * */

interface DefaultMethodInInterfaceDemo {

	void print();
	
	default void display() {
		System.out.println("Hello Guys... This is default first method.");
	}
	
	default void show() {
		System.out.println("Hello Guys... This is default second method.");
	}
	
}

class OutputPrinter implements DefaultMethodInInterfaceDemo {

	@Override
	public void print() {
		System.out.println("Print method.");
	}
	
	@Override
	public void show() {
		System.out.println("show method overridden");
	}
	
}

public class DefaultMethodInInterfaceLab{
	
	public static void main(String arg[]) {
		OutputPrinter printer = new OutputPrinter();
		
		printer.display();
		printer.show();
		printer.print();
		
		/*
		 * Output:
		 * -------
		 * Hello Guys... This is default first method.
		   show method overridden
           Print method.
		 * */
		
	}
	
} 
