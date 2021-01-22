package com.cruds.test;

import java.util.Set;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.cruds.entity.Phone;
import com.cruds.entity.Student;
import com.cruds.util.HibernateUtil;

public class TestStudUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		SessionFactory sessionFactory=HibernateUtil.getSessionFactory();
		Session session=sessionFactory.openSession();
		Transaction tx=session.beginTransaction();
		
		Student d = (Student) session.load(Student.class,new Long(10));
		
		//Set<Phone> phones = new HashSet<Phone>();
		//we need to get Set values why coz of collections are lazy
		
		Set<Phone> phones = d.getStudentPhoneNumbers();
		Phone p1 = new Phone("Wife","2345");
		phones.add(p1);
		
		d.setStudentPhoneNumbers(phones);
		
		session.update(d);
		tx.commit();
		session.close();
	}

}
