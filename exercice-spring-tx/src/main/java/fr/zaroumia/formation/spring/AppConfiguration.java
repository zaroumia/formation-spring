package fr.zaroumia.formation.spring;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan({ "fr.zaroumia.formation.spring.dao", "fr.zaroumia.formation.spring.service" })
public class AppConfiguration {

}
