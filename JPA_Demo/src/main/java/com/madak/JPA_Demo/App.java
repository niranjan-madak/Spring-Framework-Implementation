package com.madak.JPA_Demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

class App 
{
    public static void main( String[] args )
    {
      Friends frnd=new Friends();
      
//      frnd.setId(4);
//      frnd.setName("vicky maddheshiya");   // for inserting data into database
//      frnd.setAddress("Gorakhpur");
//      
      
      EntityManagerFactory emf=Persistence.createEntityManagerFactory("pu");
      EntityManager em=emf.createEntityManager();
      em.getTransaction().begin();
      
    //  em.persist(frnd);   // for saving data into database
      
     frnd= em.find(Friends.class,2);   // for fetching data from database
      
      em.getTransaction().commit();
      
      System.out.println(frnd);  // displaying data from database
    }
}
