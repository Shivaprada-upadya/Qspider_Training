package ams;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SelectAccountDetails {

	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		
		EntityManager em = emf.createEntityManager();		
		
		Account a= em.find(Account.class,1000000000l );
		
		System.out.println(a);
	}
	
}
