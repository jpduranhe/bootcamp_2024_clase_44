package clase_44.service;

public class Runner {

	public static void main(String[] args) {
		
		DatabaseService databaseService= new DatabaseService();
		ApiService apiservice= new ApiService();
		Los3ChanchitoDb objLos3ChanchitoDb= new Los3ChanchitoDb();
		
		
		AccesoADatos accesoADatos= new AccesoADatos(objLos3ChanchitoDb);
		
		
		
		accesoADatos.saveDato(new Dato());
		

	}

}
