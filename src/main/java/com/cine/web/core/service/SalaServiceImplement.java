package com.cine.web.core.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cine.web.core.dto.request.SalaRequest;
import com.cine.web.core.dto.response.SalaResponse;
import com.cine.web.core.entity.Sala;
import com.cine.web.core.repository.CineRepository;
import com.cine.web.core.repository.SalaRepository;


@Service
public class SalaServiceImplement implements SalaService{

	@Autowired
	SalaRepository salaRepository;
	
	@Autowired
	CineRepository cineRepository;
	
	@Override
	public List<SalaResponse> allSala() {
		// TODO Auto-generated method stub
		List<SalaResponse> lstSalaResponse = new ArrayList<SalaResponse>();
		for(Sala sala : salaRepository.findAll()) {
			SalaResponse salaResp = new SalaResponse();
			salaResp.setIdSala(sala.getIdSala());
			salaResp.setNumSala(sala.getNumSala());
			salaResp.setNumFila(sala.getNumFila());
			salaResp.setNumColumna(sala.getNumColumna());
			salaResp.setCine(sala.getCine().getNombre());
			lstSalaResponse.add(salaResp);
		}
		return lstSalaResponse;
	}

	@Override
	public Sala addSala(SalaRequest salaRequest) {
		// TODO Auto-generated method stub
		Sala sala = new Sala();
		if(salaRequest.getIdSala() == null) {
			sala.setIdSala(generarCodigoSala());
		}else {
			sala.setIdSala(salaRequest.getIdSala());
		}
		sala.setNumSala(salaRequest.getNumSala());
		sala.setNumFila(salaRequest.getNumFila());
		sala.setNumColumna(salaRequest.getNumColumna());
		sala.setCine(cineRepository.findById(salaRequest.getCine()).get());
		return salaRepository.save(sala);
	}

	@Override
	public void deleteSala(Integer idsala) {
		// TODO Auto-generated method stub
		salaRepository.deleteById(idsala);
	}

	@Override
	public SalaResponse findSala(Integer idsala) {
		// TODO Auto-generated method stub
		SalaResponse salaResp = new SalaResponse();
		Sala sala = salaRepository.findById(idsala).get();
		salaResp.setIdSala(sala.getIdSala());
		salaResp.setNumSala(sala.getNumSala());
		salaResp.setNumFila(sala.getNumFila());
		salaResp.setNumColumna(sala.getNumColumna());
		salaResp.setCine(sala.getCine().getNombre());
		return salaResp;
	}
	
	public Integer generarCodigoSala() {
		  Integer idsala;
		  idsala = salaRepository.getLastIdSala();
	      if(idsala == null)idsala = 10000;
	      return idsala+1;
	}

	@Override
	public List<SalaResponse> allSalasByCine(Integer idCine) {
		// TODO Auto-generated method stub
		List<SalaResponse> lstSalaResponse = new ArrayList<SalaResponse>();
		for(Sala sala : salaRepository.findAllByCineIdCine(idCine)) {
			SalaResponse salaResp = new SalaResponse();
			salaResp.setIdSala(sala.getIdSala());
			salaResp.setNumSala(sala.getNumSala());
			salaResp.setNumFila(sala.getNumFila());
			salaResp.setNumColumna(sala.getNumColumna());
			salaResp.setCine(sala.getCine().getNombre());
			lstSalaResponse.add(salaResp);
		}
		return lstSalaResponse;
	}

	

}
