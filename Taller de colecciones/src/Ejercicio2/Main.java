package Ejercicio2;

// Crear la lista de productos en una clase empresa utilizando treeset, se debe realizar
//un método que busque un producto por su código.


public class Main {

	public static void main(String[] args) {
		Empresa empresa = new Empresa();

        Producto p1 = new Producto(1, "juguete", 40.000);
        Producto p2 = new Producto(2, "Teléfono", 800.000);
        Producto p3 = new Producto(3, "blusa", 150.000);

        empresa.agregarProducto(p1);
        empresa.agregarProducto(p2);
        empresa.agregarProducto(p3);

        // Buscar un producto por su código
        Producto productoBuscado = empresa.buscarProductoPorCodigo(2);
        if (productoBuscado != null) {
            System.out.println("Producto encontrado: " + productoBuscado);
        } else {
            System.out.println("Producto no encontrado.");
        }

        // Mostrar todos los productos
        empresa.mostrarProductos();
    }

	}


