package gr.codehub.cicd.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class FinancialSummaryDTO {
    private double totalSalaryPayments;
    private double totalTaxPayments;
    private double totalAmountSpent;
}