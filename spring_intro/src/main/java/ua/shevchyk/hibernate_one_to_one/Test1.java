package ua.shevchyk.hibernate_one_to_one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ua.shevchyk.hibernate_one_to_one.Entity.Detail;
import ua.shevchyk.hibernate_one_to_one.Entity.Employee;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory =
                new Configuration().configure("hibernate.cfg.xml")
                        .addAnnotatedClass(Employee.class)
                        .addAnnotatedClass(Detail.class)
                        .buildSessionFactory();
        Session session = null;
        try {
//            Session session = factory.getCurrentSession();
//            Employee employee = new Employee("Ivan", "Ivanov", "IT", 5000);
//            Detail detail = new Detail("Dnipro", "0994921113", "ivan@gmail.com");
//            employee.setEmpDetail(detail);
//            session.beginTransaction();
//
//            session.save(employee);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");


//            Session session = factory.getCurrentSession();
//            Employee employee = new Employee("Illia", "Shevchyk", "Designer", 7000);
//            Detail detail = new Detail("Kiev", "0994921112", "illia@gmail.com");
//            employee.setEmpDetail(detail);
//            session.beginTransaction();
//
//            session.save(employee);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Employee employee = session.get(Employee.class, 1);
//            System.out.println(employee.getEmpDetail());
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

            session = factory.getCurrentSession();
            session.beginTransaction();

            Employee employee = session.get(Employee.class, 2);
            session.delete(employee);

            session.getTransaction().commit();
            System.out.println("Done!");

        } finally {
            session.close();
            factory.close();
        }

    }
}
