package project.expenseincomeproject.dto;

import lombok.Data;

import java.time.LocalDate;

@Data
public class IncomeResponseDto {
    private String name;
    private Double amount;
    private LocalDate date;
    private String incomeCategoryName;
    private String username;


}
