package tr.com.huseyinaydin;

import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import jakarta.persistence.EntityTransaction;
import jakarta.persistence.Persistence;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

//بسم الله الرحمن الرحيم
/**
*
* @author Huseyin_Aydin
* @since 1994
* @category Java EE
*
*/

public class JpaDeneme {

	public static void main(String[] args) {
		Personel personel = new Personel();
		//personel.setPersonelid(1);
		personel.setPersonelAdi("Ramil");
		personel.setPersonelSoyadi("Qurbanov");	
	
		//---JPA------------------------------
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("PU_08_JPA");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction = entityManager.getTransaction();
		
		entityTransaction.begin();
		entityManager.persist(personel);
		entityTransaction.commit();
		
		System.out.println(personel);
		
		entityManager.close();
		entityManagerFactory.close();
		
		//---HIBERNATE------------------------------
		/*
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();		
		Session session = sessionFactory.openSession();
		
		session.beginTransaction();
			session.save(personel);	
		session.getTransaction().commit();
		*/
	}
}