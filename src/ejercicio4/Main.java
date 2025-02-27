package ejercicio4;

public class Main {

	public static void main(String[] args) {
		Lista listaCompra = new Lista();
		Producto producto1 = new Producto("Leche", 2);
		Producto producto2 = new Producto("Arroz", 3);
		listaCompra.addProducto(producto1);
		listaCompra.addProducto(producto2);
		
		
		
		
        System.out.print("Todos los productos:\n" + listaCompra.verLista());
        System.out.println();
        System.out.print("Programa terminado");
	}
}
