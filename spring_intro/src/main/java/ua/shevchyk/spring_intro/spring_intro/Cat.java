package ua.shevchyk.spring_intro.spring_intro;

public class Cat implements Pet{

    public Cat() {
        System.out.println("Cat bean is created");
    }

    public void init(){
        System.out.println("Class cat init method");
    }

    public void destroy(){
        System.out.println("Class cat destroy method");
    }

    @Override
    public void say() {
        System.out.println("Mew-mew");
    }
}
