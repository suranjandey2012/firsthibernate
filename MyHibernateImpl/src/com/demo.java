package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class demo {

	public static void main(String[] args) {
	    Employee e=new Employee();
	    e.setEmployeeId("Km22");
	    e.setEmployeename("Kalyan Mahato");
	    e.setSalary(25000);
	    
	    try{
	    	Configuration cfg=new Configuration();
	    	cfg.configure("hibernate.cfg.xml");
	    	SessionFactory sessionfactory=cfg.buildSessionFactory();
	    	Session session=sessionfactory.openSession();
	    	
	    	Transaction t=session.beginTransaction();
	    	session.save(e);
	    	t.commit();
	    	session.close();
	    	System.out.println("Saved Data Successfully");
	    	
	    }catch(Exception ex)
	    {
	    	ex.printStackTrace();
	    }

	}

}
