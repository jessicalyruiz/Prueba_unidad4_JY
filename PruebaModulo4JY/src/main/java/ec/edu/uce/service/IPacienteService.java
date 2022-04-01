package ec.edu.uce.service;

import ec.edu.uce.repository.modelo.Paciente;

public interface IPacienteService {

	public void create(Paciente paciente);
	public Paciente read(Integer id); 
	public void update(Paciente paciente); 
	public void delete(Integer id); 
	
	public Paciente buscarCedula(String cedula);
}
