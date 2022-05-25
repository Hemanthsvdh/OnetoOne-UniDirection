package com.ty.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestPersonPan {
	public static void main(String[] args) {
	EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Hema");
	EntityManager em=entityManagerFactory.createEntityManager();
	EntityTransaction et=em.getTransaction();
	
	Person p=new Person();
	p.setName("hemanth");
	p.setEmail("hema@gmail");
	p.setPhone(23456789);
	
	Pan pan=new Pan();
	pan.setName("hemanth");
	pan.setAddress("banglore");
	pan.setPannum("BCD1234");
	
	p.setPan(pan);
	
	et.begin();
	em.persist(p);
	em.persist(pan);
	et.commit();
	}
	
}
