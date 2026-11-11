package com.clase.string;

public class Empleado {
	private  String name;
	private	 String lastname;
	
	public Empleado ( String name, String lastname) {
		this.name = name;
		this.lastname = lastname;
	}
	
	
	public void setName(String name){
		this.name = name;
	}
	public void setLastName(String lastname) {
		this.lastname=lastname;
	}
	public String getName() {
		return this.name;
	}
	public String getLastName() {
		return this.lastname;
	}
}
