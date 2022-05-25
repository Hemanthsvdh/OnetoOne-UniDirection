package onetomany;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import java.util.List;

public class FindMobileAndSim {
	public static void main(String[] args) {
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("Hema");
		EntityManager em=emf.createEntityManager();
		
		Mobile m=em.find(Mobile.class, 1);
		List<Sim> sims=m.getSims();
		if(m!=null) {
			System.out.println(m.getId());
			System.out.println(m.getName());
			System.out.println(m.getCost()); 
			for(Sim s:sims) {
				System.out.println(s.getProvider());
			}
		}
		else {
			System.out.println("invalid id");
		}
		
	}
}
