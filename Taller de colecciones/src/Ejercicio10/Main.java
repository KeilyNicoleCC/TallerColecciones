package Ejercicio10;


// Implemente una función recursiva que reciba una cola de Productos y devuelva una
//nueva cola que contenga solo los elementos que cumplen con cierta condición (por
//ejemplo, aquellos cuyo valor es menor que 10).


import java.util.LinkedList;
import java.util.Queue;

public class Main {
	   // Función recursiva para filtrar elementos de la cola
    public static Queue<Producto> filtrarCola(Queue<Producto> cola) {
        // Caso base: si la cola está vacía, devolvemos una nueva cola vacía
        if (cola.isEmpty()) {
            return new LinkedList<>();
        }

        // Guardamos el elemento al frente de la cola
        Producto producto = cola.poll();
        
        // Llamada recursiva para procesar el resto de la cola
        Queue<Producto> colaFiltrada = filtrarCola(cola);

        // Condición: añadimos el producto a la cola filtrada si su precio es menor que 10
        if (producto.precio < 10) {
            colaFiltrada.offer(producto);
        }

        return colaFiltrada;
    }

    public static void main(String[] args) {
        // Crear una cola de productos
        Queue<Producto> colaProductos = new LinkedList<>();
        colaProductos.offer(new Producto("Manzana", 5.0));
        colaProductos.offer(new Producto("Pan", 2.5));
        colaProductos.offer(new Producto("Leche", 12.0));
        colaProductos.offer(new Producto("Queso", 9.0));

        // Filtrar la cola
        Queue<Producto> colaFiltrada = filtrarCola(colaProductos);
        System.out.println(colaFiltrada); // Debería imprimir [Manzana (Precio: 5.0), Pan (Precio: 2.5), Queso (Precio: 9.0)]
    }
}