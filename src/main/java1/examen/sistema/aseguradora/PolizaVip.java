package examen.sistema.aseguradora;

public class PolizaVip extends Poliza {
	protected String Beneficio;

	public String getBeneficio() {
		return Beneficio;
	}

	public void setBeneficio(String beneficio) {
		Beneficio = beneficio;
	}

	@Override
	public String toString() {
		return "PolizaVip [Beneficio=" + Beneficio + "]";
	}

}
