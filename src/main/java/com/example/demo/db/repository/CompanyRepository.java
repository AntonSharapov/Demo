package com.example.demo.db.repository;

import com.example.demo.annotation.InjectBean;
import com.example.demo.annotation.Transaction;
import com.example.demo.db.entity.Company;
import com.example.demo.db.pool.ConnectionPool;
import jakarta.annotation.PostConstruct;

import java.util.Collections;
import java.util.Optional;
@Transaction
public class CompanyRepository implements CrudRepository<Integer, Company> {
    @InjectBean
    private ConnectionPool connectionPool;

    @PostConstruct
    void init(){
        System.out.println("init company repositary");
    }
    @Override
    public Optional<Company> findById(Integer id) {
        System.out.println("Find by Id method...");
        return Optional.of(new Company(id, null, Collections.emptyMap()));
    }

    @Override
    public void delete(Company entity) {
        System.out.println("Delete entity method");
    }
}
