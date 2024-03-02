package Fetch;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import entity_classes.PanCard;
import entity_classes.Person;

public class fetch {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("one_to_one_unid");
		EntityManager em = emf.createEntityManager();
		
		
		Person p=em.find(Person.class,1);
		System.out.println(p);
		PanCard pan=p.getPancard();
		System.out.println(pan);
		
	}

	
}
