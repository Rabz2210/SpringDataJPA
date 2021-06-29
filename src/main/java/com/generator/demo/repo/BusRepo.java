package com.generator.demo.repo;

import com.generator.demo.model.Bus;
import org.springframework.data.repository.CrudRepository;

public interface BusRepo extends CrudRepository<Bus, Long> {

}
