/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.manager;

/**
 *
 * @author user1
 */

import com.entity.Employee;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
public class Driver {
    private static SessionFactory sessionFactory;
    private static Session session;
    
    
    static{
        
        try{
               
            Configuration config = new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class);
            StandardServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().applySettings(config.getProperties()).build();
            sessionFactory = config.buildSessionFactory(serviceRegistry);
        }catch(HibernateException e){
            System.out.println(e);
            
        }
    }
    
    public static void createRecord(){
        try{
        String firstname,lastname;
        int salary;
        Scanner sc = new Scanner(System.in);
        Employee emp = null;
        session = sessionFactory.openSession();
        session.beginTransaction();
        System.out.println("Enter firstname: ");
        firstname = sc.next();
        System.out.println("Enter lastname: ");
        lastname = sc.next();
        System.out.println("Enter Salary: ");
        salary = sc.nextInt();
        emp = new Employee(firstname,lastname,salary);
        session.save(emp);
        session.getTransaction().commit();
        System.out.println("Inserted Successfully..!");
        }catch(HibernateException f){
            if(session.beginTransaction()!=null)
                session.getTransaction().rollback();
            System.out.println(f);
        }finally{
            session.close();

            
        }
    }
    
    public static void retrieveData(){
        try{
            session = sessionFactory.openSession();
            session.beginTransaction();
            List emplist = session.createQuery("from Employee").list();
            for(Iterator itr = emplist.iterator(); itr.hasNext();){
                Employee e = (Employee) itr.next();
                System.out.println(e);
            }
            session.getTransaction().commit();
        }catch(HibernateException g){
            if(session!= null)
                session.getTransaction().rollback();
            System.out.println(g);
        }finally{
            session.close();
            //StandardServiceRegistryBuilder.destroy(sessionFactory.getSessionFactoryOptions().getServiceRegistry());
        }
    }
    
    public static void updateData(int update_id){
        try{
            int salary;
            Scanner sc = new Scanner(System.in);
            session = sessionFactory.openSession();
            session.beginTransaction();
            Employee emp = (Employee) session.get(Employee.class, update_id);
            System.out.println("Enter updated Salary: ");
            salary = sc.nextInt();
            emp.setSalary(salary);
            session.getTransaction().commit();
            System.out.println("Salary has been updated for ID: "+update_id);
        }catch(HibernateException e){
            if(session.getTransaction() != null)
                 session.getTransaction().rollback();
            System.out.println(e);
        }finally{
            session.close();
        }
        
    }
    
    public static void deleteData(int delete_id){
        try{
            session = sessionFactory.openSession();
            session.beginTransaction();
            
            Employee e = (Employee) session.load(Employee.class, delete_id);
            session.delete(e);
            session.getTransaction().commit();
            System.out.println("Employee with Id: "+delete_id+" has been deleted");
        }catch(HibernateException e){
            System.out.println(e);
            if(session.getTransaction() != null)
                session.getTransaction().rollback();
        }finally{
            session.close();
        }
    }

    public static void main(String ar[]){
        
        Driver.createRecord();
    
    }
}
