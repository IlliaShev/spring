package ua.shevchyk.hibernate_one_to_one;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ua.shevchyk.hibernate_one_to_one.Entity.Detail;
import ua.shevchyk.hibernate_one_to_one.Entity.Employee;

public class Test2 {
    public static void main(String[] args) {
        SessionFactory factory =
                new Configuration().configure("hibernate.cfg.xml")
                        .addAnnotatedClass(Employee.class)
                        .addAnnotatedClass(Detail.class)
                        .buildSessionFactory();
        Session session = null;
        try {
//            session = factory.getCurrentSession();
//            Employee employee = new Employee("Misha", "Perekopay", "Sales", 3200);
//            Detail detail = new Detail("Lviv", "0502561113", "jager@gmail.com");
//            detail.setEmp(employee);
//            employee.setEmpDetail(detail);
//            session.beginTransaction();
//
//            session.save(detail);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Detail detail = session.get(Detail.class, 1);
//            System.out.println(detail.getEmp());
//
//            session.getTransaction().commit();
//            System.out.println("Done!");


            session = factory.getCurrentSession();
            session.beginTransaction();

            Detail detail = session.get(Detail.class, 3);
            session.delete(detail);

            session.getTransaction().commit();
            System.out.println("Done!");
        } finally {
            assert session != null;
            session.close();
            factory.close();
        }

    }
}
