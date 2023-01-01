package com.hibernate.teacher;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;

import javax.persistence.Persistence;



public class Getdat {
public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("umesh");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
	
		
		Teacher t  = entityManager.find(Teacher.class , 11 );
		System.out.println(t);
	}
    
	
}
