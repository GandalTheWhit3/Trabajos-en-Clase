
package com.clase;

public class Main {

	public static void main(String[] args) {
		
	
		int a = 3;
		int[] b = new int[a];
		
		b[0]=3;
		//los ints en el stack o cualquier primitivo solo guarda valores, al cambiar el valor del array no camhia el prmitivo
		int c = b[0];
		b[0]=4;
		
		System.out.println(c);
		System.out.println(b[0]);
		//otra forma de hacer un array 
		int[] b1 = new int[] {1,3,2};
		//array con objetos
		Empleado []emps = new Empleado[3];
		Empleado emp1 = new Empleado("Juan", "Perez");
		//en el arregro dentro del heap y el sack no entre el objeto, sino entra en el arreglo la referencia en ee caso "emp1" se guarda en el array
		emps[0] = emp1;
		//haciendo emp2 = emp1 lo que hace es crear la referencia emp2 y apuntar al mismo espacio de memoria emps juan perez
		Empleado emp2 = emp1;
		emp2.setName("Maria");
		emps[0] = emp2;
		emps[0] = emp1;
		//TEMPORAL/Empleado emp2 = new Empleado("Maria", "Velazco");
		//cambia la direccion de la referencia, antes estaba en emp1 y se borra esa direccion y ahora apunta emp2 al arreglo [0]
		emps [0] = emp2;
		//esto solo imprime la referenciasolo es UNA DIRECCION DE MEMORIA "com.clase.Empleado@5caf905d"
		System.out.println(emps[0]);
		//si quiero acceder al nombre es con el PUNTO "."
		System.out.println(emps[0].getName());
		System.out.println(emps[0].getLastName());
	
	}
}
