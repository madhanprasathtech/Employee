package com.example.Myweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Myweb.entity.EmployeeEntity;
import com.example.Myweb.service.EmployeeService;

@RestController
@RequestMapping(value = "/emp/api")
public class EmployeeContrroller {
	@Autowired
	EmployeeService es;

	@PostMapping(value = "/postsingleEmp")
	public String postEmps(@RequestBody EmployeeEntity e) {
		return es.postEmp(e);
	}
	
	@PostMapping(value = "/postallEmp")
	public String postEmp(@RequestBody List<EmployeeEntity> e) {
		return es.postEmp(e);
	}
	
	@GetMapping(value="/getallemp")
	public List<EmployeeEntity> getemp(){
		return es.getEmpSer();
	}
	
	@GetMapping(value="/gettheid/{a}")
	public EmployeeEntity getids(@PathVariable Integer a ) {
		return es.getserv(a);
	}
	
	@DeleteMapping(value="/delemp/{b}")
	public String delid(@PathVariable Integer b) {
		return es.getservi(b);
	}
	
	@PutMapping(value="/update/{a}")
	public String update(@PathVariable int a,@RequestBody EmployeeEntity e) {
		return es.getservic(a,e);
	}
	
	@PatchMapping(value="/update/{b}")
	public String getpatch(@PathVariable int a,@RequestBody EmployeeEntity name) {
		return es.getpatchs(a,name);
	}
	
	@GetMapping("/getall")
	public List<EmployeeEntity> gets(){
		return es.getEmpSre();
	}
}
