package fr.zaroumia.formation.spring.dao._004;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

import fr.zaroumia.formation.spring.dao.DaoConfiguration;

@Configuration
@ComponentScan({ "fr.zaroumia.formation.spring.dao._004" })
@Import(DaoConfiguration.class)
public class Configuration004 {

}
