package Ejercicio3;

import java.util.HashMap;
import java.util.Map;

// . Cree una clase "Estudiante" que extienda de la clase "Persona" y agregue un
//atributo adicional para la matrícula del estudiante. Crea un mapa que asocie el
//número de matrícula con el objeto Estudiante correspondiente

public class Main {

	public static void main(String[] args) {
		// Crear un mapa para asociar matrícula con Estudiante
        Map<String, Estudiante> mapaEstudiantes = new HashMap<>();

        // Crear algunos objetos Estudiante
        Estudiante estudiante1 = new Estudiante("Pablo", 20, "Masculino", "MAT1284");
        Estudiante estudiante2 = new Estudiante("Estefani", 22, "Femenino", "MAT5678");
        Estudiante estudiante3 = new Estudiante("Lorena", 21, "Femenino", "MAT3401");

        // Agregar los estudiantes al mapa
        mapaEstudiantes.put(estudiante1.getMatricula(), estudiante1);
        mapaEstudiantes.put(estudiante2.getMatricula(), estudiante2);
        mapaEstudiantes.put(estudiante3.getMatricula(), estudiante3);

        // Buscar un estudiante por la matrícula
        String matriculaBuscada = "MAT5678";
        Estudiante estudianteBuscado = mapaEstudiantes.get(matriculaBuscada);

        if (estudianteBuscado != null) {
            System.out.println("Estudiante encontrado: " + estudianteBuscado);
        } else {
            System.out.println("Estudiante no encontrado.");
        }

        // Mostrar todos los estudiantes en el mapa
        System.out.println("\nTodos los estudiantes:");
        for (Estudiante estudiante : mapaEstudiantes.values()) {
            System.out.println(estudiante);
        }
    }

	}


