package com.cine.web.core.dto.response;


public class SalaResponse {

	private Integer idSala;
	private Integer numSala;
	private Integer numColumna;
	private Integer numFila;
	private String cine;
	
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
	public String getCine() {
		return cine;
	}
	public void setCine(String cine) {
		this.cine = cine;
	}
	
}
