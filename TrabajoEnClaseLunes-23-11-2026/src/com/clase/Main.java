package com.clase;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Curso a1 = new Curso("Matematica",18);
		Curso a2 = new Curso("Fisica",25);
		Curso  a3 = new Curso("Quimica",20);
		
		Curso b1 = new Curso("Matematica",20);
		Curso b2 = new Curso("Fisica",15);
		Curso b3 = new Curso("Quimica",28);
		Curso b4 = new Curso("Biologia",32);
		Curso b5 = new Curso("Historia",32);
		Curso b6 = new Curso("Geogradia",32);
	
		
		Curso c1 = new Curso("Literatura",18);
		Curso c2 = new Curso("Artes",25);
		Curso c3 = new Curso("Botanica",20);
		Curso c4 = new Curso("Programacion",34);
		Curso[][] sucursal = new Curso[3][];
		sucursal[0] = new Curso[5];
		sucursal[0][0]= a1;
		sucursal[0][1]= a2;
		sucursal[0][2]= a3;
		sucursal [1] = new Curso[]{b1,b2,b3,b4,b5,b6,null};
		sucursal[2] = new Curso[4];
		sucursal [2] = new Curso[] {c1,c2,c3,c4};
		
				for (int i = 0; i < sucursal.length; i++) {
					System.out.println("Sucursal " + i );
					for (int j = 0; j < sucursal[i].length; j++) {
						if (sucursal[i][j] != null) {
							System.out.println(sucursal[i][j].toString() + "la cantidad maxima es: " +sucursal[i][j].getMaxima());
						}
					}
		
	}

}}
