package Ejercicio7; 

//Cree una función recursiva que reciba una lista de objetos "Persona" y devuelva una
//nueva lista que contenga solo las personas mayores de edad.

 import java.util.ArrayList;
import java.util.List;
public class Main {
	  public static List<Persona> filtrarMayoresEdad(List<Persona> personas) {
	        return filtrarMayoresEdad(personas, 0, new ArrayList<>());
	    }

	    private static List<Persona> filtrarMayoresEdad(List<Persona> personas, int index, List<Persona> resultado) {
	        if (index == personas.size()) {
	            return resultado;
	        }

	        Persona persona = personas.get(index);
	        if (persona.edad >= 18) {
	            resultado.add(persona);
	        }

	        return filtrarMayoresEdad(personas, index + 1, resultado);
	    }

	    public static void main(String[] args) {
	        List<Persona> personas = List.of(
	            new Persona("Victoria", 20),
	            new Persona("Luis", 17),
	            new Persona("Felipe", 21),
	            new Persona("Marta", 15)
	        );

	        List<Persona> mayoresEdad = filtrarMayoresEdad(personas);
	        System.out.println(mayoresEdad);
	    }
	}
