package ejercicio6;

import java.util.Objects;

public class CuentaAhorro {
	private static final double INTERES = 0.02;
	private String numero;
	private String titular;
	private double saldo;

    public CuentaAhorro(String numero, String titular, double saldo) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
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

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public void aplicarInteres() {
        saldo += saldo * INTERES;
    }

    public String mostrarInformacion() {
        return "Interés: " + (INTERES * 100) + "%";
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
		CuentaAhorro other = (CuentaAhorro) obj;
		return Objects.equals(numero.toUpperCase(), other.numero.toUpperCase());
	}
    
    
}
