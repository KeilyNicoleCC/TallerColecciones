package Ejercicio5;


//Crear una lista de elementos que no permite duplicados e imprima el contenido de la
//lista usando iteradores
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Crear un Set que no permite duplicados
        Set<String> conjunto = new HashSet<>();

        // Agregar elementos al Set
        conjunto.add("Elemento 1");
        conjunto.add("Elemento 2");
        conjunto.add("Elemento 3");
        conjunto.add("Elemento 2"); // Este no se agrega

        // Imprimir el contenido del Set usando un iterador
        Iterator<String> iterador = conjunto.iterator();
        System.out.println("Contenido del conjunto:");

        while (iterador.hasNext()) {
            System.out.println(iterador.next());
        }
    }
}