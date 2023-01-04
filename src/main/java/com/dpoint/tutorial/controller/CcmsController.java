package com.dpoint.tutorial.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.dpoint.tutorial.dto.CcmsStore;
import com.dpoint.tutorial.service.CcmsService;
@CrossOrigin
@RequestMapping("/ccms")
@RestController
public class CcmsController {
	
	@Autowired
	CcmsService ccmsService;
	
	@GetMapping("/getTasks")
	public List<CcmsStore> getTasks(@RequestParam String level){
		
		return ccmsService.getTasks(level);
	}

}
