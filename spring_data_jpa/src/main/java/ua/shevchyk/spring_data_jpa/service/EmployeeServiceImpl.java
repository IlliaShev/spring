package ua.shevchyk.spring_data_jpa.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import ua.shevchyk.spring_data_jpa.dao.EmployeeRepository;
import ua.shevchyk.spring_data_jpa.entity.Employee;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeServiceImpl implements EmployeeService{

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public List<Employee> getAllEmployees() {
        return employeeRepository.findAll();
    }

    @Override
    public void saveEmployee(Employee employee) {
        employeeRepository.save(employee);
    }

    @Override
    public void deleteEmployee(int id) {
        employeeRepository.deleteById(id);
    }

    @Override
    public Employee getEmployee(int id) {
        Employee employee = null;
        Optional<Employee> emp = employeeRepository.findById(id);
        if(emp.isPresent()) {
            employee = emp.get();
        }
        return employee;
    }

    @Override
    public List<Employee> findAllByName(String name) {
        return employeeRepository.findAllByName(name);
    }
}
