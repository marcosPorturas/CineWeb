package com.cine.web.core.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class TipoCine {

	@Id
	private Integer tipoCine;
	private String nomTipoCine;
	
	public Integer getTipoCine() {
		return tipoCine;
	}
	public void setTipoCine(Integer tipoCine) {
		this.tipoCine = tipoCine;
	}
	public String getNomTipoCine() {
		return nomTipoCine;
	}
	public void setNomTipoCine(String nomTipoCine) {
		this.nomTipoCine = nomTipoCine;
	}
	
}
