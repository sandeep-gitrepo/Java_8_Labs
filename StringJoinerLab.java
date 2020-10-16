package com.sandeep.java8.lab;

import java.util.StringJoiner;

/*
 * StringJoiner is used to construct a sequence of characters separated by a delimiter and 
 * optionally starting with a supplied prefix and ending with a supplied suffix.
 *  
 * @Author: Sandeep Kumar
 * */
public class StringJoinerLab {

	public static void main(String args[]) {

		// FIRST EXAMPLE with delimiter
		// In the delimiter we can pass anything like any number, character, special character, blank space or String.
		StringJoiner joiner = new StringJoiner(" ");  
		
		joiner.add("Sandeep");
		joiner.add("Kumar");
		joiner.add("Bangalore");
		
		System.out.println(joiner);			// Output:   Sandeep,Kumar,Bangalore
		
		
		
		// SECOND EXAMPLE with Prefix and Postfix
		StringJoiner strJoiner = new StringJoiner("," , "=>" , "<=");
		strJoiner.add("Sandeep");
		strJoiner.add("Kumar");
		strJoiner.add("Bangalore");
		
		System.out.println(strJoiner);		// Output:   =>Sandeep,Kumar,Bangalore<=
	}

}
