package fr.zaroumia.formation.spring.service;

import java.util.Collection;

import fr.zaroumia.formation.spring.dao.FormateurDao;
import fr.zaroumia.formation.spring.model.Formateur;

public class FormateurServiceImpl implements FormateurService {

	private FormateurDao formateurDao;

	@Override
	public void create(final Formateur f) {
		formateurDao.create(f);

	}

	@Override
	public void update(final Formateur f) {
		formateurDao.update(f);
	}

	@Override
	public void delete(final Formateur f) {
		formateurDao.delete(f);

	}

	@Override
	public Collection<Formateur> findAll() {
		return formateurDao.findAll();
	}

	@Override
	public Formateur find(final Long id) {
		return formateurDao.find(id);
	}

	public void setFormateurDao(final FormateurDao formateurDao) {
		this.formateurDao = formateurDao;
	}

}
