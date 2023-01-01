package com.hibernate.jpql;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;



public class GetAllDataEmployee {

	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("umesh");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
        
		String jpql="select e from employee e";
		Query u = entityManager.createQuery(jpql);
	  List s = u.getResultList();
	  System.out.println(s);

	}

}

