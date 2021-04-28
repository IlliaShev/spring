package ua.shevchyk.spring_intro.spring_intro;

public class Person {
    private Pet pet;
    private String surname;
    private int age;

    public Person(Pet pet, int fff) {
        System.out.println("Person bean is created " + fff);
        this.pet = pet;
    }

    public Person() {
    }

    public void setPet(Pet pet) {
        System.out.println("Setting pet");
        this.pet = pet;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void callPet(){
        System.out.println(surname + " " + age);
        System.out.println("Where is my pet?");
        pet.say();
    }
}
