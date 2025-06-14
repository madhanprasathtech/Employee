package com.example.Myweb.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.example.Myweb.entity.InstituteEntity;
import com.example.Myweb.repository.InstituteRepository;
@Repository
public class InstituteDao {
	@Autowired
	InstituteRepository ir;
	public String postser(List<InstituteEntity> e) {
		// TODO Auto-generated method stub
		ir.saveAll(e);
		return "saved succesfully";
	}
	public List<InstituteEntity> getinst() {
		// TODO Auto-generated method stub
		return ir.findAll();
	}
	public List<InstituteEntity> getexce(String a) {
		// TODO Auto-generated method stub
		return ir.getexce(a);
	}

}
