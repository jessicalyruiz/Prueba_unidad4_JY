package ec.edu.uce.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ec.edu.uce.repository.modelo.CitaMedica;
import ec.edu.uce.repository.modelo.Doctor;

@Repository
@Transactional
public class CitaMedicaRepoImpl implements ICitaMedicaRepo{

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void create(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		this.entityManager.persist(citaMedica);
	}

	@Override
	public CitaMedica read(Integer id) {
		// TODO Auto-generated method stub
		return this.entityManager.find(CitaMedica.class, id);
	}

	@Override
	public void update(CitaMedica citaMedica) {
		// TODO Auto-generated method stub
		this.entityManager.merge(citaMedica);
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		this.entityManager.remove(this.read(id));
	}

	@Override
	public CitaMedica buscarNumero(String numero) {
		TypedQuery<CitaMedica> myQuery=this.entityManager.createQuery("Select c from CitaMedica c where c.numero=:valor", CitaMedica.class);
		myQuery.setParameter("valor", numero);
		return myQuery.getSingleResult();
	}

}
