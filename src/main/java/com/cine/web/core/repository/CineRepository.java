package com.cine.web.core.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


import com.cine.web.core.entity.Cine;



public interface CineRepository extends JpaRepository<Cine, Integer>{
	
	@Query("Select MAX(e.idCine) from Cine e")
	Integer getLastIdCine();
	
}
