package com.clase;

import java.util.Random;

public class Main {

	public static void main(String args[]) {
		//esto da error de ejecucion
		//a[4] =4;
		int  a[] = new int [15];
		
		Random random = new Random();
		int sumaPar = 0;
		int sumaImpar =0;
		//for(int i=0 ;i<a.length;i++) {
		//	a[i] = i;
		//	int c = a[i];
		//System.out.println(c);
		//	a[i]= random.nextInt(1,100) ;
		//	int c = a[i];
		//	System.out.println(c);

		//}
		for (int i = 0 ; i< a.length; i++) {
			a[i] = i;
			if (i %2 ==0) {
				sumaPar = sumaPar +a[i];
				
			}else {
				sumaImpar = sumaImpar + a[i];
			}
		}
		int factorial = 0;
		for (int i = 0; i < 8; i++) {
			a[i] = ++i;
			factorial = factorial * a[i];
			//tambien nos dieron arrays de arrays, multidimensional
			//2D

		
		}
		int [][] d = new int [3][3];
		d[0][1]= 2;
		d[0][0] =8;
		d[0][2]=7;
		System.out.println(d[0][0]);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
