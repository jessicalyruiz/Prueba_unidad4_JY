package ec.edu.uce.service;

import java.math.BigDecimal;
import java.time.LocalDateTime;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.repository.ICitaMedicaRepo;
import ec.edu.uce.repository.modelo.CitaMedica;
import ec.edu.uce.repository.modelo.Doctor;
import ec.edu.uce.repository.modelo.Paciente;

@Service
public class CitaMedicaServiceImpl implements ICitaMedicaService {

	@Autowired
	private ICitaMedicaRepo citaRepo;
	
	@Autowired
	private IDoctorService doctorService;
	
	@Autowired
	private IPacienteService pacienteService;

	@Override
	public void create(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		this.citaRepo.create(citaMedica);
	}

	@Override
	public CitaMedica read(Integer id) {
		// TODO Auto-generated method stub
		return this.citaRepo.read(id);
	}

	@Override
	public void update(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		this.citaRepo.update(citaMedica);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		this.citaRepo.delete(id);
	}

	@Override
	public void agendarCita(String numero, LocalDateTime fecha, BigDecimal valor, String lugar, String cedulaDoctor,
			String cedulaPaciente) {
		Doctor doctor=this.doctorService.buscarCedula(cedulaDoctor);
		
		Paciente paciente=this.pacienteService.buscarCedula(cedulaPaciente);
		
		CitaMedica cita=new CitaMedica();
		cita.setNumero(numero);
		cita.setFechaCita(fecha);
		cita.setValor(valor);
		cita.setLugar(lugar);
		cita.setDoctor(doctor);
		cita.setPaciente(paciente);
		this.create(cita);
		
		List<CitaMedica> citasDoctor=doctor.getCitas();
		citasDoctor.add(cita);
		this.doctorService.update(doctor);
		
		List<CitaMedica> citasPaciente=paciente.getCitas();
		citasPaciente.add(cita);
		this.pacienteService.update(paciente);
		
	}

	@Override
	public void actualizarCita(String numero, String diagnostico, String receta, LocalDateTime fechaControl) {
		// TODO Auto-generated method stub
		CitaMedica cita=this.buscarNumero(numero);
		cita.setDiagnostico(diagnostico);
		cita.setReceta(receta);
		cita.setFechaControl(fechaControl);
		this.update(cita);
	}

	@Override
	public CitaMedica buscarNumero(String numero) {
		// TODO Auto-generated method stub
		return this.citaRepo.buscarNumero(numero);
	}
	
}
