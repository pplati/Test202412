package gr.codehub.cicd.service;

import gr.codehub.cicd.model.Employee;

import java.util.ArrayList;
import java.util.List;

public class DatabaseServiceImpl implements DatabaseService {
    private List<Employee> employees = new ArrayList<>();

    public void saveEmployee(Employee employee) {
        employees.add(employee);
    }

    public Employee findEmployeeById(int id) {
        for (Employee employee : employees) {
            if (employee.getId() == id) {
                return employee;
            }
        }
        return null;
    }

    public List<Employee> findAllEmployees() {
        return new ArrayList<>(employees);
    }

    public List<Employee> findEmployeeByName(String name) {
        List<Employee> result = new ArrayList<>();
        for (Employee employee : employees) {
            if (employee.getName().equalsIgnoreCase(name)) {
                result.add(employee);
            }
        }
        return result;
    }

    public void clearDatabase() {
        employees.clear();
    }
}