package Ejercicio4;

// Cree una pila (Stack) que pueda almacenar objetos de diferentes tipos y que solo
//permite insertar elementos si el tipo del objeto coincide con el tipo del elemento en la
//cima de la pila
public class Main {

	public static void main(String[] args) {
		  Pila pila = new Pila();

	       
	        pila.push("Buenos");  
	        pila.push("DIAS"); 
	        pila.push(123);     // Integer - No se agregará ya que el tipo no coincide

	        // Ver el contenido de la pila
	        pila.mostrarPila();

	        // Extraer el último elemento
	        pila.pop();

	       
	        pila.pop(); 
	        pila.push(123); 

	        // Ver el contenido de la pila después de agregar un Integer
	        pila.mostrarPila();
	    }
	

	}


