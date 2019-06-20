package com.cine.web.core.service;

import java.util.List;

import com.cine.web.core.dto.request.SalaRequest;
import com.cine.web.core.dto.response.SalaResponse;
import com.cine.web.core.entity.Sala;

public interface SalaService {

	List<SalaResponse> allSala();
	List<SalaResponse> allSalasByCine(Integer idCine);
	Sala addSala(SalaRequest salaRequest);
	void deleteSala(Integer idsala);
	SalaResponse findSala(Integer idsala);
	
		
}
