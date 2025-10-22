package pms2;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateProduct {

	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");

		EntityManager em=emf.createEntityManager();
		
		EntityTransaction et=em.getTransaction();
		
		et.begin();
		
		Product pro=em.find(Product.class, 1);
		
		pro.setPrice(12000);
		
		Product UpdatePro = em.merge(pro);
		
		
		et.commit();
		

	}

}
