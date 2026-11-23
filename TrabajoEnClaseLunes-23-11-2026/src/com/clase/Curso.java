package com.clase;

import java.util.Random;

public class Curso {
	private final String nombreCurso;
	private final int maxima;
	private final int inscritos;

	{
		Random random = new Random();
		maxima = random.nextInt(35 - 20 + 1) + 20;
	}

	public Curso(String nombreCurso, int inscritos) {
		this.nombreCurso = nombreCurso;
		
		if (maxima < inscritos) {
			System.out.println("El numero de alumnos no puede exceder a: " + maxima);
			this.inscritos = maxima; 
		} else {
			this.inscritos = inscritos; 
		}
	}

	public String getNombreCurso() {
		return nombreCurso;
	}

	public int getMaxima() {
		return maxima;
	}

	public int getInscritos() {
		return inscritos;
	}

	@Override
	public String toString() {
		return "Curso = " + this.nombreCurso  + " , Inscritos = " + this.inscritos + " Alumnos";
	}
}
