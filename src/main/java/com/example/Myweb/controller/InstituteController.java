package com.example.Myweb.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Myweb.entity.InstituteEntity;
import com.example.Myweb.exception.LocationException;
import com.example.Myweb.service.InstituteService;

@RestController
@RequestMapping(value="/api/ins")
public class InstituteController {
	@Autowired
	InstituteService is;
	
	@PostMapping(value="/institutecon")
	public String postall(@RequestBody List<InstituteEntity> e) {
		return is.postser(e);
	}
	
	@GetMapping(value="/getinstitute")
	public List<InstituteEntity> getins(){
		return is.getinst();
	}
	
	@GetMapping(value="/except/{a}")
	public List<InstituteEntity> getes(@PathVariable String a) throws LocationException{
		
		return is.getexce(a);
	}
}
