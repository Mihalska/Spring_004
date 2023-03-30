package com.example.demo3.entity;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;
@Data
@Entity
public class Newcars {
    @Id
    private Integer id;

    @NotEmpty(message = "employee_id should not be empty")
    private int employee_id;

    @NotEmpty(message = "phone should not be empty")
    private String model;


}
