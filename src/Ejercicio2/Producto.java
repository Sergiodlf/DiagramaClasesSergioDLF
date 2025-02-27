package Ejercicio2;

public class Producto {
	private String nombre;
    private int qty;
    private float precio;

    public Producto() {
    	
    }

    public Producto(String nombre, int qty, float precio) {
        this.nombre = nombre;
        this.qty = qty;
        this.precio = precio;
    }

    @Override
    public String toString() {
        return "Product{name='" + nombre + "', qty=" + qty + ", price=" + precio + "}";
    }

    public float total() {
        return qty * precio;
    }
}
