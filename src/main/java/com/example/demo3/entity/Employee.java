package com.example.demo3.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.Size;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

@DynamicUpdate
@Data
@Entity
public class Employee {
    @Id
    private Integer id;

    @NotEmpty(message = "Name should not be empty")
    @Size(min = 2, max = 30, message = "Name should be between 2 and 30 characters")
    private String name;

    @NotEmpty(message = "position should not be empty")
    private String position;

    @NotEmpty(message = "phone should not be empty")
    private String phone;
}
