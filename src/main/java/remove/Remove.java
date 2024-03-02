package remove;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity_classes.PanCard;
import entity_classes.Person;

public class Remove {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("one_to_one_unid");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		Person p=em.find(Person.class,3);
		PanCard pan=p.getPancard();
		p.setPancard(null);
		
		et.begin();
			em.merge(p);
			em.remove(pan);
			
		et.commit();
		
		
	}

}
