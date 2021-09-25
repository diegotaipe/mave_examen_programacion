package examen.sistema.aseguradora;

public class PolizaGeneral extends Poliza {
	protected String codigoDescuento;
	protected String numeroSeguro;

	public String getCodigoDescuento() {
		return codigoDescuento;
	}

	public void setCodigoDescuento(String codigoDescuento) {
		this.codigoDescuento = codigoDescuento;
	}

	public String getNumeroSeguro() {
		return numeroSeguro;
	}

	public void setNumeroSeguro(String numeroSeguro) {
		this.numeroSeguro = numeroSeguro;
	}

	@Override
	public String toString() {
		return "PolizaGeneral [codigoDescuento=" + codigoDescuento + ", numeroSeguro=" + numeroSeguro + "]";
	}

}
