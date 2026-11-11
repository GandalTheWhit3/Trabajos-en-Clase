package com.clase.string;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Apuntan al mismo espacio de memoria en el String pool
		String prefijo1 = "Alerta";
		String prefijo2 = "Alerta";
		//Objeto inmutable innecesario por redundancia de objetos
		String prefijo3 = new String("Alerta");
		prefijo3.concat(" Roja");
		//Esto no genera espacio en memoria ya que solo imprime
		System.out.println("Esta es una buena de Strings");
		//No crea espacio de memoria, tiene que hacer reerencia para que cree espacio de memoria
		System.out.println(prefijo1 +prefijo2);
		System.out.println(prefijo1 + " " + prefijo2);
		System.out.println(prefijo1 ==prefijo3);
		String log ="";
		log ="Evento ";
		for(int i =0; i<100000;i++) {
			log = log+i;
			
		}
		Empleado emp = new Empleado("Jaime"," Vargas");
		StringBuilder logBuilder = new StringBuilder("Alerta");
		logBuilder.append("roja");
		
		logBuilder.append(emp);
		System.out.println(logBuilder);
		
		
	}
	
}
