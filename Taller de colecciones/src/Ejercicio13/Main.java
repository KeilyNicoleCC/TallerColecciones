package Ejercicio13;

// Cree una función recursiva que reciba un conjunto de números enteros y devuelva
//un nuevo conjunto que contenga solo los números pares

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        // Crear un conjunto de números enteros
        Set<Integer> numeros = new HashSet<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);
        numeros.add(4);
        numeros.add(5);
        numeros.add(6);

        // Llamar a la función recursiva para obtener solo los números pares
        Set<Integer> pares = filtrarPares(numeros);

        // Imprimir el resultado
        System.out.println("Conjunto original: " + numeros);
        System.out.println("Conjunto de números pares: " + pares);
    }

    // Función recursiva para filtrar números pares
    public static Set<Integer> filtrarPares(Set<Integer> numeros) {
        // Caso base: Si el conjunto está vacío, retorna un conjunto vacío
        if (numeros.isEmpty()) {
            return new HashSet<>();
        }

        // Crear un iterador para recorrer el conjunto
        Iterator<Integer> iterador = numeros.iterator();
        Integer numeroActual = iterador.next();

       
        iterador.remove();

        // Llamada recursiva
        Set<Integer> resultado = filtrarPares(numeros);

        // Si el número actual es par, lo agregamos al conjunto resultado
        if (numeroActual % 2 == 0) {
            resultado.add(numeroActual);
        }

        return resultado;
    }
}