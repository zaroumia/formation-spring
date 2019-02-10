package fr.zaroumia.formation.spring.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import fr.zaroumia.formation.spring.modele.Formation;

@Repository
public class FormationDaoImpl implements FormationDao {

	@PersistenceContext
	private EntityManager entityManager;

	@Override
	@Transactional
	public void create(final Formation formation) {

		entityManager.persist(formation);
	}

	@Override
	@Transactional
	public void update(final Formation formation) {
		Formation oldEntity = entityManager.find(Formation.class, formation.getId());
		oldEntity.setTitre(formation.getTitre());
		oldEntity.setDescriptif(formation.getDescriptif());
		entityManager.persist(oldEntity);
	}

	@Override
	@Transactional
	public void delete(final Formation formation) {
		Formation oldEntity = entityManager.find(Formation.class, formation.getId());
		entityManager.remove(oldEntity);
	}

	@Override
	public Formation find(final Integer id) {
		return entityManager.find(Formation.class, id);

	}

	@Override
	public List<Formation> findAll() {
		String q = "FROM Formation";
		return entityManager.createQuery(q, Formation.class).getResultList();
	}

}
