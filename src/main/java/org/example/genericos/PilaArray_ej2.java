package org.example.genericos;


import java.util.LinkedList;

public class PilaArray_ej2<T> extends Pila_ej1<T> {
    private T[] lista;
    private int num_objetos;

    public PilaArray_ej2(LinkedList<T> lista) {
        super(lista);
    }
}
