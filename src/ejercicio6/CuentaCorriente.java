package ejercicio6;

import java.util.Objects;

public class CuentaCorriente {
	private String numero;
	private String titular;
	private double saldo;
	private double limiteDescubierto;

    public CuentaCorriente(String numero, String titular, double saldo, double limiteDescubierto) {
        this.numero = numero;
        this.titular = titular;
        this.saldo = saldo;
        this.limiteDescubierto = limiteDescubierto;
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

	public double getLimiteDescubierto() {
		return limiteDescubierto;
	}

	public void setLimiteDescubierto(double limiteDescubierto) {
		this.limiteDescubierto = limiteDescubierto;
	}

	public void retirar(double cantidad) {
        if (cantidad > 0 && (saldo - cantidad) >= -limiteDescubierto) {
            saldo -= cantidad;
        }
    }

    public String mostrarInformacion() {
        return "Número: " + numero + "\nTitular: " + titular + "\nSaldo: " + saldo +"\nLímite de descubierto: " + limiteDescubierto;
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
		CuentaCorriente other = (CuentaCorriente) obj;
		return Objects.equals(numero.toUpperCase(), other.numero.toUpperCase());
	}
    
}
