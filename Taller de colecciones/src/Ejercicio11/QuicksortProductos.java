package Ejercicio11;

//Cree una función recursiva que reciba una lista de Productos y los ordene usando el
//algoritmo de ordenamiento quicksort.


import java.util.ArrayList;
import java.util.List;

public class QuicksortProductos {

	  public static void quicksort(List<Producto> productos, int low, int high) {
	        if (low < high) {
	            int pi = partition(productos, low, high);

	            quicksort(productos, low, pi - 1);  // Recursively sort the left part
	            quicksort(productos, pi + 1, high); // Recursively sort the right part
	        }
	    }

	    private static int partition(List<Producto> productos, int low, int high) {
	        Producto pivot = productos.get(high);
	        int i = (low - 1);

	        for (int j = low; j < high; j++) {
	            if (productos.get(j).compareTo(pivot) <= 0) {
	                i++;

	                // Swap productos[i] with productos[j]
	                Producto temp = productos.get(i);
	                productos.set(i, productos.get(j));
	                productos.set(j, temp);
	            }
	        }

	        // Swap productos[i+1] with productos[high] (pivot)
	        Producto temp = productos.get(i + 1);
	        productos.set(i + 1, productos.get(high));
	        productos.set(high, temp);

	        return i + 1;
	    }
	    
	    public static void main(String[] args) {
	        List<Producto> productos = List.of(
	                new Producto("Producto A", 10.5),
	                new Producto("Producto B", 7.8),
	                new Producto("Producto C", 15.0),
	                new Producto("Producto D", 9.3)
	        );

	        // Convert the list to an ArrayList to allow modifications
	        List<Producto> listaProductos = new ArrayList<>(productos);

	        System.out.println("Lista original:");
	        listaProductos.forEach(System.out::println);

	        quicksort(listaProductos, 0, listaProductos.size() - 1);

	        System.out.println("\nLista ordenada:");
	        listaProductos.forEach(System.out::println);
	    }
	}

