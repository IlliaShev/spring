package ua.shevchyk.spring_intro;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test4 {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext context =
                new ClassPathXmlApplicationContext("applicationContext2.xml");
        Cat cat = context.getBean("cat", Cat.class);
        Cat cat1 = context.getBean("cat", Cat.class);

        System.out.println(cat == cat1);
        context.close();
    }
}
