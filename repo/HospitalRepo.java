package com.geetha.demo.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.geetha.demo.entity.Hospitalentity;

public interface HospitalRepo extends JpaRepository<Hospitalentity,Integer>{
	Hospitalentity getByPid(int id);


}
