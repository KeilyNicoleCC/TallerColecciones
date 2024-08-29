package Ejercicio1;
 
// Cree una lista de objetos "Persona" con diferentes atributos, como nombre, edad,
//género, etc. Implemente la interfaz Comparable en la clase Persona para que la lista
//pueda ser ordenada por edad o nombre.

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Main {

	
		 public static void main(String[] args) {
		        List<Persona> Listapersonas = new ArrayList<>();
		        Listapersonas.add(new Persona("Juan", 25, "Masculino"));
		        Listapersonas.add(new Persona("Maria", 30, "Femenino"));
		        Listapersonas.add(new Persona("Ana", 20, "Masculino"));

		     // Ordenar por nombre (usando Comparable)
		        Collections.sort(Listapersonas);
		        System.out.println("Lista ordenada por nombre:");
		        for (Persona persona : Listapersonas) {
		            System.out.println(persona);
		        }

		        // Ordenar por edad 
		        Listapersonas.sort(Comparator.comparingInt(Persona::getEdad));
		        System.out.println("\nLista ordenada por edad:");
		        for (Persona persona : Listapersonas) {
		            System.out.println(persona);
		        }
		    }
		}

