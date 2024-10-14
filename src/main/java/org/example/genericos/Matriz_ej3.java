package org.example.genericos;

import java.util.Arrays;

public class Matriz_ej3<T> {
    private T[][] matriz;
    private int filas;
    private int columnas;

    public Matriz_ej3(int filas, int columnas) {
        this.columnas = columnas;
        this.filas = filas;
        this.matriz = (T[][]) new Object[columnas][filas];
    }

    public void set(int fila, int columna, T valor) {
        this.matriz[fila][columna] = valor;
    }

    public T get(int fila, int columna) {
        return this.matriz[fila][columna];
    }

    public int filas() {
        return filas;
    }

    public int columnas() {
        return columnas;
    }

    @Override
    public String toString() {
        for (int i = 0; i < matriz.length; i++) { // Recorre las filas
            for (int j = 0; j < matriz[i].length; j++) { // Recorre las columnas
                System.out.print(matriz[i][j] + "\t"); // Imprime el elemento seguido de una tabulación
            }
            System.out.println(); // Salto de línea después de cada fila
        }
        return "";
    }
}
