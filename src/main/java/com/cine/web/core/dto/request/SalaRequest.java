package com.cine.web.core.dto.request;


public class SalaRequest {

	private Integer idSala;
	private Integer numSala;
	private Integer numColumna;
	private Integer numFila;
	private Integer cine;
	
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
	public Integer getCine() {
		return cine;
	}
	public void setCine(Integer cine) {
		this.cine = cine;
	}
	
}
