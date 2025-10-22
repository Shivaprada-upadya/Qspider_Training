package ams;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class SelectAllAcHolderNumStartsFrom9 {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("dev");
		
		EntityManager em = emf.createEntityManager();
		
		String hbl = " FROM Account where phoneNum LIKE '9%'";
		
		Query query = em.createQuery(hbl);
		
		List<Account> accounts = query.getResultList();	
		
		for(Account a : accounts)
		{
			System.out.println(a);
		}
	}
}
