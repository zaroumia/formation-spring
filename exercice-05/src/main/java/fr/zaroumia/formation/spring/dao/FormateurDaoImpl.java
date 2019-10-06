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
		Formateur old = find(f.getId());
		old.setAge(f.getAge());
		old.setNom(f.getNom());
		old.setPrenom(f.getPrenom());
		entityManager.persist(old);

	}

	@Override
	public void delete(final Formateur f) {
		entityManager.remove(find(f.getId()));
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
