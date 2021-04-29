package ua.shevchyk.spring_intro;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("personBean")
public class Person {
    @Autowired
    @Qualifier("catBean")
    private Pet pet;
    @Value("${person.surname}")
    private String surname;
    @Value("${person.age}")
    private int age;

//    @Autowired
//    public Person(Pet pet) {
//        //System.out.println("Person bean is created " + fff);
//        this.pet = pet;
//    }

    public Person() {
    }

//    @Autowired
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
