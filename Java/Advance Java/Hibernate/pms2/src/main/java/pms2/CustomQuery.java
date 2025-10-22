package pms2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class CustomQuery {

	public static void main(String[] args) {
		
		EntityManagerFactory emf= Persistence.createEntityManagerFactory("dev");
		
		EntityManager em = emf.createEntityManager();

		Query query=em.createQuery("select p.brand, p.name from Product p where p.price=12000");
		
		Object[] res=(Object[]) query.getSingleResult();
		
		String brand= (String)res[0];
		String price= (String)res[1];
		
		
		System.out.println(res.toString());
		System.out.println(brand);
		System.out.println(price);
		
		
		
	}

}
