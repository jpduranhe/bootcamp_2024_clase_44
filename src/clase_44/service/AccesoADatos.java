package clase_44.service;

public class AccesoADatos {

	private Conexion conexion;
	
	
	public AccesoADatos(Conexion conexion) {
		this.conexion=conexion;
	}
	
	public Dato getDato() {
		return conexion.getDato();
	}
	
	public void saveDato(Dato dato) {
		conexion.setDato(dato);
	}
}
