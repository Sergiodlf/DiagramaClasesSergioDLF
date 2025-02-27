package ejercicio6;

import java.util.Objects;

public class CuentaBancaria {
	private String numero;
	private String titular;
	private double saldo;

	public CuentaBancaria(String numero, String titular) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = 0;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public void añadir(double cantidad) {
		if (cantidad > 0) {
			saldo += cantidad;
		}
	}

	public void retirar(double cantidad) {
		if (cantidad > 0 && saldo >= cantidad) {
			saldo -= cantidad;
		}
	}

	public String mostrarInformacion() {
		return "Número: " + numero + "\nTitular: " + titular + "\nSaldo: " + saldo;
	}

	@Override
	public int hashCode() {
		return Objects.hash(numero);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		CuentaBancaria other = (CuentaBancaria) obj;
		return Objects.equals(numero.toUpperCase(), other.numero.toUpperCase());
	}
}
