package ems22;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class UpdateEmployee {

	public static void main(String[] args) {
		
		EntityManagerFactory emf=Persistence.createEntityManagerFactory("dev");
		
		EntityManager em=emf.createEntityManager();
		
		EntityTransaction et=em.getTransaction();
		
		et.begin();
		
		Employee emp =em.find(Employee.class, 1);
		
		emp.setRole("Java Full Stack Developer");
		
		Employee empupdate = em.merge(emp);
		
		System.out.println(empupdate);
		
		et.commit();
	}
}
