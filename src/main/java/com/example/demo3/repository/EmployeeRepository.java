package com.example.demo3.repository;

import com.example.demo3.entity.Employee;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Integer> {
    List<Employee> getEmployeeByPositionContains(String position);


    List<Employee> findAllByName(String Name);


    @Modifying(clearAutomatically = true,flushAutomatically = true)
    @Query(value = "update employee e set  e.name = ? where e.position = ?", nativeQuery = true)
    Integer updateEmployeeByName(String Name, String Position) ;

}
