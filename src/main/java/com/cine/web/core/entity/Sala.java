package com.cine.web.core.entity;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Sala {

	@Id
	private Integer idSala;
	private Integer numSala;
	private Integer numColumna;
	private Integer numFila;
	
	@ManyToOne
	@JoinColumn(name = "idCine")
	private Cine cine;

	public Integer getIdSala() {
		return idSala;
	}

	public void setIdSala(Integer idSala) {
		this.idSala = idSala;
	}

	public Integer getNumSala() {
		return numSala;
	}

	public void setNumSala(Integer numSala) {
		this.numSala = numSala;
	}

	public Integer getNumColumna() {
		return numColumna;
	}

	public void setNumColumna(Integer numColumna) {
		this.numColumna = numColumna;
	}

	public Integer getNumFila() {
		return numFila;
	}

	public void setNumFila(Integer numFila) {
		this.numFila = numFila;
	}

	public Cine getCine() {
		return cine;
	}

	public void setCine(Cine cine) {
		this.cine = cine;
	}
}
