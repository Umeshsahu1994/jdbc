package com.hibernate.teacher;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Updatedata {
public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("umesh");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		
		Teacher t= new Teacher();
		t.setId(12);
		t.setName("Viaks");
		t.setSubject("Advance Java");
		t.setSalary(89000.00);
		
		entityTransaction.begin();
		entityManager.merge(t);
		entityTransaction.commit();
		
		
	}
}
