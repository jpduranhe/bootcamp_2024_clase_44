package profe_system.entity;

public class Capitan extends Tripulacion {
	
	private int horasVuelo;
	

	public Capitan(String name, double sueldoBase, int aniosEnAerolinea) {
		super(name, sueldoBase, aniosEnAerolinea);
	}

	@Override
	public void calculoSueldo() {
		double bono=0;
		if(this.horasVuelo>= 700 && this.horasVuelo< 21000) {
			bono=500000;
		}else if(this.horasVuelo>= 21000 && this.horasVuelo< 70000) {
			bono=950000;
		}else if(this.horasVuelo>= 70000){
			bono=1500000;
		}
			if(aniosEnAerolinea >5){
				bono= bono * 1.35;
			}

			this.sueldo=this.sueldoBase+bono;
	}
	
}
