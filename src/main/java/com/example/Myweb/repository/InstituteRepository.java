package com.example.Myweb.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.example.Myweb.entity.InstituteEntity;


public interface InstituteRepository extends JpaRepository<InstituteEntity, Integer>{

	@Query("select e from InstituteEntity e where e.location=?1")
	List<InstituteEntity> getexce(String a);


}
