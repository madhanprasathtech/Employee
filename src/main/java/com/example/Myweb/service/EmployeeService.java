package com.example.Myweb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;

import com.example.Myweb.dao.EmployeeDao;
import com.example.Myweb.entity.EmployeeEntity;
import com.example.Myweb.service.EmployeeService;

@Service
public class EmployeeService {

	@Autowired
	EmployeeDao ed;
	public String postEmp(@RequestBody EmployeeEntity e) {
		return ed.postEmp(e);
	}
	
	public String postEmp(@RequestBody List<EmployeeEntity> e) {
		return ed.postEmp(e);
	}
	
	public List<EmployeeEntity> getEmpSer() {
		return ed.getEmpDao();
	}
	
	public EmployeeEntity getserv(int a) {
		return ed.getdaov(a);
	}
	
	public String getservi(int b) {
		return ed.getdaove(b);
	}
	
	public String getservic(int a,EmployeeEntity e) {
		return ed.getdaos(a,e);
	}
	
	public String getpatchs(@PathVariable int a,@RequestBody EmployeeEntity name) {
		return ed.getpatchse(a,name);
	}
}
