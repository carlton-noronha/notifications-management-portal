package com.byethost12.carltonnoronha.webapp.configurations;

import java.util.Properties;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;

import com.zaxxer.hikari.HikariDataSource;

@Configuration
public class DataSourceConfig {
	@Bean
	public HikariDataSource dataSource() {
		HikariDataSource dataSource = new HikariDataSource();
		dataSource.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dataSource.setJdbcUrl("");
		dataSource.setUsername("");
		dataSource.setPassword("");
		return dataSource;
	}

	@Bean
	public LocalSessionFactoryBean sessionFactory() {
		LocalSessionFactoryBean sessionFactory = new LocalSessionFactoryBean();
		sessionFactory.setDataSource(dataSource());
		sessionFactory.setHibernateProperties(hibernateProperties());
		return sessionFactory;
	}

	private Properties hibernateProperties() {
		Properties hibernateProperties = new Properties();
		hibernateProperties.put("hibernate.dialect", "org.hibernate.dialect.MySQLDialect");
		return hibernateProperties;
	}
}
