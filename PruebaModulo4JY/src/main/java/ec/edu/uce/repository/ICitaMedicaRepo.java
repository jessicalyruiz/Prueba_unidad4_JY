package ec.edu.uce.repository;

import ec.edu.uce.repository.modelo.CitaMedica;

public interface ICitaMedicaRepo {

	public void create(CitaMedica citaMedica);
	public CitaMedica read(Integer id); 
	public void update(CitaMedica citaMedica); 
	public void delete(Integer id); 
	public CitaMedica buscarNumero(String numero); 
}
