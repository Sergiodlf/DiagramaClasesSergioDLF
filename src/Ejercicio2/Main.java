package Ejercicio2;

public class Main {

	public static void main(String[] args) {
		Producto product01 = new Producto("Monitor", 2, 500.0f);
        Producto producto2 = new Producto("Teclado", 2, 100.0f);
        Factura factura = new Factura("Miguel Goyena");
        factura.add(product01);
        factura.add(producto2);

        System.out.println("Total de la factura: " + factura.total() +" euros");
        System.out.println();
        System.out.print("Programa terminado");
	}

}
