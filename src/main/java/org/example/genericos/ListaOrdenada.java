package org.example.genericos;

import java.util.ArrayList;

public class ListaOrdenada<E extends Comparable<E>> {

    ArrayList<E> lista;

    public ListaOrdenada(ArrayList<E> lista) {
        this.lista = lista;
    }

    public void add(E o) {
        if (lista.isEmpty()) {
            lista.add(o);
        } else {
            int i = 0;
            while (i < lista.size() && o.compareTo(lista.get(i)) > 0) {
                i++;
            }
            lista.add(i, o);
        }
    }

    public E get(int index) {
        return lista.get(index);
    }

    public int size() {
        return lista.size();
    }

    public boolean isEmpty() {
        return lista.isEmpty();
    }

    public boolean remove(E o) {
        return lista.remove(o);
    }

    public int indexOf(E o) {
        return lista.indexOf(o);
    }

    @Override
    public String toString() {
        return "ListaOrdenada{" +
                "lista=" + lista +
                '}';
    }
}
