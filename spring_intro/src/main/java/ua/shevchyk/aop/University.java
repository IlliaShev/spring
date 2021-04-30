package ua.shevchyk.aop;

import org.springframework.stereotype.Component;
import org.springframework.util.SocketUtils;

import java.util.*;

@Component
public class University {
    private List<Student> students = new ArrayList<>();

    public void addStudent(){
        Student st1 = new Student("Illia Shevchyk", 4, 96.3);
        Student st2 = new Student("Ivan Ivanov", 3, 95.3);
        Student st3 = new Student("Ivan Sydorov", 2, 94.3);
        students.add(st1);
        students.add(st2);
        students.add(st3);
    }

    public List<Student> getStudents(){
        System.out.println("Start working method getStudents");
        students.get(4);
        System.out.println("Information from method getStudents:");
        System.out.println(students);
        return students;
    }
}
