package com.example.Myweb.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.Myweb.dao.InstituteDao;
import com.example.Myweb.entity.InstituteEntity;
import com.example.Myweb.exception.LocationException;
@Service
public class InstituteService {
	@Autowired
	InstituteDao id;
	public String postser(List<InstituteEntity> e) {
		return id.postser(e);
	}
	public List<InstituteEntity> getinst() {
		// TODO Auto-generated method stub
		return id.getinst();
	}
	public List<InstituteEntity> getexce(String a) throws LocationException {
		 if(id.getexce(a).isEmpty()) {
			 throw new LocationException("this location not unavailable");
		 }else {
			 return id.getexce(a);
		 }
		
		
	}

}
