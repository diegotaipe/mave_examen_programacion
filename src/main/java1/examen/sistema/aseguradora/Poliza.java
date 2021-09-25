package examen.sistema.aseguradora;


public class Poliza implements Comparable<Poliza>{

	
	
	
	
	
	
	
	
	public int compareTo(Poliza o) {
		// TODO Auto-generated method stub
		if (this.edad > o.getEdad()) {
			return -1;
		} else if (this.edad == o.getEdad()) {
			return 0;
		} else {
			return 1;
		}
	}
}
