package com.example.demo3.repository;

import com.example.demo3.entity.Employee;
import com.example.demo3.entity.Newcars;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface NewcarsRepository extends CrudRepository<Newcars, Integer> {
    List<Newcars> getEmployeeByModelContains(String model);

}
