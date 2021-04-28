package ua.shevchyk.spring_intro.spring_intro;

public class Dog implements Pet{
    @Override
    public void say() {
        System.out.println("Bow-wow");
    }
}
