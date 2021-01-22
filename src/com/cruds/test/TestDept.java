package com.cruds.test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.cruds.entity.Department;
import com.cruds.util.HibernateUtil;

public class TestDept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory sf=HibernateUtil.getSessionFactory();
		
		Session session=sf.openSession();
		Transaction tx=session.beginTransaction();
		Department d=new Department(103,"CSE");
		
		session.save(d);
		tx.commit();
		HibernateUtil.shutdown();

	}

}
