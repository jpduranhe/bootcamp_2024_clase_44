package profe_system.repository;

import profe_system.entity.Azafata;

public interface AzafataRepository {
	
	Azafata getAzafataByNombre(String name);
	void guardar(Azafata azafata);

}
