package com.clase;

public class Main {

	public static void main(String[] args) {
		
		String name1 = new String("Paul");
		String name2 = name1.toLowerCase();
		System.out.println(name2.isEmpty()); //empieza desde el 0
		System.out.println(name1.substring(1,3));
		System.out.println(name1.length()); //empieza desde el 1
		
		
		
		
		
		
		// String Pool
		//String name1 = new String("Paul");//mutables new
		//String name2 = new String("John");
		//System.out.println(name1==name2);
		//String str1 = "Paul"; //inmutable/String pool
		//String str2 = "Paul";
		//System.out.println(str1==str2);
		//System.out.println("Paul"==str2); "apunta al mismo objeto en el string pool"
		//System.out.println(str1 ==name1);// "str1 esta en el string pool mientras name1 apunta a una referencia"
		//str2 = "harry";
		//System.out.println(str1);
		//str1 = "harry";
		//	System.out.println(str1==str2);
	
	
	
		//String summer = new String("Summer");
		//	String summer2 = "Summer";
		//	System.out.println("Summer");
		//System.out.println("autumn");
		//	System.out.println("autumn" == "summer");
		//	String autumn = new String ("Summer");
		
	
	
	
	
	}
}
