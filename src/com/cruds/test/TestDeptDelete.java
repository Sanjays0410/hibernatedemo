package com.cruds.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.cruds.entity.Department;
import com.cruds.util.HibernateUtil;

public class TestDeptDelete {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		Department d = (Department) session.load(Department.class, new Integer(102));

		session.delete(d);
		tx.commit();
		session.close();

		HibernateUtil.shutdown();

	}

}
