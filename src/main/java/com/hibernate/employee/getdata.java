package com.hibernate.employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class getdata {
	
	public static void main(String args[]) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("umesh");
		EntityManager em=emf.createEntityManager();
		
		employee y = em.find(employee.class,1258);
		System.out.println(y);
		
	}

}
