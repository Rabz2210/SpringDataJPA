package com.generator.demo.repo;

import com.generator.demo.model.employee;
import org.springframework.data.repository.CrudRepository;

public interface EmployeeRepo extends CrudRepository<employee, Long> {

}
