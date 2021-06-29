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
}
