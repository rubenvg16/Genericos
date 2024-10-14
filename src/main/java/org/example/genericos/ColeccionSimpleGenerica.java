package org.example.genericos;

public interface ColeccionSimpleGenerica<T> {

    public boolean estaVacia();

    public T extraer();

    public T primero();

    public T aniadir();

}
