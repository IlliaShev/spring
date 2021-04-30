package ua.shevchyk.aop.aspects;

import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;
import ua.shevchyk.aop.Student;

import java.util.List;

@Component
@Aspect
public class UniversityLoggingAspect {
//
//    @Before("execution(* getStudents())")
//    public void beforeGetStudentsLoggingAdvice(){
//        System.out.println("beforeGetStudentsLoggingAdvice: logging getting of students before method");
//    }
//
//    @AfterReturning(pointcut = "execution(* getStudents())", returning = "students")
//    public void afterGetStudentsLoggingAdvice(List<Student> students){
//        Student firstStudent = students.get(0);
//        String nameSurname = firstStudent.getNameSurname();
//        nameSurname = "Mr. " + nameSurname;
//        firstStudent.setNameSurname(nameSurname);
//        Double avgGrade = firstStudent.getAvgGrade();
//        avgGrade = avgGrade/2;
//        firstStudent.setAvgGrade(avgGrade);
//        System.out.println("afterGetStudentsLoggingAdvice: logging getting of students after method");
//    }

//    @AfterThrowing(pointcut = "execution(* getStudents())", throwing = "exception")
//    public void afterThrowingGetStudentsLoggingAdvice(Throwable exception){
//        System.out.println("afterThrowingGetStudentsLoggingAdvice: logging throwing of exception");
//        System.out.println(exception.getMessage());
//    }
    @After("execution(* getStudents())")
    public  void afterGetStudentsLoggingAdvice(){
        System.out.println("afterGetStudentsLoggingAdvice: logging finally");
    }
}
