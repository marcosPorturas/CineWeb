package com.cine.web.core.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.cine.web.core.entity.Sala;

public interface SalaRepository extends JpaRepository<Sala,Integer>{

	
	@Query("Select MAX(s.idSala) from Sala s")
	Integer getLastIdSala();
	
	List<Sala> findAllByCineIdCine(Integer idcine);
}
