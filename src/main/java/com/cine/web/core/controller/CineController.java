package com.cine.web.core.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cine.web.core.dto.request.CineRequest;
import com.cine.web.core.dto.response.CineResponse;
import com.cine.web.core.service.CineService;

@RestController
@RequestMapping("/api/v1/cines")
public class CineController {
	
	@Autowired
	CineService cineService;
	
	@GetMapping
	public List<CineResponse> getAllCines(){
		return cineService.allCines();
	}

	
	@PostMapping("/add")
	public void addCine(@RequestBody CineRequest cineRequest){
		cineService.addCine(cineRequest);
	}
	
	@PutMapping("/update")
	public void updateCine(@RequestBody CineRequest cineRequest){
		cineService.addCine(cineRequest);
	}
	
	@DeleteMapping("/{idcine}")
	public void deleteCine(@PathVariable("idcine")Integer idcine){
		cineService.deleteCine(idcine);
	}
	
	@GetMapping("/{idcine}")
	public CineResponse getFindCine(@PathVariable("idcine")Integer idcine){
		return cineService.findCine(idcine);
	}
	
}
