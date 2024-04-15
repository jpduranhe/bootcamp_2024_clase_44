package profe_system.service.impl;

import profe_system.entity.Azafata;
import profe_system.repository.AzafataRepository;
import profe_system.service.AzafataService;

public class AzafataServiceImpl implements AzafataService {
	
	private AzafataRepository objAzafataRepository;
	
	
	public AzafataServiceImpl(AzafataRepository objAzafataRepository) {
		this.objAzafataRepository=objAzafataRepository;
	} 
	

	@Override
	public Azafata getAzafataByNombre(String nombre) {
		return objAzafataRepository.getAzafataByNombre(nombre);
	}

	@Override
	public void procesarSueldo(Azafata azafata) {
		azafata.calculoSueldo();
		System.out.println("La azafata "+azafata.getName()+" sueldo es "+azafata.getSueldo());
		
	}

	@Override
	public void guardarAzafata(Azafata azafata) {
		
		objAzafataRepository.guardar(azafata);
		
	}

}
