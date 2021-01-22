package com.cruds.test;


import java.util.HashSet;

import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.cruds.entity.Address;
import com.cruds.entity.Course;
import com.cruds.entity.Phone;
import com.cruds.entity.Student;
import com.cruds.util.HibernateUtil;

public class TestStudent {

	public static void main(String[] args) {
		

		
		SessionFactory sessionFactory = HibernateUtil
				.getSessionFactory();
				Session session = sessionFactory.openSession();
				Transaction tx =session.beginTransaction();

				Address a1 = new Address("Business Fund,20th Main", "Bangalore", "Karnataka", "560072");
				/*Student s1 = new Student("Ramya", a1);
				Student s2 = new Student("Soumya", a1);
				session.save(a1);
				session.save(s1);
				session.save(s2);*/
				
				
			Set<Phone> phones = new HashSet<Phone>();
				Phone p1 = new Phone("Mobile", "9448124163");
				Phone p2 = new Phone("Home", "9448124888");
				phones.add(p1);
				phones.add(p2);

				/*Student s1 = new Student("Ramya",phones);
				
				session.save(s1);*/

				
				Set<Course> courses = new HashSet<Course>();
				courses.add(new Course("Science"));
				courses.add(new Course("Computer Science"));

				Student s1 = new Student("Mohan", a1, phones, courses);
					//	Student s2 = new Student("Mohan",,a1,courses);

						session.save(s1);
					//	session.save(s2);

				System.out.println("Created Success");
				
					tx.commit();
				
				session.close();

				HibernateUtil.shutdown();

	}
}
