package gr.codehub.cicd.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Employee {
    private int id;
    private String name;
    private double salary;

    public double getTaxAmount() {
        double taxRate;
        if (salary >= 50000) {
            taxRate = 0.45;
        } else if (salary >= 30000) {
            taxRate = 0.35;
        } else {
            taxRate = 0.25;
        }
        return salary * taxRate;
    }
}