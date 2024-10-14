package org.example.genericos;

import java.util.LinkedList;

public class Pila_ej1<T> {
    private LinkedList<T> lista;

    public Pila_ej1(LinkedList<T> lista) {
        this.lista = lista;
    }

    public boolean estaVacia() {
        boolean vacia = false;
        if (lista == null) {
            vacia = true;
        }
        return vacia;
    }

    public T extraer(){
        T elemento = lista.getFirst();
        lista.removeFirst();
        return elemento;
    }

    public T primero(){
        return lista.getFirst();
    }

    public void aniadir(T elemento){
        lista.addLast(elemento);
    }

    @Override
    public String toString() {
        return "Pila{" +
                "lista=" + lista +
                '}';
    }

}
