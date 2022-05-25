package onetomany;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestAccountAndPage {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Hema");
		EntityManager em= emf.createEntityManager();
		EntityTransaction et=em.getTransaction();
		
		UserAccount account=new UserAccount();
		account.setName("hemanth");
		account.setEmail("hem@123");
		account.setMobile(13343343);
		account.setPassword("hem123");
		
		Page page1= new Page();
		page1.setName("followerspage");
		page1.setTitle("follow");
		page1.setDiscription("followerpage");
		
		Page page2= new Page();
		page2.setName("Uploadpage");
		page2.setTitle("upload");
		page2.setDiscription("uploadpages");
		
		List<Page> pages=new ArrayList<Page>();
		pages.add(page1);
		pages.add(page2);
		
		account.setPages(pages);
		
		et.begin();
		em.persist(account);
		em.persist(page1);
		em.persist(page2);
		et.commit();
		
	}
	
}
