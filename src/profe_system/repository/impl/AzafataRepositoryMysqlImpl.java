package profe_system.repository.impl;

import profe_system.entity.Azafata;
import profe_system.repository.AzafataRepository;

public class AzafataRepositoryMysqlImpl implements AzafataRepository {

	@Override
	public Azafata getAzafataByNombre(String name) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void guardar(Azafata azafata) {
		System.out.println("La azafata "+azafata.getName()+" fue guardada en mysqk");
		
	}

}
