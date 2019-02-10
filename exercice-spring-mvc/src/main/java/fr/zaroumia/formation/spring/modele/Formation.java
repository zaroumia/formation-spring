package fr.zaroumia.formation.spring.modele;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "formations")
public class Formation {

	@Id
	private Integer id;
	private String titre;
	private String descriptif;

	public Formation(final Integer id, final String titre, final String descriptif) {
		super();
		this.id = id;
		this.titre = titre;
		this.descriptif = descriptif;
	}

	public Integer getId() {
		return id;
	}

	public void setId(final Integer id) {
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

}
