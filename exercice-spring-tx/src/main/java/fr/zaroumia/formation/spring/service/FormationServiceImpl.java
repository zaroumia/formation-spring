package fr.zaroumia.formation.spring.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.TransactionCallback;
import org.springframework.transaction.support.TransactionTemplate;

import fr.zaroumia.formation.spring.dao.FormationDao;
import fr.zaroumia.formation.spring.modele.Formation;

@Service
public class FormationServiceImpl implements FormationService {

	@Autowired
	private FormationDao formationDao;

	@Autowired
	private TransactionTemplate transactionTemplate;

	// @Transactional()
	// @Override
	// public void create(final Formation formation) {
	// formationDao.create(formation);
	// formation.getLangues().forEach(langue ->
	// formationDao.createLangue(formation, langue));
	// }

	@Override
	public void create(final Formation formation) {

		transactionTemplate.execute(new TransactionCallback<Boolean>() {

			@Override
			public Boolean doInTransaction(final TransactionStatus status) {
				formationDao.create(formation);
				formation.getLangues().forEach(langue -> formationDao.createLangue(formation, langue));
				return true;
			}

		});
	}

}
