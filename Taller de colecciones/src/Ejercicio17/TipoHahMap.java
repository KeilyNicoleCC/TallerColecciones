package Ejercicio17;


// Crear una lista de productos de tipo HashMap, otra lista de tipo LinkedHashMap y
//otra de tipo TreeMap y explicar las diferencias de cada una.

import java.util.HashMap;
import java.util.Map;

import Ejercicio11.Producto;



public class TipoHahMap {

	public static void main(String[] args) {
		
		  Map<String, Producto> productosHashMap = new HashMap<>();

	        productosHashMap.put("C001", new Producto("Producto C", 24.000));
	        productosHashMap.put("A002", new Producto("Producto A", 35.000));
	        productosHashMap.put("B003", new Producto("Producto B", 15.000));

	        System.out.println("Contenido de HashMap:");
	        productosHashMap.forEach((clave, producto) -> 
	            System.out.println("Clave: " + clave + " -> " + producto)
	        );
	    }
	}


// EXPLICACION: Ordenamiento: no garantiza ningún orden particular de claves o valores.
// La Velocidad,  debido a su estructura basada en tablas hash, suele ser el más rápido 
//para operaciones básicas (inserciones, búsquedas y eliminaciones)
//  Se utiliza cuando no es necesario mantener un orden específico de registros.