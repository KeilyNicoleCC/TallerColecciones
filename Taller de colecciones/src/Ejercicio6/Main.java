package Ejercicio6;

// . Cree una cola (Queue) que almacene objetos de tipo "Tarea" que tengan una
//prioridad asociada. Implemente la cola usando un PriorityQueue y defina la prioridad
//de cada tarea según su importancia.

import java.util.Comparator;
import java.util.PriorityQueue;

public class Main {

	public static void main(String[] args) {
		   // Definimos un comparador para ordenar las tareas por prioridad
        Comparator<Tarea> comparadorTarea = (t1, t2) -> Integer.compare(t1.prioridad, t2.prioridad);

        // Creamos una PriorityQueue con el comparador de tareas
        PriorityQueue<Tarea> colaTareas = new PriorityQueue<>(comparadorTarea);

        // Agregamos algunas tareas a la cola
        colaTareas.add(new Tarea("Pagar cuentas", 3));
        colaTareas.add(new Tarea("Ir al supermercado", 1));
        colaTareas.add(new Tarea("Llamar a mamá", 2));

       
        while (!colaTareas.isEmpty()) {
            System.out.println(colaTareas.poll());
        }
	}

}
