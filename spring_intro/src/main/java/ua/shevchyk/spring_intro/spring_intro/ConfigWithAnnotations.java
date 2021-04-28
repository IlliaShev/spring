package ua.shevchyk.spring_intro.spring_intro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ConfigWithAnnotations {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext3.xml");
        Cat cat = context.getBean("catBean", Cat.class);
        cat.say();
        Person person = context.getBean("personBean", Person.class);
        person.callPet();
        context.close();
    }
}
