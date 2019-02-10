package fr.zaroumia.formation.spring._023;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import({ Configuration023Dao.class, Configuration023Service.class })
public class Configuration023 {

}
