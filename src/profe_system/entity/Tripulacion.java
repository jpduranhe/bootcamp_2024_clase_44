package profe_system.entity;

public abstract class Tripulacion {
	
	protected String name;
	protected double sueldoBase;
	protected double sueldo;
	protected int aniosEnAerolinea;
	
	
	
	public Tripulacion(String name, double sueldoBase, int aniosEnAerolinea) {
		this.name = name;
		this.sueldoBase = sueldoBase;
		this.aniosEnAerolinea = aniosEnAerolinea;
	}


	public abstract void calculoSueldo();


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public double getSueldo() {
		return sueldo;
	}


	public void setSueldo(double sueldo) {
		this.sueldo = sueldo;
	}


	public int getAntiguedadAerolinea() {
		return aniosEnAerolinea;
	}


	public void setAntiguedadAerolinea(int aniosEnAerolinea) {
		this.aniosEnAerolinea = aniosEnAerolinea;
	}
	

}
