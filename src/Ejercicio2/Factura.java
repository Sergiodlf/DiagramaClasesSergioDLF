package Ejercicio2;

import java.util.ArrayList;

public class Factura {
	private String cliente;
	private ArrayList<Producto> productos;

	public Factura(String cliente) {
		this.cliente = cliente;
		this.productos = new ArrayList<>();
	}

	public void add(Producto producto) {
		productos.add(producto);
	}

	public void remove(int index) {
		if (index >= 0 && index < productos.size()) {
			productos.remove(index);
		}
	}

	public float total() {
		float total = 0;
		for (Producto producto : productos) {
			total += producto.total();
		}
		return total;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public String verDatosProductos() {
		String frase = "";
		for (Producto p : productos) {
			frase += p.toString() + "\nTotal: "+ p.total() + "\n\n";
		}
		return frase;
	}
}
