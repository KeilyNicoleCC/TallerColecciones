package Ejercicio16;

//Implemente una función recursiva que reciba una pila de objetos y devuelva una
//nueva pila que contenga solo los elementos que cumplen con una condición dada
//por el usuario

import java.util.Stack;
import java.util.function.Predicate;

public class Main {
    public static void main(String[] args) {
       
        Stack<Integer> pilaOriginal = new Stack<>();
        pilaOriginal.push(1);
        pilaOriginal.push(2);
        pilaOriginal.push(3);
        pilaOriginal.push(4);
        pilaOriginal.push(5);

        // Definir una condición: números pares
        Predicate<Integer> condicion = (Integer n) -> n % 2 == 0;

        // Llamar a la función recursiva para filtrar la pila
        Stack<Integer> pilaFiltrada = filtrarPila(pilaOriginal, condicion);

        // Imprimir la pila original y la pila filtrada
        System.out.println("Pila original: " + pilaOriginal);
        System.out.println("Pila filtrada: " + pilaFiltrada);
    }

    // Función recursiva para filtrar la pila según la condición dada
    public static <T> Stack<T> filtrarPila(Stack<T> pila, Predicate<T> condicion) {
        // Caso base: Si la pila está vacía, retornar una nueva pila vacía
        if (pila.isEmpty()) {
            return new Stack<>();
        }

        
        T elemento = pila.pop();

        // Llamada recursiva para filtrar el resto de la pila
        Stack<T> pilaFiltrada = filtrarPila(pila, condicion);

        // Si el elemento cumple la condición, lo agregamos a la pila filtrada
        if (condicion.test(elemento)) {
            pilaFiltrada.push(elemento);
        }

        // Volver a colocar el elemento en la pila original para mantener su estado
        pila.push(elemento);

        return pilaFiltrada;
    }
}
