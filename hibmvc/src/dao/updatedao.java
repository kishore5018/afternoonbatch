package dao;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import userbean.userbean;

public class updatedao {

	public static void update(userbean user) {
		try {
			Configuration cfg=new Configuration();
			cfg.configure("hibernate.cfg.xml");
			SessionFactory factory=cfg.buildSessionFactory();
			Session session=factory.openSession();
			Transaction transaction=session.beginTransaction();
			Query query=session.createQuery("from userbean =:user");
			query.setString("user", user.getUsername());
			userbean user1=(userbean)query.uniqueResult();
			user1.setPassword(user.getPassword());
			user1.setEmail(user.getEmail());
			session.update(user1);
			transaction.commit();
			
			
			
			
		}catch(Exception e) {
			System.out.println(e);
		}
		
	}

}
