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
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;

import java.awt.print.Pageable;
import java.util.List;

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
        ob.setAge(27);
        ob.setSalary(10000);
        ob.setDept("Chemistry");
        empRepo.save(ob);
        employee ob1 = new employee();
        ob1.setName("Arman");
        ob1.setAge(24);
        ob1.setSalary(15000);
        ob1.setDept("Biology");
        empRepo.save(ob1);
        employee ob2 = new employee();
        ob2.setName("Rohan");
        ob2.setAge(32);
        ob2.setSalary(20000);
        ob2.setDept("Mathematics");
        empRepo.save(ob2);
        employee ob3 = new employee();
        ob3.setName("Sohan");
        ob3.setAge(21);
        ob3.setSalary(5000);
        ob3.setDept("Admin");
        empRepo.save(ob3);
        employee ob4 = new employee();
        ob4.setName("Razia");
        ob4.setAge(29);
        ob4.setSalary(17000);
        ob4.setDept("Physics");
        empRepo.save(ob4);

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

    @Test
    public void testFindByAgebetween(){
        List<employee> res = empRepo.findByAgeBetween(20,25);
        for(employee each:res){
            System.out.println(each.getName());
        }
    }

    @Test
    public void testFindBySalaryGreaterThan(){
        List<employee>res = empRepo.findBySalaryGreaterThan(17000);
        for(employee each:res){
            System.out.println(each.getName()+": "+each.getDept());
        }
    }

    @Test
    public void testFindbyAgeAndSalary(){
        List<employee> res = empRepo.findByAgeGreaterThanAndSalaryIsGreaterThan(25,10000);
        for(employee each:res){
            System.out.println(each.getName()+" :"+each.getAge());
        }
    }


//    @Test
//    public void testFindByContains(){
//        List<employee> res = empRepo.findByDeptLike("Mathematics");
//        for(employee each:res){
//            System.out.println(each.getName()+" :"+each.getName());
//        }
//    }

    // Paging
    @Test
    public void testPaginatedResponse(){
        PageRequest pageRequest = PageRequest.of(0,2);
          Page<employee>result =  empRepo.findAll(pageRequest);
          for(employee each:result){
              System.out.println(each.getName()+" :"+each.getAge());
          }

    }

    @Test
    public void testSorting(){
        List<employee> result = (List<employee>) empRepo.findAll(Sort.by(Sort.Direction.DESC,"salary"));
        for(employee each:result){
            System.out.println(each.getSalary());
        }
    }

    @Test
    public void testFindAllPagingAndSorting(){
        PageRequest request = PageRequest.of(0,3,Sort.by(Sort.Direction.DESC,"salary"));
        Page<employee> res = empRepo.findAll(request);
        for(employee each:res){
            System.out.println(each.getName()+" :"+each.getSalary());
        }

    }
}
