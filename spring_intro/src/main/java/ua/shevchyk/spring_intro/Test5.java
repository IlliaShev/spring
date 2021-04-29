package ua.shevchyk.spring_intro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test5 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext2.xml");
        Cat cat = context.getBean("cat", Cat.class);
        cat.say();
        context.close();
    }
}
