package ec.edu.uce.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ec.edu.uce.repository.modelo.Doctor;

@Repository
@Transactional
public class DoctorRepoImpl implements IDoctorRepo{

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void create(Doctor doctor) {
		// TODO Auto-generated method stub
		this.entityManager.persist(doctor);
	}

	@Override
	public Doctor read(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Doctor.class, id);
	}

	@Override
	public void update(Doctor doctor) {
		// TODO Auto-generated method stub
		this.entityManager.merge(doctor);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.read(id));
	}

	@Override
	public Doctor buscarCedula(String cedula) {
		TypedQuery<Doctor> myQuery=this.entityManager.createQuery("Select d from Doctor d where d.cedula=:valor", Doctor.class);
		myQuery.setParameter("valor", cedula);
		return myQuery.getSingleResult();
	}

}
