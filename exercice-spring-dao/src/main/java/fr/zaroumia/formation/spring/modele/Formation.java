package fr.zaroumia.formation.spring.modele;

import java.util.ArrayList;
import java.util.List;

public class Formation {

	private Long id;
	private String titre;
	private String descriptif;
	private List<String> langues = new ArrayList<>();

	public Formation(final Long id, final String titre, final String descriptif) {
		super();
		this.id = id;
		this.titre = titre;
		this.descriptif = descriptif;
	}

	public Long getId() {
		return id;
	}

	public void setId(final Long id) {
		this.id = id;
	}

	public String getTitre() {
		return titre;
	}

	public void setTitre(final String titre) {
		this.titre = titre;
	}

	public String getDescriptif() {
		return descriptif;
	}

	public void setDescriptif(final String descriptif) {
		this.descriptif = descriptif;
	}

	@Override
	public String toString() {
		return "Formation [id=" + id + ", titre=" + titre + ", descriptif=" + descriptif + "]";
	}

	public List<String> getLangues() {
		return langues;
	}

	public void setLangues(final List<String> langues) {
		this.langues = langues;
	}

}
