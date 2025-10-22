package ams;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class DeleteAccountDetails {

	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		
		EntityManager em = emf.createEntityManager();		
		
		EntityTransaction et=em.getTransaction();
		
		et.begin();
		
		Account a= em.find(Account.class,1000000006l );
		
		em.remove(a);
		
		et.commit();

	}

}
