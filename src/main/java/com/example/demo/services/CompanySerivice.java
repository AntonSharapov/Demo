package com.example.demo.services;

import com.example.demo.db.entity.Company;
import com.example.demo.db.repository.CrudRepository;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Optional;

@Data
@AllArgsConstructor
public class CompanySerivice {

    private final CrudRepository<Integer, Company> companyCrudRepository;
    private final UserService userService;

    public Optional<CompanyReadDto> findById(Integer id) {
        return companyCrudRepository.findById(id)
                .map(entity -> new CompanyReadDto(entity.getId()));
    }

}
