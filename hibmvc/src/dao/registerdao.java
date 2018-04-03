package dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import userbean.userbean;

public class registerdao {

	public static void register(userbean user) {
		try {
			Configuration cfg=new Configuration();
			cfg.configure("hibernate.cfg.xml");
			SessionFactory factory=cfg.buildSessionFactory();
			Session session=factory.openSession();
			Transaction transaction=session.beginTransaction();
		    session.persist(user);
		    transaction.commit();
		
		
		}catch(Exception e) {
			System.out.println(e);
		}
	}

}
