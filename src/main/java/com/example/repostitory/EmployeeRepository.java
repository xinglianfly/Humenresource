package com.example.repostitory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.domain.Employee;


public interface EmployeeRepository extends JpaRepository<Employee,Long>{
	
//	@Query("select * from employee where name like %?%'")
	List<Employee> findByNameContaining(String name);
//	@Query("select * from employee where id = ?1")
//	List<Employee> findById(Long id);
	
	

}
