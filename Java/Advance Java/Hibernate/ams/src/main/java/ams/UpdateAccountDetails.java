package ams;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateAccountDetails {

	public static void main(String[] args) {
		
EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		
		EntityManager em = emf.createEntityManager();		
		
		EntityTransaction et=em.getTransaction();
		
		et.begin();
		
		Account a= em.find(Account.class,1000000000l );
		
		a.setBalance(a.getBalance()+1000);
		
		Account at=em.merge(a);
		
		System.out.println(at);
		
		et.commit();

	}

}
