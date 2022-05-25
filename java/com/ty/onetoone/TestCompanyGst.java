package com.ty.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestCompanyGst {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Hema");
		EntityManager em=entityManagerFactory.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Company c=new Company();
		c.setName("had");
		c.setWeb("had@gmail");
		c.setPhone(23456789);
		
		Gst gst=new Gst();
		gst.setGstnum("had1234");
		gst.setState("Karnataka");
		gst.setCountry("India");
		
		gst.setCompany(c);
		
		et.begin();
		em.persist(c);
		em.persist(gst);
		et.commit();
		}

	
}
