package com.example.repostitory;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.example.domain.Manager;

public interface RegisterRepository  extends CrudRepository<Manager,Long>{
	
//	@Query("select * from manager where username = ?")
	List<Manager> findByUsername(String username);

}
