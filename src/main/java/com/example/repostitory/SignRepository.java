package com.example.repostitory;

import java.util.List;

import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.example.domain.Signone;

public interface SignRepository extends JpaRepository<Signone, Long> {

	
	List<Signone> findByUseridAndMonth(Long userid,String month);
}
