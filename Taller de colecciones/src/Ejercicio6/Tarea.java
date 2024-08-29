package Ejercicio6;
import java.util.PriorityQueue;
import java.util.Comparator;

public class Tarea {
	String descripcion;
    int prioridad;

    public Tarea(String descripcion, int prioridad) {
        this.descripcion = descripcion;
        this.prioridad = prioridad;
    }

    @Override
    public String toString() {
        return "Tarea: " + descripcion + ", Prioridad: " + prioridad;
    }
}

