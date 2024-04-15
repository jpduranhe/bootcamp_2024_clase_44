package profe_system.entity;

public class Azafata extends Tripulacion {

	private int kilometrosVuelo;

	public Azafata(String name, double sueldoBase, int aniosEnAerolinea, int kilometrosVuelo) {
		super(name, sueldoBase, aniosEnAerolinea);
		this.kilometrosVuelo = kilometrosVuelo;
	}

	@Override
	public void calculoSueldo() {
		double bono = 0;
		if (this.kilometrosVuelo >= 400 && this.kilometrosVuelo < 2000) {
			bono = 180000;
		} else if (this.kilometrosVuelo >= 2000 && this.kilometrosVuelo < 5000) {
			bono = 250000;
		} else if (this.kilometrosVuelo >= 70000) {
			bono = 500000;
		}
		if (aniosEnAerolinea > 5) {
			bono = bono * 1.15;
		}

		this.sueldo = this.sueldoBase + bono;
	}

}
