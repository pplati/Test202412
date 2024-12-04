package gr.codehub.cicd.bootstrap;

import gr.codehub.cicd.model.Employee;
import gr.codehub.cicd.service.DatabaseService;

public class SampleLoad {
    private final DatabaseService databaseService;

    public SampleLoad(DatabaseService databaseService) {
        this.databaseService = databaseService;
    }

    public void loadSampleData() {
        clearDatabase();
        databaseService.saveEmployee(new Employee(1, "Alice", 55000));
        databaseService.saveEmployee(new Employee(2, "Bob", 45000));
        databaseService.saveEmployee(new Employee(3, "Charlie", 25000));
        databaseService.saveEmployee(new Employee(4, "David", 60000));
        databaseService.saveEmployee(new Employee(5, "Eve", 32000));
        databaseService.saveEmployee(new Employee(6, "Frank", 29000));
        databaseService.saveEmployee(new Employee(7, "Grace", 37000));
        databaseService.saveEmployee(new Employee(8, "Hannah", 49000));
        databaseService.saveEmployee(new Employee(9, "Ivan", 41000));
        databaseService.saveEmployee(new Employee(10, "Jack", 28000));
    }

    private void clearDatabase() {
        databaseService.clearDatabase();
    }
}