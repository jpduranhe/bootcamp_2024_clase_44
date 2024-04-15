package profe_system.service;

import profe_system.entity.Azafata;

public interface AzafataService {

	Azafata getAzafataByNombre(String nombre);
	void procesarSueldo(Azafata azafata);
	void guardarAzafata(Azafata azafata);
}
