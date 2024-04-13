package com.geetha.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.geetha.demo.entity.Hospitalentity;
import com.geetha.demo.service.HospitalService;

@RestController
@RequestMapping("/real")
public class HospitalController {
	@Autowired
	HospitalService hsplservice;
	
@PostMapping("/hspl/add")
public Hospitalentity addNewHspl(@RequestBody Hospitalentity hspl) {
	
	
	return hsplservice.addHspltodb(hspl);
}
@GetMapping("/hspl/{id}")
public Hospitalentity getHsplentityByid(@PathVariable int id) {
	
	return hsplservice.getPatientById(id);
}
}


