package fr.zaroumia.formation.spring._020;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("fr.zaroumia.formation.spring._020")
@PropertySource("classpath:database.properties")
public class Configuration020 {

}
