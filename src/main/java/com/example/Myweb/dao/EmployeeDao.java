package com.example.Myweb.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.Myweb.entity.EmployeeEntity;
import com.example.Myweb.repository.EmployeeRepository;

@Repository
public class EmployeeDao {

	@Autowired
	EmployeeRepository er;

	public String postEmp(@RequestBody EmployeeEntity e) {
		er.save(e);
		return "Saved Successfully";
	}

	public String postEmp(@RequestBody List<EmployeeEntity> e) {
		er.saveAll(e);
		return "Saved Successfully";
	}

	public List<EmployeeEntity> getEmpDao() {
		return er.findAll();
	}

	public EmployeeEntity getdaov(int a) {
		return er.findById(a).get();
	}

	public String getdaove(int b) {
		er.deleteById(b);
		return "Delete successfully";
	}

	public String getdaos(int a, EmployeeEntity e) {
		EmployeeEntity e1 = er.findById(a).get();
		e1.setName(e.getName());
		e1.setSalary(e.getSalary());
		er.save(e1);
		return "Saved Successfully";

	}

	public String getpatchse(@PathVariable int a, @RequestBody EmployeeEntity name) {
		EmployeeEntity r = er.findById(a).get();
		name.setName(r.getName());
		er.save(r);
		return "updated successfully";
	}

	public List<EmployeeEntity> getEmpSre() {
		
		return er.findAll();
	}

}
