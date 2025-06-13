package com.example.Myweb.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Myweb.entity.EmployeeEntity;

public interface EmployeeRepository extends JpaRepository<EmployeeEntity,Integer>{

}
