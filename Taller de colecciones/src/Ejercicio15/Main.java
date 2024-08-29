package Ejercicio15;

//   Cree una función recursiva que reciba un mapa que asocie cadenas de caracteres
//con números enteros y devuelva una nuevo mapa que contenga solo las entradas
//cuyas claves sean cadenas de caracteres que comienzan con una letra minúscula.

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

		public class Main {
		    public static void main(String[] args) {
		        // Crear un mapa de ejemplo
		        Map<String, Integer> mapaOriginal = new HashMap<>();
		        mapaOriginal.put("clave1", 10);
		        mapaOriginal.put("Clave2", 20);
		        mapaOriginal.put("otraClave", 30);
		        mapaOriginal.put("OtraClave", 40);
		        mapaOriginal.put("minúscula", 50);

		        // Llamar a la función recursiva para filtrar las entradas
		        Map<String, Integer> mapaFiltrado = filtrarClavesMinusculas(mapaOriginal);

		       
		        System.out.println("Mapa original: " + mapaOriginal);
		        System.out.println("Mapa filtrado: " + mapaFiltrado);
		    }

		    // Función recursiva para filtrar las entradas cuyas claves comienzan con una letra minúscula
		    public static Map<String, Integer> filtrarClavesMinusculas(Map<String, Integer> mapa) {
		        // Caso base: Si el mapa está vacío, retornamos un mapa vacío
		        if (mapa.isEmpty()) {
		            return new HashMap<>();
		        }

		        // Crear un iterador 
		        Iterator<Map.Entry<String, Integer>> iterador = mapa.entrySet().iterator();
		        Map.Entry<String, Integer> entradaActual = iterador.next();

		        // Remover la entrada actual del mapa para la recursión
		        iterador.remove();

		        // Llamada recursiva
		        Map<String, Integer> resultado = filtrarClavesMinusculas(mapa);

		        // Verificar si la clave de la entrada actual comienza con una letra minúscula
		        if (Character.isLowerCase(entradaActual.getKey().charAt(0))) {
		            resultado.put(entradaActual.getKey(), entradaActual.getValue());
		        }

		        return resultado;
		    }
		

	}


