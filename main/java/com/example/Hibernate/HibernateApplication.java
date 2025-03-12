package com.example.Hibernate;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HibernateApplication {
	@PersistenceContext
	private EntityManager em;

	public static void main(String[] args) {
		SpringApplication.run(HibernateApplication.class, args);
	}

}
