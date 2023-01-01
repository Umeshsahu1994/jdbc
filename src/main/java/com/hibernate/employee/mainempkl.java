package com.hibernate.employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class mainempkl {

	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("umesh");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		employee e=new employee();
		e.setEmp_id(1258);
		e.setAddress("kanpur");
		e.setEmp_name("umesh");
		e.setSalary(12500);
		e.setEmp_role("manager");
		
		et.begin();
		em.persist(e);
		et.commit();

	}

}
