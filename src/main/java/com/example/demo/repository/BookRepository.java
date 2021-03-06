package com.example.demo.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

import com.example.demo.entity.*;

@Repository
public interface BookRepository extends CrudRepository<Book, Integer>{
    List<Book> findAll();
}
