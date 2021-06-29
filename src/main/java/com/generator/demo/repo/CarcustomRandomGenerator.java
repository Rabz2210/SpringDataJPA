package com.generator.demo.repo;

import org.hibernate.HibernateException;
import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

import java.io.Serializable;
import java.util.Random;

public class CarcustomRandomGenerator implements IdentifierGenerator {

    @Override
    public Serializable generate(SharedSessionContractImplementor sharedSessionContractImplementor, Object o) throws HibernateException {
        Random random  = null;
        int id = 0;
        random  = new Random();
        id = random.nextInt(100000);
        return new String("CAR"+id);
    }
}
