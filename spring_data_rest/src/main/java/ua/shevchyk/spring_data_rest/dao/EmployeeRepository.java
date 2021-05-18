package ua.shevchyk.spring_data_rest.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import ua.shevchyk.spring_data_rest.entity.Employee;

import java.util.List;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

    public List<Employee> findAllByName(String name);
}
