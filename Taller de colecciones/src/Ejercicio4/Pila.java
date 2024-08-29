package Ejercicio4;

import java.util.Stack;

public class Pila {
	  private Stack<Object> pila;

	    public Pila() {
	        this.pila = new Stack<>();
	    }

	    // Método para insertar un elemento en la pila
	    public void push(Object elemento) {
	        if (pila.isEmpty() || elemento.getClass().equals(pila.peek().getClass())) {
	            pila.push(elemento);
	            System.out.println("Elemento agregado: " + elemento);
	        } else {
	            System.out.println("Error: El tipo del nuevo elemento no coincide con el tipo del elemento en la cima de la pila.");
	        }
	    }

	    // Método para extraer un elemento de la pila
	    public Object pop() {
	        if (!pila.isEmpty()) {
	            return pila.pop();
	        }
	        return null; // Retorna null si la pila está vacía
	    }

	    // Método para ver el elemento en la cima de la pila
	    public Object peek() {
	        if (!pila.isEmpty()) {
	            return pila.peek();
	        }
	        return null; // Retorna null si la pila está vacía
	    }

	    // Método para verificar si la pila está vacía
	    public boolean isEmpty() {
	        return pila.isEmpty();
	    }
	    
	    // Método para imprimir el contenido de la pila
	    public void mostrarPila() {
	        System.out.println("Contenido de la pila: " + pila);
	    }
	}

