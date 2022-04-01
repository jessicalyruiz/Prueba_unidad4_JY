package ec.edu.uce.service;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;

import java.math.BigDecimal;
import java.time.LocalDate;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.transaction.annotation.Transactional;

import ec.edu.uce.repository.modelo.Doctor;

@Transactional
@Rollback(true)
@SpringBootTest
class DoctorServiceImplTest {

	@Autowired
	IDoctorService doctorService;
	
	@Test
	void testCreate() {
		//fail("Not yet implemented");
		Doctor doctor=new Doctor();
		doctor.setApellido("Ruiz");
		doctor.setCedula("15066");
		doctor.setCodigoSenescyt("ytie-45");
		doctor.setFechaNacimiento(LocalDate.of(1995, 06, 24));
		doctor.setNombre("Jessica");
		doctor.setNumeroConsultorio(7);
		doctor.setSueldo(new BigDecimal(3800));
		
		this.doctorService.create(doctor);
		
		assertThat(doctor).isExactlyInstanceOf(Doctor.class);
		
	}

	@Test
	void testCreate2() {
		//fail("Not yet implemented");
		Doctor doctor=new Doctor();
		doctor.setApellido("Lincango");
		doctor.setCedula("1789562");
		doctor.setCodigoSenescyt("qwer-78");
		doctor.setFechaNacimiento(LocalDate.of(1994, 06, 24));
		doctor.setNombre("Pedro");
		doctor.setNumeroConsultorio(8);
		doctor.setSueldo(new BigDecimal(4000));
		
		this.doctorService.create(doctor);
		
		assertThat(doctor.getId()).isNotNull();
		
	}
}
