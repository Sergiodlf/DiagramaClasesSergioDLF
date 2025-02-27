package Ejercicio2;

import java.util.Objects;

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

    public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public float getPrecio() {
		return precio;
	}

	public void setPrecio(float precio) {
		this.precio = precio;
	}

	@Override
    public String toString() {
        return "Nombre:" + nombre + "\nCantidad:" + qty + "\nPrecio:" + precio;
    }

    public float total() {
        return qty * precio;
    }

	@Override
	public int hashCode() {
		return Objects.hash(nombre);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Producto other = (Producto) obj;
		return Objects.equals(nombre.toUpperCase(), other.nombre.toUpperCase());
	}
    
    
}
