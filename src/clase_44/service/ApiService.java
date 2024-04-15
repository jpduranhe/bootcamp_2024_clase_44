package clase_44.service;

public class ApiService implements Conexion {

	@Override
	public Dato getDato() {
		return new Dato();
	}

	@Override
	public void setDato(Dato dato) {
		System.out.println("Guardando con api service: "+ dato);

	}

}
