package smss;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class save {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		
		Student st = new Student("shiva", "shivaprada2209@gmail",9876543211l);
	
		Subject sb = new Subject(101,"Core Java", 10,"3 Month");
		
		
		et.begin();
		em.persist(sb);
		
		//em.persist(st);
		
		
		et.commit();
	}

}
