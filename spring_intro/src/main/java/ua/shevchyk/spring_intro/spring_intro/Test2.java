package ua.shevchyk.spring_intro.spring_intro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test2 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        Pet cat = context.getBean("cat", Pet.class);
        cat.say();
        context.close();
    }
}
