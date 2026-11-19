package com;

public class Tablero {
    private int dimension = 3;
    private char[][] tablero = new char[dimension][dimension];

    public void imprimirTablero() {
        for (int i = 0; i < dimension; i++) {
            for (int j = 0; j < dimension; j++) {
                System.out.print("[" + tablero[i][j] + "]");
            }
            System.out.println();
        }
    }

    public void asignarValor(int fila, int columna, char caracter) {
        tablero[fila][columna] = caracter;
    }

    public boolean verificarGanador(char caracter) {
        for (int i = 0; i < dimension; i++) {
            if (tablero[i][0] == caracter && tablero[i][1] == caracter && tablero[i][2] == caracter) {
                return true;
            }
            if (tablero[0][i] == caracter && tablero[1][i] == caracter && tablero[2][i] == caracter) {
                return true;
            }
        }
        return false;
    }
}
