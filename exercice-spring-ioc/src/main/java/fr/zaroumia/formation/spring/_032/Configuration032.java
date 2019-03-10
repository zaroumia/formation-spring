package fr.zaroumia.formation.spring._032;

import java.util.HashSet;
import java.util.Set;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ConversionServiceFactoryBean;
import org.springframework.core.convert.converter.Converter;

@Configuration
@ComponentScan("fr.zaroumia.formation.spring._032")
public class Configuration032 {

	@Bean
	public FormationToFormationDtoConverter toFormationDtoConverter() {
		return new FormationToFormationDtoConverter();

	}

	@Bean
	public ConversionServiceFactoryBean conversionService() {
		ConversionServiceFactoryBean bean = new ConversionServiceFactoryBean();
		Set<Converter> converters = new HashSet<>();
		converters.add(toFormationDtoConverter());
		bean.setConverters(converters);
		return bean;

	}
}
