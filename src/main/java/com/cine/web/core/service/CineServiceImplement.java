package com.cine.web.core.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cine.web.core.dto.request.CineRequest;
import com.cine.web.core.dto.response.CineResponse;
import com.cine.web.core.entity.Cine;
import com.cine.web.core.entity.TipoCine;
import com.cine.web.core.repository.CineRepository;


@Service
public class CineServiceImplement implements CineService{

	@Autowired
	CineRepository cineRepository;
	
	@Override
	public List<CineResponse> allCines() {
		// TODO Auto-generated method stub
		System.out.println("INGRESANDO METODO LISTAR");
		List<CineResponse> lstCineResponse = new ArrayList<>();
		
		for(Cine cine : cineRepository.findAll()) {
			CineResponse cineResponse = new CineResponse();
			cineResponse.setIdCine(cine.getIdCine());
			cineResponse.setNombreCine(cine.getNombre());
			cineResponse.setDepartamento(cine.getDepartamento());
			cineResponse.setProvincia(cine.getProvincia());
			cineResponse.setDistrito(cine.getDistrito());
			cineResponse.setFechInicio(cine.getFechIni());
			cineResponse.setTipoCine(cine.getTipoCine().getNomTipoCine());
			lstCineResponse.add(cineResponse);			
		}
		return lstCineResponse;
	}

	@Override
	public Cine addCine(CineRequest cineRequest) {
		// TODO Auto-generated method stub
		Cine cine = new Cine();
		if(cine.getIdCine() == null) {
			cine.setIdCine(generarCodigoCine());
		}else {
			cine.setIdCine(cineRequest.getIdCine());
		}
		cine.setNombre(cineRequest.getNombreCine());
		cine.setDepartamento(cineRequest.getDepartamento());
		cine.setProvincia(cineRequest.getProvincia());
		cine.setDistrito(cineRequest.getDistrito());
		cine.setFechIni(new Date());
		TipoCine tipo = new TipoCine();
		tipo.setTipoCine(cineRequest.getTipoCine());
		cine.setTipoCine(tipo);
		return cineRepository.save(cine);
	}

	@Override
	public void deleteCine(Integer idcine) {
		// TODO Auto-generated method stub
		cineRepository.deleteById(idcine);
	}

	@Override
	public CineResponse findCine(Integer idcine) {
		// TODO Auto-generated method stub
		Cine cine = cineRepository.findById(idcine).get();
		CineResponse cineResponse = new CineResponse();
		cineResponse.setIdCine(cine.getIdCine());
		cineResponse.setNombreCine(cine.getNombre());
		cineResponse.setDepartamento(cine.getDepartamento());
		cineResponse.setProvincia(cine.getProvincia());
		cineResponse.setDistrito(cine.getDistrito());
		cineResponse.setFechInicio(cine.getFechIni());
		cineResponse.setTipoCine(cine.getTipoCine().getNomTipoCine());
		return cineResponse;
	}
	
	public Integer generarCodigoCine() {
		  Integer idcine;
		  idcine = cineRepository.getLastIdCine();
	      if(idcine == null)idcine=10000;
	      return idcine+1;
	}

}
