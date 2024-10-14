package org.example.genericos;

public class CrearMatriz_ej4 {
    public static void main(String[] args) {
        Matriz_ej3<Integer> matriz = new Matriz_ej3<>(2,4);
        int numero = 0;
        for (int i = 0; i<4;i++){
            for (int j = 0; j<2;j++){
                matriz.set(i, j,numero);
                numero++;
            }
        };
        System.out.println(matriz);
        System.out.println("el elemento de la fila 1 y la columna 2 es: " + matriz.get(0,1));
    }
}
