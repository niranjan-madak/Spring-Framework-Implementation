package com.madak.Hibernate_Demo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;





public class App 
{
    public static void main( String[] args )
    {
    	
         Fruits f=new Fruits();   
//       f.setId(2);
//       f.setName("apple");
//       f.setLocation("shimla");      // for saving data into database.
//       f.setPrice(80);
//       f.setTest("more sweet");
      
       
       
        
       Configuration con=new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Fruits.class);
       SessionFactory sf= con.buildSessionFactory();
       Session session=sf.openSession();
       Transaction tx=session.beginTransaction();
       
       //session.save(f);   // for saving data into database.
       
       f=(Fruits)session.get(Fruits.class,1); // getting data by id
       
       System.out.println(f);
       
       tx.commit();
    }
}
