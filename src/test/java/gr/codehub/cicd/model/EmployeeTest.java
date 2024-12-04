package gr.codehub.cicd.model;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmployeeTest {
    private Employee sampleEmployee;

    @BeforeEach
    void setupBeforeEach() {
        sampleEmployee = new Employee(1, "Alice", 60000);
    }

    @Test
    void shouldReturnCorrectId() {
        assertEquals(1, sampleEmployee.getId(), "Employee ID should match");
    }

    @Test
    void shouldReturnCorrectName() {
        assertEquals("Alice", sampleEmployee.getName(), "Employee name should match");
    }

    @Test
    void shouldReturnCorrectSalary() {
        assertEquals(60000, sampleEmployee.getSalary(), "Employee salary should match");
    }
}