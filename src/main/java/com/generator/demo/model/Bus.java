package com.generator.demo.model;

import javax.persistence.*;

@Entity
@Table(name="Bus")
public class Bus {

    @TableGenerator(name="bus_gen",table ="id_gen",pkColumnName = "gen_name", valueColumnName = "gen_val",allocationSize = 50)
    @Id
    @GeneratedValue(strategy = GenerationType.TABLE,generator = "bus_gen")
    @Column(name="id")
    Long busNo;
    @Column(
            name = "name"
    )
    String busName;

    public Long getBusNo() {
        return busNo;
    }

    public void setBusNo(Long busNo) {
        this.busNo = busNo;
    }

    public String getBusName() {
        return busName;
    }

    public void setBusName(String busName) {
        this.busName = busName;
    }
}
