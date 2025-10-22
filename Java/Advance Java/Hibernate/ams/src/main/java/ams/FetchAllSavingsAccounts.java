package ams;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class FetchAllSavingsAccounts {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		
		EntityManager em = emf.createEntityManager();

		String hbl ="FROM Account a where accType='savings'";
		
		Query query = em.createQuery(hbl);
		
		List<Account> accounts= query.getResultList();
		
		for(Account a: accounts)
		{
			System.out.println(a);
		}
		
		
	}

}
