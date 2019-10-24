/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listaenlzada;

/**
 *
 * @author remix
 */
public class Lista {
    //Declaración de atributos

    private Nodo siguiente;
    private Nodo ultimo;

    //Constructos de la clase Lista
    public Lista() {
        siguiente = ultimo = null;
    }

    //Metodo para agregar un nodo al final
    public void agregarFin(int info) {

        Nodo nuevo = new Nodo(info, null);

        if (siguiente == null) {
            siguiente = ultimo = nuevo;
        } else {
            ultimo.setSiguiente(nuevo);
            ultimo = nuevo;
        }

    }

    //Metodo para imprimir los datos
    public void imprimir() {
        Nodo auxiliar = siguiente;
        while (auxiliar != null) {
            System.out.println(auxiliar.getDato());
            auxiliar = auxiliar.getSiguiente();
        }
    }

    //Metodo apra eliminar los valores que superen un valor dado
    public void eliminar(int valor) {
        Nodo anterior = siguiente;
        Nodo auxiliar = siguiente.getSiguiente();
        Nodo temp;
        while (auxiliar != null) {
            //Condicional simple para eliminacion de nodos
            if (auxiliar.getDato() > valor) {
                temp = auxiliar.getSiguiente();
                anterior.setSiguiente(auxiliar.getSiguiente());
                auxiliar = temp;
            } else {
                anterior = anterior.getSiguiente();
                auxiliar = auxiliar.getSiguiente();
            }
        }
    }
}
