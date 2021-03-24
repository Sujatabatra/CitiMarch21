package com.sujata.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

@Configuration
@ComponentScan(basePackages = "com.sujata")
public class ShareManagementConfig {

	@Bean
	public DriverManagerDataSource dataSource() {
		DriverManagerDataSource dbCon=new DriverManagerDataSource();
		dbCon.setDriverClassName("com.mysql.cj.jdbc.Driver");
		dbCon.setUrl("jdbc:mysql://localhost:3306/cititraining");
		dbCon.setUsername("root");
		dbCon.setPassword("sujata");
		return dbCon;
	}
	
	@Bean
	public JdbcTemplate jdbcTemplate() {
		JdbcTemplate jT=new JdbcTemplate();
		jT.setDataSource(dataSource());
		return jT;
	}
}
