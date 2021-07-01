package com.generator.demo.model;

import javax.persistence.*;

@Entity
@Table(name="employee")
public class employee {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    Long Id;
    String name;
    int age;
    int salary;
    @Column(name="dept")
    String Dept;

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public String getDept() {
        return Dept;
    }

    public void setDept(String dept) {
        Dept = dept;
    }
}
