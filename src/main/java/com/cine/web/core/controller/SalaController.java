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

import com.cine.web.core.dto.request.SalaRequest;
import com.cine.web.core.dto.response.SalaResponse;
import com.cine.web.core.service.SalaService;

@RestController
@RequestMapping("/api/v1/salas")
public class SalaController {

	@Autowired
	SalaService salaService;
	
	@GetMapping
	public List<SalaResponse> getAllSala(){
		return salaService.allSala();
	}
	
	@PostMapping("/add")
	public void addSala(@RequestBody SalaRequest salaRequest){
		salaService.addSala(salaRequest);
	}
	
	@PutMapping("/update")
	public void updateSala(@RequestBody SalaRequest salaRequest){
		salaService.addSala(salaRequest);
	}
	
	@DeleteMapping("/{idsala}")
	public void deleteSala(@PathVariable("idsala")Integer idsala){
		salaService.deleteSala(idsala);
	}
	
	@GetMapping("/{idsala}")
	public 	SalaResponse getSala(@PathVariable("idsala")Integer idsala){
		return salaService.findSala(idsala);
	}
	
	
	
}
