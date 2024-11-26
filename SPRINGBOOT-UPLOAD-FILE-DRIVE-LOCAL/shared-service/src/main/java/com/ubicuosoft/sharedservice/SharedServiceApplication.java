package com.ubicuosoft.sharedservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.autoconfigure.mongo.MongoAutoConfiguration;
import org.springframework.boot.autoconfigure.orm.jpa.HibernateJpaAutoConfiguration;

@SpringBootApplication(exclude = {
		MongoAutoConfiguration.class,         // Excluir configuración de MongoDB
		HibernateJpaAutoConfiguration.class,   // Excluir configuración de JPA y Hibernate (PostgreSQL)
		DataSourceAutoConfiguration.class   // Excluir configuración de DataSource
})

public class SharedServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(SharedServiceApplication.class, args);
	}

}
