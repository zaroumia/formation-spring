package fr.zaroumia.formation.spring.dao;

import java.util.Collection;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import fr.zaroumia.formation.spring.model.Formateur;

@Repository
public class FormateurDaoImpl implements FormateurDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void create(final Formateur f) {
		entityManager.persist(f);
	}

	@Override
	public void update(final Formateur f) {
		Formateur oldVal = find(f.getId());
		oldVal.setAge(f.getAge());
		oldVal.setNom(f.getNom());
		oldVal.setPrenom(f.getPrenom());
		entityManager.persist(oldVal);
	}

	@Override
	public void delete(final Formateur f) {
		Formateur oldVal = find(f.getId());
		entityManager.remove(oldVal);
	}

	@Override
	public Formateur find(final Long id) {
		return entityManager.find(Formateur.class, id);
	}

	@Override
	public Collection<Formateur> findAll() {
		String query = "select e from Formateur e ";
		return entityManager.createQuery(query, Formateur.class).getResultList();
	}

}
