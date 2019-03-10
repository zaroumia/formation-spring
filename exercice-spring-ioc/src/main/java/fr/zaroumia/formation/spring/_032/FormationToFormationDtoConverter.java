package fr.zaroumia.formation.spring._032;

import org.springframework.core.convert.converter.Converter;

import fr.zaroumia.formation.spring.modele.Formation;

public class FormationToFormationDtoConverter implements Converter<Formation, FormationDto> {

	@Override
	public FormationDto convert(final Formation source) {

		FormationDto dto = new FormationDto();
		dto.setId(source.getId());
		dto.setTitre(source.getTitre());

		String descriptifCourt = source.getDescriptif();

		if (source.getDescriptif() != null && source.getDescriptif().length() > 20) {
			descriptifCourt = source.getDescriptif().substring(0, 20) + " ...";
		}

		dto.setDescriptifCourt(descriptifCourt);
		return dto;
	}

}
