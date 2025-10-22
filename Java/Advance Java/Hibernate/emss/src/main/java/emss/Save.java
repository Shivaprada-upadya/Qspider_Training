package emss;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		
		EntityManager em = emf.createEntityManager();
		
		Department d = new Department(102,"Mangalore","Engineer");
		
		Employee e = new Employee("krishna", 88990,"HR","hr@gmail.com" , 85644321l);

		
		EntityTransaction et = em.getTransaction();
		
		e.setDept(d);
		et.begin();
		
		em.persist(d);
		
		em.persist(e);
		
		et.commit();
		
		
	}

}
