package com.hibernate.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class GetAllData {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("umesh");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
        
		String jpql="select t from Teacher t";
		Query q = entityManager.createQuery(jpql);
		List<?> t = q.getResultList();
		System.out.println(t);
	}

}
