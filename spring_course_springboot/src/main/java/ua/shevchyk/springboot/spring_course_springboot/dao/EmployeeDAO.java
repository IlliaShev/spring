package ua.shevchyk.springboot.spring_course_springboot.dao;



import ua.shevchyk.springboot.spring_course_springboot.entity.Employee;

import java.util.List;

public interface EmployeeDAO {
    List<Employee> getAllEmployees();

    void saveEmployee(Employee employee);

    Employee getEmployee(int id);

    void deleteEmployee(int id);
}
