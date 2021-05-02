package ua.shevchyk.hibernate_many_to_many;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import ua.shevchyk.hibernate_many_to_many.entity.Child;
import ua.shevchyk.hibernate_many_to_many.entity.Section;

public class Test1 {
    public static void main(String[] args) {
        SessionFactory factory = new Configuration().configure("hibernate.cfg.xml")
                .addAnnotatedClass(Child.class)
                .addAnnotatedClass(Section.class)
                .buildSessionFactory();

        Session session = null;
        try{
//            session = factory.getCurrentSession();
//
//            Section section1 = new Section("football");
//            Child child = new Child("Illia", 5);
//            Child child1 = new Child("Masha", 6);
//            Child child2 = new Child("Vasya", 7);
//            section1.addChild(child);
//            section1.addChild(child1);
//            section1.addChild(child2);
//
//            session.beginTransaction();
//
//            session.save(section1);
//
//            session.getTransaction().commit();
            //*****************************
//
//            session = factory.getCurrentSession();
//
//            Section section1 = new Section("football");
//            Section section2 = new Section("basketball");
//            Section section3 = new Section("volleyball");
//            Child child = new Child("Misha", 5);
//            child.addSection(section1);
//            child.addSection(section2);
//            child.addSection(section3);
//            session.beginTransaction();
//
//            session.save(child);
//
//            session.getTransaction().commit();
//            //*****************************
//
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Section section = session.get(Section.class, 1);
//
//            System.out.println(section.getChildren());
//            //*****************************
//
//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Child child = session.get(Child.class, 4);
//
//            System.out.println(child.getSections());
            //*****************************

//            session = factory.getCurrentSession();
//            session.beginTransaction();
//
//            Child child = session.get(Child.class, 1);
//            System.out.println(child);
//            session.delete(child);
//            System.out.println("Done!");

//            session = factory.getCurrentSession();
//
//            Section section1 = new Section("Dance");
//            Child child = new Child("Lera", 5);
//            Child child1 = new Child("Olga", 6);
//            Child child2 = new Child("Nastya", 7);
//            section1.addChild(child);
//            section1.addChild(child1);
//            section1.addChild(child2);
//            session.beginTransaction();
//
//            session.persist(section1);
//            session.getTransaction().commit();
            session = factory.getCurrentSession();
            session.beginTransaction();

            Section section = session.get(Section.class, 6);
            session.delete(section);
            session.getTransaction().commit();

        } finally {
            session.close();
            factory.close();
        }
    }
}
