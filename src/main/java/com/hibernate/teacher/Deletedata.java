package com.hibernate.teacher;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Deletedata {
	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("umesh");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();

		Teacher t = entityManager.find(Teacher.class, 13);

		if (t != null) {
			entityTransaction.begin();
			entityManager.remove(t);
			entityTransaction.commit();
		} else {
			System.out.println("Data is not present in table");
		}
	}
}
