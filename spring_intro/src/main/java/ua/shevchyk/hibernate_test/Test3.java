package ua.shevchyk.hibernate_test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ua.shevchyk.hibernate_test.entity.Employee;

import java.util.*;

public class Test3 {
    public static void main(String[] args) {
        SessionFactory factory =
                new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();
        try{
            Session session = factory.getCurrentSession();
            session.beginTransaction();
//            List<Employee> emps = session.createQuery("from Employee").getResultList();
            List<Employee> emps = session.createQuery("from Employee " +
                    "where name='Orange' AND salary>4").getResultList();
            for(Employee employee: emps){
                System.out.println(employee);
            }
            session.getTransaction().commit();
            System.out.println("Done!");
        } finally {
            factory.close();
        }
    }
}
