package Ejercicio12;

import java.util.ArrayList;
import java.util.List;

public class ArbolBinarioBusqueda {
	 Nodo raiz;

	    ArbolBinarioBusqueda() {
	        this.raiz = null;
	    }

	    // Método para insertar un valor en el árbol
	    public void insertar(int valor) {
	        raiz = insertarRecursivo(raiz, valor);
	    }

	    private Nodo insertarRecursivo(Nodo nodo, int valor) {
	        if (nodo == null) {
	            nodo = new Nodo(valor);
	            return nodo;
	        }

	        if (valor < nodo.valor) {
	            nodo.izquierda = insertarRecursivo(nodo.izquierda, valor);
	        } else if (valor > nodo.valor) {
	            nodo.derecha = insertarRecursivo(nodo.derecha, valor);
	        }

	        return nodo;
	    }

	    // Función recursiva para recorrer el árbol en orden y obtener los valores en una lista
	    public List<Integer> obtenerElementosEnOrden() {
	        List<Integer> elementos = new ArrayList<>();
	        inOrdenRecursivo(raiz, elementos);
	        return elementos;
	    }

	    private void inOrdenRecursivo(Nodo nodo, List<Integer> lista) {
	        if (nodo != null) {
	            // Recorrer el subárbol izquierdo
	            inOrdenRecursivo(nodo.izquierda, lista);

	            lista.add(nodo.valor);

	            // Recorrer el subárbol derecho
	            inOrdenRecursivo(nodo.derecha, lista);
	        }
	    }
	}

