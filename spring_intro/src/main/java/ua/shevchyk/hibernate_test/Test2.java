package ua.shevchyk.hibernate_test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ua.shevchyk.hibernate_test.entity.Employee;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory factory =
                new Configuration().configure("hibernate.cfg.xml").addAnnotatedClass(Employee.class).buildSessionFactory();
        try{
            Session session = factory.getCurrentSession();

        } finally {
            factory.close();
        }
    }
}
