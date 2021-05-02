package ua.shevchyk.hibernate_one_to_many_uni;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ua.shevchyk.hibernate_one_to_many_uni.entity.*;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory =
                new Configuration().configure("hibernate.cfg.xml")
                        .addAnnotatedClass(Employee.class)
                        .addAnnotatedClass(Department.class)
                        .buildSessionFactory();
        Session session = null;
        try {


//            session = factory.getCurrentSession();
//
//            Department department = new Department("HR", 500, 1500);
//            Employee employee = new Employee("Andrew", "Sidorov", 800);
//            Employee employee1 = new Employee("Oleg", "Ivanov", 1000);
//            department.addEmployeeToDepartment(employee);
//            department.addEmployeeToDepartment(employee1);
//            session.beginTransaction();
//            session.save(department);
//            session.getTransaction().commit();

//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//            Department department = session.get(Department.class, 3);
//            System.out.println(department);
//            System.out.println(department.getEmps());
//
//            session.getTransaction().commit();
//            System.out.println("Done!");
//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//            Employee employee = session.get(Employee.class, 1);
//            System.out.println(employee);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

            session = factory.getCurrentSession();

            session.beginTransaction();
            //Employee employee = session.get(Employee.class, 5);
            Department department = session.get(Department.class, 2);
            session.delete(department);

            session.getTransaction().commit();
            System.out.println("Done!");

        } finally {
            session.close();
            factory.close();
        }

    }
}
