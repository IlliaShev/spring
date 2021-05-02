package ua.shevchyk.hibernate_one_to_many_bi;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ua.shevchyk.hibernate_one_to_many_bi.entity.Department;
import ua.shevchyk.hibernate_one_to_many_bi.entity.Employee;

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
//            Department department = new Department("Sales", 800, 1500);
//            Employee employee = new Employee("Illia", "Shevchyk", 800);
//            Employee employee1 = new Employee("Ivan", "Ivanov", 1000);
//            Employee employee2 = new Employee("Vadym", "Sologyb", 1300);
//
//            department.addEmployeeToDepartment(employee);
//            department.addEmployeeToDepartment(employee1);
//            department.addEmployeeToDepartment(employee2);
//
//            session.beginTransaction();
//            session.save(department);
//
//            session.getTransaction().commit();

            session = factory.getCurrentSession();

            session.beginTransaction();
            Department department = session.get(Department.class, 4);
            System.out.println(department);
            System.out.println(department.getEmps());

            session.getTransaction().commit();
            System.out.println("Done!");
//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//            Employee employee = session.get(Employee.class, 1);
//            System.out.println(employee);
//            System.out.println(employee.getDepartment());
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

//            session = factory.getCurrentSession();
//
//            session.beginTransaction();
//            Employee employee = session.get(Employee.class, 3);
//            session.delete(employee);
//
//            session.getTransaction().commit();
//            System.out.println("Done!");

        } finally {
            session.close();
            factory.close();
        }

    }
}
