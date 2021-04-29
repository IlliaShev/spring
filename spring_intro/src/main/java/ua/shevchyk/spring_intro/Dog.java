package ua.shevchyk.spring_intro;

import org.springframework.stereotype.Component;

@Component("dogBean")
public class Dog implements Pet{

    public Dog() {
        System.out.println("Creating Dog");
    }

    @Override
    public void say() {
        System.out.println("Bow-wow");
    }
}
