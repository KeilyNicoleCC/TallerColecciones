package Ejercicio10;

 import java.util.LinkedList;
import java.util.Queue;


class Producto {
    String nombre;
    double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return nombre + " (Precio: " + precio + ")";
    }
}
