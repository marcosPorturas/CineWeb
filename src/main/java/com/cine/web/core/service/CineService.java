package com.cine.web.core.service;

import java.util.List;
import com.cine.web.core.dto.request.CineRequest;
import com.cine.web.core.dto.response.CineResponse;
import com.cine.web.core.entity.Cine;

public interface CineService {

	List<CineResponse> allCines();
	Cine addCine(CineRequest cineRequest);
	void deleteCine(Integer idcine);
	CineResponse findCine(Integer idcine);
	
	
}
