package Ejercicio9;

//Cree una función recursiva que reciba una pila de objetos y devuelva una nueva pila
//que contenga solo los elementos que cumplen con cierta condición (por ejemplo,
//aquellos cuyo valor es mayor que 5)

 import java.util.Stack;

public class Main {
    
    // Función recursiva para filtrar elementos de la pila
    public static Stack<Integer> filtrarPila(Stack<Integer> pila) {
        // Caso base: si la pila está vacía, devolvemos una nueva pila vacía
        if (pila.isEmpty()) {
            return new Stack<>();
        }

        // Guardamos el elemento del tope de la pila
        Integer elemento = pila.pop();
        
        // Llamada recursiva para procesar el resto de la pila
        Stack<Integer> pilaFiltrada = filtrarPila(pila);

        // Condición: añadimos el elemento a la pila filtrada si es mayor que 5
        if (elemento > 5) {
            pilaFiltrada.push(elemento);
        }

        return pilaFiltrada;
    }

    public static void main(String[] args) {
        // Crear una pila de enteros
        Stack<Integer> pila = new Stack<>();
        pila.push(1);
        pila.push(7);
        pila.push(3);
        pila.push(9);
        pila.push(2);

        // Filtrar la pila
        Stack<Integer> pilaFiltrada = filtrarPila(pila);
        System.out.println(pilaFiltrada); // Debería imprimir [7, 9]
    }
}


