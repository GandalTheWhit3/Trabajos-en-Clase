package com.clase;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Persona p1 = new Persona("John");
		System.out.println("Persona 1: " + p1.getName());
		Persona p2 = new Persona("Paul");
		System.out.println("Persona 2: " + p2.getName());
		
		Test.swap(p1, p2);
		
		
		System.out.println("Persona 1: " + p1.getName());
		System.out.println("Persona 2: " + p2.getName());
		
	}

}
