package manytoone;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class GettingOrderAndItems {
	public static void main(String[] args) {
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("Hema");
		EntityManager em=emf.createEntityManager();
		
		Items items=em.find(Items.class, 1);
				if(items!=null) {
					System.out.println(items.getId());
					System.out.println(items.getName());
					System.out.println(items.getPrice());
					System.out.println(items.getQuantity());
					AmazonOrder order=items.getOrder();
					System.out.println(order.getAddress());
					System.out.println(order.getName());
					System.out.println(order.getStatus());
					
				}
				else {
					System.out.println("invalid id");
				}
	}

}
