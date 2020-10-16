/**
 * 
 */
package com.sandeep.java8.lab;

/**
 * An Interface that contains exactly one abstract method is known as functional interface. 
 * It can have any number of default, static methods but abstract method must be one.
 * 
 * If we declare any Interface with only one abstract method then it will be also treated as Functional Interface 
 * but If we declare any interface with @FunctionalInterface and will add another abstract method then will get compilation error.
 * 
 * @author Sandeep Kumar
 *
 */

@FunctionalInterface
interface MyFunctionalInterface{
	
	void printYourName();
	
	/*
	 * Here, I have declared another abstract method which invalid because I have declared it as @FunctionalInterface
	 * will get Error Message  ->  Invalid '@FunctionalInterface' annotation; MyFunctionalInterface is not a functional interface
	 * */
//	void printYourNickName();
	
	default void printYourCity() {
		System.out.println("Bangalore");
	}
	
	default void printYourState() {
		System.out.println("Karnataka");
	}
	
	static void printYourPinCode() {
		System.out.println("560054");
	}
	
	static void printYourCountry() {
		System.out.println("INDIA");
	}
	
}

class MyDetails implements MyFunctionalInterface{

	@Override
	public void printYourName() {
		System.out.println("Sandeep Kumar");
	}
	
	
}

public class FunctionalInterfaceLab {

	public static void main(String[] args) {
		
		MyDetails detail = new MyDetails();
		
		detail.printYourName();
		detail.printYourCity();
		detail.printYourState();
	//	MyDetails.printYourPinCode();    -> Compile Time Error
		MyFunctionalInterface.printYourPinCode();
		MyFunctionalInterface.printYourCountry();
		
		/* Output:
		 * -------
		 *  Sandeep Kumar
			Bangalore
			Karnataka
			560054
			INDIA
		 * */
	}

}

