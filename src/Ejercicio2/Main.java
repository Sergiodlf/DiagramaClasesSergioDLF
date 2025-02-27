package Ejercicio2;

public class Main {

	public static void main(String[] args) {
		Producto producto1 = new Producto("Monitor", 2, 500.0f);
		Producto producto2 = new Producto("Teclado", 2, 100.0f);
		Factura factura = new Factura("Miguel Goyena");
		factura.add(producto1);
		factura.add(producto2);

		System.out.print("Datos de todos los productos:\n" + factura.verDatosProductos());
		System.out.println("Total de la factura: " + factura.total() + " euros");
		System.out.println();
		System.out.print("Programa terminado");
	}

}
