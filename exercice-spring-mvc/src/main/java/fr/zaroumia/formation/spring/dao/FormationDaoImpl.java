package fr.zaroumia.formation.spring.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;

import fr.zaroumia.formation.spring.modele.Formation;

@Repository
public class FormationDaoImpl implements FormationDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public void create(final Formation formation) {
		entityManager.persist(formation);
	}

	@Override
	public void update(final Formation formation) {
		Formation old = find(formation.getId());
		old.setDescriptif(formation.getDescriptif());
		old.setTitre(formation.getTitre());
	}

	@Override
	public void delete(final Formation formation) {
		Formation old = find(formation.getId());
		entityManager.remove(old);
	}

	@Override
	public Formation find(final Integer id) {
		return entityManager.find(Formation.class, id);
	}

	@Override
	public List<Formation> findAll() {
		TypedQuery<Formation> query = entityManager.createQuery("from Formation", Formation.class);
		return query.getResultList();
	}

}
