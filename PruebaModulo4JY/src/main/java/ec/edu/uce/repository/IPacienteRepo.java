package ec.edu.uce.repository;

import ec.edu.uce.repository.modelo.Doctor;
import ec.edu.uce.repository.modelo.Paciente;

public interface IPacienteRepo {

	public void create(Paciente paciente);
	public Paciente read(Integer id); 
	public void update(Paciente paciente); 
	public void delete(Integer id); 
	
	public Paciente buscarCedula(String cedula);
}
