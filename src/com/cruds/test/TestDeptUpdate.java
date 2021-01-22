package com.cruds.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.cruds.entity.Department;
import com.cruds.util.HibernateUtil;

public class TestDeptUpdate {

	
	public static void main(String[] args) {
		
		
		SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
		
		Session session = sessionFactory.openSession();
		
		Transaction tx = session.beginTransaction();

		Department d = (Department) session.load(Department.class,10);
		d.setDeptname("CSE");

		session.update(d);
		tx.commit();
		session.close();

	}
}
