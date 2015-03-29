package com.example.repostitory;

import org.springframework.data.repository.CrudRepository;

import com.example.domain.EmployeeRegister;

public interface Em_RegisterRespository extends CrudRepository<EmployeeRegister, Long>{

	EmployeeRegister findByUserid(Long userid);
}
