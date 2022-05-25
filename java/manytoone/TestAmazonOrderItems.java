package manytoone;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestAmazonOrderItems {
	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("Hema");
		EntityManager em=emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		Items item1=new Items();
		item1.setName("maza");
		item1.setPrice(100.00);
		item1.setQuantity(1);
		
		
		Items item2=new Items();
		item2.setName("burger");
		item2.setPrice(80.00);
		item2.setQuantity(1);
		
		
		Items item3=new Items();
		item3.setName("idli");
		item3.setPrice(45.00);
		item3.setQuantity(1);
		
		AmazonOrder amorder=new AmazonOrder();
		amorder.setAddress("banglore");
		amorder.setName("mohaseen");
		amorder.setStatus("preparing");
		item1.setOrder(amorder);
		item2.setOrder(amorder);
		item3.setOrder(amorder);
		
		et.begin();
		em.persist(amorder);
		em.persist(item1);
		em.persist(item2);
		em.persist(item3);
		et.commit();
	}
}
