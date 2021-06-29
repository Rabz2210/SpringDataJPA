package com.generator.demo.repo;

import com.generator.demo.model.Car;
import org.springframework.data.repository.CrudRepository;

public interface CarRepo extends CrudRepository<Car, String> {

}
