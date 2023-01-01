package com.hibernet.crudoperation;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.hibernate.teacher.Teacher;

public class TeacherCrudOperation {
	static EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("umesh");
	static EntityManager entityManager = entityManagerFactory.createEntityManager();
	static EntityTransaction entityTransaction = entityManager.getTransaction();

	public static void savedata(Teacher t)
	{		
		entityTransaction.begin();
		entityManager.persist(t);
		entityTransaction.commit();
		
		
	}
	public static void getdatabyid(int id)
	{
		

		Teacher t  = entityManager.find(Teacher.class , id );
		System.out.println(t);
		
	}
	public static void deletdat(int id)
	{
		Teacher t  = entityManager.find(Teacher.class , id );
		entityTransaction.begin();
		entityManager.remove(t);
		entityTransaction.commit();
		
	}
	public static void updatedat(Teacher t)
	{
		
		entityTransaction.begin();
		entityManager.merge(t);
		entityTransaction.commit();
		
		
	}

}
