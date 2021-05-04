package ua.shevchyk;



import ua.shevchyk.validation.CheckEmail;

import javax.validation.constraints.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Employee {
    @Size(min = 2, max = 30, message = "name must be min 2 symbols")
    private String name;
    @NotBlank(message = "surname is required field")
    private String surname;
    @Min(value = 500, message = "salary must greater than 499")
    @Max(value = 1500, message = "salary must be less than 1001")
    private int salary;
    private String department;
    private String carBrand;
    private Map<String, String>departments;
    private Map<String, String>carBrands;
    private Map<String, String>langList;
    private List<String> languages;
    @Pattern(regexp = "[0-9]{3}-[0-9]{2}-[0-9]{2}", message = "please use pattern XXX-XX-XX")
    private String number;
    @CheckEmail(value = "abc.com", message = "email must ends with abc.com")
    private String email;


    public Employee() {
        languages = new ArrayList<>();
        departments = new HashMap<>();
        departments.put("IT","Information Technology");
        departments.put("HR", "Human Resources");
        departments.put("Sales", "Sales");
        carBrands = new HashMap<>();
        carBrands.put("Audi", "Audi");
        carBrands.put("BMW", "BMW");
        carBrands.put("Toyota", "Toyota");
        langList = new HashMap<>();
        langList.put("English", "EN");
        langList.put("French", "FE");
        langList.put("Deutsch", "DE");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public Map<String, String> getDepartments() {
        return departments;
    }

    public void setDepartments(Map<String, String> departments) {
        this.departments = departments;
    }

    public String getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(String carBrand) {
        this.carBrand = carBrand;
    }

    public Map<String, String> getCarBrands() {
        return carBrands;
    }

    public void setCarBrands(Map<String, String> carBrands) {
        this.carBrands = carBrands;
    }

    public List<String> getLanguages() {
        return languages;
    }

    public void setLanguages(List<String> languages) {
        this.languages = languages;
    }

    public Map<String, String> getLangList() {
        return langList;
    }

    public void setLangList(Map<String, String> langList) {
        this.langList = langList;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", salary=" + salary +
                ", department='" + department + '\'' +
                '}';
    }
}
