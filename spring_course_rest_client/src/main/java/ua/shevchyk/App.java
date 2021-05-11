package ua.shevchyk;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ua.shevchyk.configuration.MyConfig;
import ua.shevchyk.entity.Employee;

import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(MyConfig.class);
        Communication communication = context.getBean("communication",Communication.class);
        List<Employee> allEmployees = communication.getAllEmployees();
        System.out.println(allEmployees);
    }
}
