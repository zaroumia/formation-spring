package fr.zaroumia.formation.spring;

import javax.sql.DataSource;

import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.jdbc.datasource.DataSourceTransactionManager;
import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@Configuration
@ComponentScan({ "fr.zaroumia.formation.spring.dao", "fr.zaroumia.formation.spring.service" })
@PropertySource("classpath:database.properties")
@EnableTransactionManagement
public class AppConfiguration {

	@Value("${datasource.url}")
	private String url;
	@Value("${datasource.username}")
	private String username;
	@Value("${datasource.password}")
	private String password;
	@Value("${datasource.driverClassName}")
	private String driverClassName;

	@Bean
	public DataSource dataSource() {
		BasicDataSource dataSource = new BasicDataSource();
		dataSource.setUrl(url);
		dataSource.setUsername(username);
		dataSource.setPassword(password);
		dataSource.setDriverClassName(driverClassName);
		return dataSource;
	}

	@Bean
	public NamedParameterJdbcTemplate namedParameterJdbcTemplate(final DataSource dataSource) {
		return new NamedParameterJdbcTemplate(dataSource);
	}

	@Bean
	PlatformTransactionManager transactionManager(final DataSource dataSource) {
		return new DataSourceTransactionManager(dataSource);
	}

}
