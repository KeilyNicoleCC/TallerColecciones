package Ejercicio8;

// Implemente una función recursiva que reciba un mapa que asocie números enteros
//con cadenas de caracteres y devuelve una nuevo mapa que contenga solo las
//entradas cuyas claves son números pares.

 import java.util.HashMap;
import java.util.Map;

public class Main {
    public static Map<Integer, String> filtrarClavesPares(Map<Integer, String> mapa) {
        return filtrarClavesPares(mapa, new HashMap<>(), mapa.keySet().iterator());
    }

    private static Map<Integer, String> filtrarClavesPares(Map<Integer, String> mapa, Map<Integer, String> resultado, java.util.Iterator<Integer> iterator) {
        if (!iterator.hasNext()) {
            return resultado;
        }

        Integer clave = iterator.next();
        if (clave % 2 == 0) {
            resultado.put(clave, mapa.get(clave));
        }

        return filtrarClavesPares(mapa, resultado, iterator);
    }

    public static void main(String[] args) {
        Map<Integer, String> mapa = new HashMap<>();
        mapa.put(1, "Uno");
        mapa.put(2, "Dos");
        mapa.put(3, "Tres");
        mapa.put(4, "Cuatro");

        Map<Integer, String> mapaFiltrado = filtrarClavesPares(mapa);
        System.out.println(mapaFiltrado);
    }
}