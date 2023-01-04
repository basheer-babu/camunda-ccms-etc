package com.dpoint.tutorial.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import com.dpoint.tutorial.dao.CcmsDao;
import com.dpoint.tutorial.dto.CcmsStore;

@Service
public class CcmsService {
	
	@Autowired
	CcmsDao ccmsDao;
	

	public List<CcmsStore> getTasks(String level){
		if(level.equalsIgnoreCase("demo")) {
			return ccmsDao.findAll();
		}else {
			return ccmsDao.findByLevel(level);
		}
		
	}
}
