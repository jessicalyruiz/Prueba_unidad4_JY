package ec.edu.uce.repository;

import ec.edu.uce.repository.modelo.Doctor;

public interface IDoctorRepo {

	public void create(Doctor doctor);
	public Doctor read(Integer id); 
	public void update(Doctor doctor); 
	public void delete(Integer id); 
	
	public Doctor buscarCedula(String cedula);
}
