package fr.zaroumia.formation.spring.dao;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Repository;

import fr.zaroumia.formation.spring.model.Formateur;

@Repository
public class FormateurDaoImpl implements FormateurDao {

	private final Set<Formateur> data = new HashSet<>();

	@Override
	public void create(final Formateur f) {
		data.add(f);
	}

	@Override
	public void update(final Formateur f) {
		Formateur entity = data.stream().filter(formateur -> f.getId().equals(formateur.getId())).findFirst()
				.orElseThrow(() -> new IllegalArgumentException("formateur introuvable"));
		entity.setAge(f.getAge());
		entity.setNom(f.getNom());
		entity.setPrenom(f.getPrenom());
	}

	@Override
	public void delete(final Formateur f) {
		data.remove(f);

	}

	@Override
	public Formateur find(final Long id) {
		return data.stream().filter(formateur -> id.equals(formateur.getId())).findFirst()
				.orElseThrow(() -> new IllegalArgumentException("formateur introuvable"));
	}

	@Override
	public Collection<Formateur> findAll() {
		return new HashSet<>(data);

	}

}
