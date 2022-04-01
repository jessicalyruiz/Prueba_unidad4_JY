package ec.edu.uce.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ec.edu.uce.repository.modelo.Doctor;
import ec.edu.uce.repository.modelo.Paciente;

@Repository
@Transactional
public class PacienteRepoImpl implements IPacienteRepo {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void create(Paciente paciente) {
		// TODO Auto-generated method stub
		this.entityManager.persist(paciente);
	}

	@Override
	public Paciente read(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(Paciente.class, id);
	}

	@Override
	public void update(Paciente paciente) {
		// TODO Auto-generated method stub
		this.entityManager.merge(paciente);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.read(id));
	}

	@Override
	public Paciente buscarCedula(String cedula) {
		TypedQuery<Paciente> myQuery=this.entityManager.createQuery("Select p from Paciente p where p.cedula=:valor", Paciente.class);
		myQuery.setParameter("valor", cedula);
		return myQuery.getSingleResult();
	}

}
