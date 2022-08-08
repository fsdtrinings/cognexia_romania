package mainapp;

import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class SessionFactoryUtil {

	static SessionFactory factory;
	
	static{
		System.out.println("------------- Static block start -------------");
		Configuration cfg = new Configuration();
		factory = cfg.configure().buildSessionFactory();
		System.out.println("------------- Static block end -------------");
	}

	public static SessionFactory getFactory() {
		return factory; // database connection factory
	}
	
	
}
