package Ejercicio17;

//Crear una lista de productos de tipo HashMap, otra lista de tipo LinkedHashMap y
//otra de tipo TreeMap y explicar las diferencias de cada una.

import java.util.Map;
import java.util.TreeMap;

import Ejercicio11.Producto;

public class TipoTreeMap {

	public static void main(String[] args) {
		
		        Map<String, Producto> productosTreeMap = new TreeMap<>();

		        productosTreeMap.put("B013", new Producto("Producto B", 25.000));
		        productosTreeMap.put("A002", new Producto("Producto A", 70.000));
		        productosTreeMap.put("C018", new Producto("Producto C", 15.000));

		        System.out.println("Contenido de TreeMap:");
		        productosTreeMap.forEach((clave, producto) -> 
		            System.out.println("Clave: " + clave + " -> " + producto)
		        );
		    		
	}

}

//Explicacion: TreeMap: ordena los registros por orden de clave natural 
//Ejemplo alfabéticamente si las claves son cadenas) 
//o según la comparación proporcionada. 
