package Ejercicio17;

import java.util.LinkedHashMap;

//  Crear una lista de productos de tipo HashMap, otra lista de tipo LinkedHashMap y
//otra de tipo TreeMap y explicar las diferencias de cada una.

import java.util.Map;

import Ejercicio11.Producto;

public class TipoLinkedHashMap {

	   public static void main(String[] args) {
	        Map<String, Producto> productosLinkedHashMap = new LinkedHashMap<>();

	        productosLinkedHashMap.put("A001", new Producto("Producto A", 100.000));
	        productosLinkedHashMap.put("B002", new Producto("Producto B", 700));
	        productosLinkedHashMap.put("C003", new Producto("Producto C", 100));

	        System.out.println("Contenido de LinkedHashMap:");
	        productosLinkedHashMap.forEach((clave, producto) -> 
	            System.out.println("Clave: " + clave + " -> " + producto)
	        );
	    }
	}


// Explicacion:LinkedHashMap conserva el orden de inserción de los elementos.
// Es decir, al iterar sobre una colección, 
//los elementos se devolverán en el orden en que fueron agregados.

