package gr.codehub.cicd;

import gr.codehub.cicd.bootstrap.SampleLoad;
import gr.codehub.cicd.dto.FinancialSummaryDTO;
import gr.codehub.cicd.model.Employee;
import gr.codehub.cicd.service.DatabaseService;
import gr.codehub.cicd.service.DatabaseServiceImpl;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Program started");
        DatabaseService dbService = new DatabaseServiceImpl();
        new SampleLoad(dbService).loadSampleData();
        List<Employee> employees = dbService.findAllEmployees();
        FinancialSummaryDTO summary = getFinancialSummaryDTO(employees);
        System.out.println(summary);
        double averageAmountSpent = getAverageAmountSpent(summary.getTotalAmountSpent(), employees.size());
        System.out.println("Average amount spent per employee: $" + averageAmountSpent);
        System.out.println("Program finished");
    }

    public static double getAverageAmountSpent(double totalAmount, int size) {
            return totalAmount / size;
    }

    public static FinancialSummaryDTO getFinancialSummaryDTO(List<Employee> employees) {
        // Initialize totals
        double totalSalaryPayments = 0;
        double totalTaxPayments = 0;
        double totalAmountSpent = 0;
        // Calculate totals
        for (Employee employee : employees) {
            double salary = employee.getSalary();
            double tax = employee.getTaxAmount();
            totalSalaryPayments += salary;
            totalTaxPayments += tax;
            totalAmountSpent += (salary + tax);
        }
        FinancialSummaryDTO summary = new FinancialSummaryDTO(totalSalaryPayments, totalTaxPayments, totalAmountSpent);
        return summary;
    }
}