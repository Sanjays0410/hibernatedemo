package com.cruds.test;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;

import com.cruds.entity.Department;
import com.cruds.util.HibernateUtil;

public class TestDeptQuery {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SessionFactory sf=HibernateUtil.getSessionFactory();
		Session session=sf.openSession();
		//String hql="from Department d where d.deptid=:dept";
		
	//String hql="from Department  d where d.deptid=102";
		
		
	//	Query query=session.createQuery(hql);
	//	query.setParameter("dept",102);
		
		Criteria cr=session.createCriteria(Department.class);
		cr.add(Restrictions.eq("deptid",102));
	//	cr.add(Restrictions.eq("deptid", 103));
		
		 List<Department> dlist=cr.list();
		 
		 for(Department d:dlist)
		 {
			 System.out.println(d);
		 }
		 
		 //to recovery from hang belove will be used...
		 session.close();
		 HibernateUtil.shutdown();

	}

}
