package Ejercicio12;

// Implemente una función recursiva que reciba un árbol binario de búsqueda y
//devuelva una lista que contenga los elementos del árbol en orden ascendente.

import java.util.List;

public class Main {

	public static void main(String[] args) {
		 // Crear un árbol binario de búsqueda e insertar valores
        ArbolBinarioBusqueda arbol = new ArbolBinarioBusqueda();
        arbol.insertar(5);
        arbol.insertar(2);
        arbol.insertar(8);
        arbol.insertar(1);
        arbol.insertar(3);

        // Obtener los elementos en orden ascendente
        List<Integer> elementosEnOrden = arbol.obtenerElementosEnOrden();

        // Imprimir los elementos en orden
        System.out.println("Elementos del árbol en orden ascendente: " + elementosEnOrden);
    }

	}

