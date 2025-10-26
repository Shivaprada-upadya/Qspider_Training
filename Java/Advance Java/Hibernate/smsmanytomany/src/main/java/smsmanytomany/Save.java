package smsmanytomany;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class Save {

	public static void main(String[] args) {
		
		
		EntityManager em = Persistence.createEntityManagerFactory("dev").createEntityManager();

		EntityTransaction et =em.getTransaction();
		
		
		
	}

}
