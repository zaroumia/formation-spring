package fr.zaroumia.formation.spring._032;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.core.convert.ConversionService;

import fr.zaroumia.formation.spring.modele.Formation;

public class Main032 {
	public static void main(final String[] args) {
		ApplicationContext applicationContext = new AnnotationConfigApplicationContext(Configuration032.class);

		Formation formation = new Formation(1001L, "Formation Spring", "un descriptif de plus de 20 caractère");

		ConversionService bean = applicationContext.getBean(ConversionService.class);

		System.out.println(bean.convert(formation, FormationDto.class));
		System.out.println(bean.convert("25", Integer.class));

	}
}
