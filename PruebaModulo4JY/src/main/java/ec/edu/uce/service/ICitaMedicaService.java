package ec.edu.uce.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;

import ec.edu.uce.repository.modelo.CitaMedica;

public interface ICitaMedicaService {

	public void create(CitaMedica citaMedica);
	public CitaMedica read(Integer id); 
	public void update(CitaMedica citaMedica); 
	public void delete(Integer id); 
	
	public void agendarCita(String numero, LocalDateTime fecha, BigDecimal valor, String lugar, String cedulaDoctor, String cedulaPaciente);
	
	public void actualizarCita(String numero, String diagnostico, String receta, LocalDateTime fechaControl);
	public CitaMedica buscarNumero(String numero); 
	
}
