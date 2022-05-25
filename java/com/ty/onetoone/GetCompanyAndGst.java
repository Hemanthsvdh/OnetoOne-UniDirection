package com.ty.onetoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class GetCompanyAndGst {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Hema");
		EntityManager em=entityManagerFactory.createEntityManager();
	
		Gst gst=em.find(Gst.class, 1);
		System.out.println(gst.getId());
		System.out.println(gst.getGstnum());
		System.out.println(gst.getCountry());
		
		System.out.println(gst.getCompany().getId());
		System.out.println(gst.getCompany().getName());
		System.out.println(gst.getCompany().getPhone());

		System.out.println("-------------");
		Company c=em.find(Company.class, 1);
		System.out.println(c.getId());
		System.out.println(c.getName());
		System.out.println(c.getPhone());
		
		System.out.println(c.getGst().getId());
		System.out.println(c.getGst().getGstnum());
		System.out.println(c.getGst().getCountry());
		
		

	}
}
