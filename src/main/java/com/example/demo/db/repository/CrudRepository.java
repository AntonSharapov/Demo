package com.example.demo.db.repository;

import com.example.demo.db.entity.User;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.Query;

import java.util.Optional;

public interface CrudRepository<K, E> {

    Optional<E> findById(K id);

    void delete(E entity);
}
