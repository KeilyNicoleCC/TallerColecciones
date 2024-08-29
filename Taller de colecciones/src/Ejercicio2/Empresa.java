package Ejercicio2;

import java.util.TreeSet;

public class Empresa {
	 private TreeSet<Producto> listaProductos;

	    public Empresa() {
	        this.listaProductos = new TreeSet<>();
	    }

	    public void agregarProducto(Producto producto) {
	        listaProductos.add(producto);
	    }

	    public Producto buscarProductoPorCodigo(int codigo) {
	        for (Producto producto : listaProductos) {
	            if (producto.getCodigo() == codigo) {
	                return producto;
	            }
	        }
	        return null;
	        
}
	    

		public void mostrarProductos() {for(Producto producto: listaProductos) {
    		System.out.println(producto);
    	}
		
			
		}
	}

