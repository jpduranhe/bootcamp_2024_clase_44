package clase_44.service;

public class DatabaseService implements Conexion {

	@Override
	public Dato getDato() {
		return new Dato();
	}

	@Override
	public void setDato(Dato dato) {
		System.out.println("Guardando con databases service: "+ dato);
		
	}
}
