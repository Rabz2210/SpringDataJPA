package com.generator.demo.repo;

import com.generator.demo.model.employee;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface EmployeeRepo extends PagingAndSortingRepository<employee, Long> {

    List<employee> findByAgeBetween(int age1, int age2);

    List<employee> findBySalaryGreaterThan(int salary);

    List<employee> findByAgeGreaterThanAndSalaryIsGreaterThan(int age, int salary);

    List<employee> findByDeptLike(String dept);
}
