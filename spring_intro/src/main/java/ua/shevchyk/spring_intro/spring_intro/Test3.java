package ua.shevchyk.spring_intro.spring_intro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test3 {
    public static void main(String[] args) {
//        Pet pet = new Dog();
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
//        Pet pet = context.getBean("cat", Pet.class);
//        Person person = new Person(pet);
        Person person = context.getBean("person", Person.class);
        person.callPet();

        context.close();
    }
}
