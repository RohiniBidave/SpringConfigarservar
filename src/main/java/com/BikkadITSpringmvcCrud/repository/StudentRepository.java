package com.BikkadITSpringmvcCrud.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.BikkadITSpringmvcCrud.model.Student;

@Repository
public interface StudentRepository extends CrudRepository<Student, Integer>{

}
