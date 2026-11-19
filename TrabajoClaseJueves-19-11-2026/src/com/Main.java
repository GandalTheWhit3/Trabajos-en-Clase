package com;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char caracter = 'X';
        boolean jugador1 = true;

        Tablero tablero = new Tablero();
        tablero.imprimirTablero();

        while (true) {
            if (jugador1) {
                System.out.println("Turno del Jugador 1");
                caracter = 'X';
                jugador1 = false;
            } else {
                System.out.println("Turno del Jugador 2");
                caracter = 'O';
                jugador1 = true;
            }

            System.out.print("Ingrese la fila: ");
            int fila = sc.nextInt();
            System.out.print("Ingrese la columna: ");
            int columna = sc.nextInt();

            tablero.asignarValor(fila, columna, caracter);
            System.out.println("");
            tablero.imprimirTablero();

            
            if (tablero.verificarGanador(caracter)) {
                System.out.println("¡Ganó el jugador con la ficha " + caracter);
                break;
            }
        }
    }
}
