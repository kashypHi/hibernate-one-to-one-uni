package insert;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import entity_classes.PanCard;
import entity_classes.Person;

public class Insert {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("one_to_one_unid");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();

	PanCard pan1=new PanCard(101,"Delhi","1 JAN 2002");
	Person p1=new Person(1,"Anuj",895442661,pan1);
	
	PanCard pan2=new PanCard(102,"Maharastra","10 Feb 2005");
	Person p2=new Person(2,"Raghav",95889544,pan2);
	
	PanCard pan3=new PanCard(103,"Banglore","15 JAN 2003");
	Person p3=new Person(3,"Manoj",729544261,null);
	
	et.begin();
	em.persist(pan1);
	em.persist(pan2);
	em.persist(pan3);
	em.persist(p1);
	em.persist(p2);
	em.persist(p3);
	et.commit();
	}

}
