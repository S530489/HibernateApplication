package com.sai.testapp;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.sai.pojo.Employee;

public class testapp {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure();
		
		SessionFactory sf = cfg.buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction tx = session.beginTransaction();
		
		Employee emp = new Employee();
		
		emp.setEno(555);
		emp.setEname("FFF");
		emp.setEsal(6700);
		emp.setEaddr("HYD");
		
		session.save(emp);
		
		tx.commit();
		System.out.println("Employee inserted sucessfully");
		session.close();
		sf.close();
		

	}

}
