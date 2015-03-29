package com.example.repostitory;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import com.example.domain.BaseSalary;
import com.example.domain.ExtraSalary;

public interface SalaryRepository  extends CrudRepository<ExtraSalary, Long>{
	
	List<ExtraSalary>  findByNameContaining(String name);
	
	List<ExtraSalary> findByUseridAndMonth(Long id,String month);
//	List<ExtraSalary> findByIdAndMonth(Long id,String month);
	

}
