package ec.edu.uce.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ec.edu.uce.repository.IDoctorRepo;
import ec.edu.uce.repository.modelo.Doctor;

@Service
public class DoctorServiceImpl implements IDoctorService{

	@Autowired
	private IDoctorRepo doctorRepo;

	@Override
	public void create(Doctor doctor) {
		// TODO Auto-generated method stub
		this.doctorRepo.create(doctor);
	}

	@Override
	public Doctor read(Integer id) {
		// TODO Auto-generated method stub
		return this.doctorRepo.read(id);
	}

	@Override
	public void update(Doctor doctor) {
		// TODO Auto-generated method stub
		this.doctorRepo.update(doctor);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		this.doctorRepo.delete(id);
	}

	@Override
	public Doctor buscarCedula(String cedula) {
		// TODO Auto-generated method stub
		return this.doctorRepo.buscarCedula(cedula);
	}
	
}
