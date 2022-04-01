package ec.edu.uce;




import java.math.BigDecimal;
import java.time.LocalDate;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import ec.edu.uce.repository.modelo.Doctor;
import ec.edu.uce.repository.modelo.Paciente;
import ec.edu.uce.service.IDoctorService;
import ec.edu.uce.service.IPacienteService;

@SpringBootApplication
public class PruebaModulo4JyApplication implements CommandLineRunner{

	private static Logger LOG=Logger.getLogger(PruebaModulo4JyApplication.class);
	
	@Autowired
	private IDoctorService doctorService; 
	
	@Autowired
	private IPacienteService pacienteService;
	
	public static void main(String[] args) {
		SpringApplication.run(PruebaModulo4JyApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		LOG.info("prueba modulo 4");
		/*
		Doctor doctor=new Doctor();
		doctor.setApellido("Yanez");
		doctor.setCedula("2300115066");
		doctor.setCodigoSenescyt("qwe-45");
		doctor.setFechaNacimiento(LocalDate.of(1992, 06, 24));
		doctor.setNombre("Lorena");
		doctor.setNumeroConsultorio(5);
		doctor.setSueldo(new BigDecimal(3000));
		
		this.doctorService.create(doctor);*/
		/*
		Paciente paciente=new Paciente();
		paciente.setApellido("Perez");
		paciente.setCedula("3698");
		paciente.setCodigoIess("poiu-789");
		paciente.setEdad(50);
		paciente.setEstatura(new BigDecimal(150.6));
		paciente.setFechaNacimiento(LocalDate.of(1960, 05, 10));
		paciente.setNombre("Gumercindo");
		paciente.setPeso(new BigDecimal(60.4));
		
		this.pacienteService.create(paciente);
		
		Paciente paciente2=new Paciente();
		paciente2.setApellido("Gonzalez");
		paciente2.setCedula("7894856");
		paciente2.setCodigoIess("lku-4895");
		paciente2.setEdad(30);
		paciente2.setEstatura(new BigDecimal(170.6));
		paciente2.setFechaNacimiento(LocalDate.of(1992, 05, 10));
		paciente2.setNombre("Pepito");
		paciente2.setPeso(new BigDecimal(70.4));
		this.pacienteService.create(paciente2);*/
		
	}

}
