package Ejercicio2;

import java.util.ArrayList;

public class Factura {
	private String cliente;
    private ArrayList<Producto> productos;

    public Factura(String cliente) {
        this.setCustomer(cliente);
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

	public String getCustomer() {
		return cliente;
	}

	public void setCustomer(String customer) {
		this.cliente = customer;
	}
}
