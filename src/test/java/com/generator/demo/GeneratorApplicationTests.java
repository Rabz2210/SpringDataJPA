package com.generator.demo;

import com.generator.demo.model.Bus;
import com.generator.demo.model.Car;
import com.generator.demo.model.employee;
import com.generator.demo.repo.BusRepo;
import com.generator.demo.repo.CarRepo;
import com.generator.demo.repo.EmployeeRepo;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class GeneratorApplicationTests {

    @Autowired
    EmployeeRepo empRepo;

    @Autowired
    BusRepo busRepo;

    @Autowired
    CarRepo carRepo;


    @Test
    void contextLoads() {
        employee ob = new employee();
        ob.setName("Rabbani");
        empRepo.save(ob);
        employee ob1 = new employee();
        ob1.setName("Arman");
        empRepo.save(ob1);
    }

    @Test
    void testSaveBus(){
        Bus ob = new Bus();
        ob.setBusName("blr-hdr");
        Bus ob1 = new Bus();
        ob1.setBusName("blr-chennai");
        busRepo.save(ob);
        busRepo.save(ob1);
    }

    @Test
    void testSaveCar(){
        Car ob = new Car();
        ob.setName("Hyundai");
        Car ob1 = new Car();
        ob1.setName("Eicher");
        carRepo.save(ob);
        carRepo.save(ob1);
    }

}
