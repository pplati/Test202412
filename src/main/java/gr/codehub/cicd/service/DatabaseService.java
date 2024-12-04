package gr.codehub.cicd.service;

import gr.codehub.cicd.model.Employee;

import java.util.List;

public interface DatabaseService {
    void saveEmployee(Employee employee);

    Employee findEmployeeById(int id);

    List<Employee> findAllEmployees();

    List<Employee> findEmployeeByName(String name);

    void clearDatabase();
}
