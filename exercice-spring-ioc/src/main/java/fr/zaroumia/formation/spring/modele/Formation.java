package fr.zaroumia.formation.spring.modele;

public class Formation {

	private Long id;
	private String titre;
	private String descriptif;

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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + (id == null ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(final Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (getClass() != obj.getClass()) {
			return false;
		}
		Formation other = (Formation) obj;
		if (id == null) {
			if (other.id != null) {
				return false;
			}
		} else if (!id.equals(other.id)) {
			return false;
		}
		return true;
	}

}
