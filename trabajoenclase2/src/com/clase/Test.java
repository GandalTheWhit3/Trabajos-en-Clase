package com.clase;

public class Test {
	
	public static void swap(Persona p1,Persona p2) {
		String temp = p1.getName();
		p1.setName(p2.getName());
		p2.setName(temp);
	}
}
