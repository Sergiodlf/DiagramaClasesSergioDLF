package ejercicio4;

import java.util.ArrayList;

public class Lista {
	private ArrayList<Producto> productos;

	public Lista() {
		this.productos = new ArrayList<>();
	}

	public void addProducto(Producto producto) {
		productos.add(producto);
	}

	public void borrarProducto(Producto producto) {
		productos.remove(producto);
	}

	public String verLista() {
		String frase = "";
		for (Producto p : productos) {
			frase += p.toString() + "\n\n";
		}
		return frase;
	}

}