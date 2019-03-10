package fr.zaroumia.formation.spring._032;

public class FormationDto {

	private Long id;
	private String titre;
	private String descriptifCourt;

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

	public String getDescriptifCourt() {
		return descriptifCourt;
	}

	public void setDescriptifCourt(final String descriptifCourt) {
		this.descriptifCourt = descriptifCourt;
	}

	@Override
	public String toString() {
		return "FormationDto [id=" + id + ", titre=" + titre + ", descriptifCourt=" + descriptifCourt + "]";
	}

}
