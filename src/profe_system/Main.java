package profe_system;

import profe_system.entity.Azafata;
import profe_system.service.AzafataService;
import profe_system.service.impl.AzafataServiceImpl;
import profe_system.repository.*;
import profe_system.repository.impl.AzafataRepositoryMysqlImpl;
import profe_system.repository.impl.AzafataRepositoryOracleImpl;
public class Main {
	
	private static AzafataService azafataService;

	public static void main(String[] args) {
		
		AzafataRepository objAzafataRepositoryMysql= new AzafataRepositoryMysqlImpl();
		AzafataRepository objAzafataRepositoryOracle = new AzafataRepositoryOracleImpl();
		
		azafataService= new AzafataServiceImpl(objAzafataRepositoryOracle);
		
		
		Azafata azafataSharon= new Azafata("Sharon Forest",850000,1,488);
		procesarSueldo(azafataSharon);
		guardarAzafata(azafataSharon);
		
		Azafata azafataMaria= new Azafata("Maria Carr",1050000,8,4888);
		procesarSueldo(azafataMaria);
		guardarAzafata(azafataMaria);
	}
	
	
	private static void procesarSueldo(Azafata azafata) {
		azafataService.procesarSueldo(azafata);
	}
	private static void guardarAzafata(Azafata azafata) {
		azafataService.guardarAzafata(azafata);
	}

}
