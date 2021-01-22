package com.cruds.test;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.cruds.entity.Department;
import com.cruds.util.HibernateUtil;

public class TestDeptList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		SessionFactory sessionFactory = HibernateUtil
				.getSessionFactory();
				Session session = sessionFactory.openSession();
				Transaction tx =session.beginTransaction();
				
				List<Department> dlist = (List<Department>) session.createQuery("from Department").list();

				for(Department d : dlist)
				{
				System.out.println(d);
				}

				tx.commit();
				
				session.close();

				HibernateUtil.shutdown();

	}

}
