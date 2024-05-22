package tr.com.huseyinaydin.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import tr.com.huseyinaydin.Personel;

//بسم الله الرحمن الرحيم
/**
*
* @author Huseyin_Aydin
* @since 1994
* @category Java EE
*
*/

public class HibernateDeneme {

	public static void main(String[] args) {
		
		Personel personel = new Personel();
		//personel.setPersonelid(1);
		personel.setPersonelAdi("Huseyin");
		personel.setPersonelSoyadi("Aydin");
		personel.setPersonelEmail("huseyinaydin99@gmail.com");
		SessionFactory sessionFactory = new Configuration().configure().buildSessionFactory();
		Session session = sessionFactory.openSession();
		session.beginTransaction();
		session.save(personel);	
		session.getTransaction().commit();
	}	
}