package com.example.repostitory;

import org.springframework.data.repository.CrudRepository;

import com.example.domain.BaseSalary;

public interface BasesalaryRepository  extends CrudRepository<BaseSalary, Long>{
	
	BaseSalary findByGrade(int grade);

}
