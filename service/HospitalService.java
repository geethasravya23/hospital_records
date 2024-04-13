package com.geetha.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.geetha.demo.entity.*;
import com.geetha.demo.repo.HospitalRepo;
@Service
public class HospitalService {

	@Autowired
	HospitalRepo hsplrepo;
	

	public Hospitalentity addHspltodb(Hospitalentity hspl) {
		return hsplrepo.save(hspl);
		
	}

	public Hospitalentity getPatientById( int id) {
		return hsplrepo.getByPid(id);
	}

}

