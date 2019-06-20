package com.cine.web.core.dto.response;

import java.util.Date;
import java.util.List;

public class CineResponse {

	private Integer idCine;
	private String nombreCine;
	private String departamento;
	private String provincia;
	private String distrito;
	private Date fechInicio;
	private String tipoCine;
	
	private List<SalaResponse> lstSalaResponse;
	
	public Integer getIdCine() {
		return idCine;
	}
	public void setIdCine(Integer idCine) {
		this.idCine = idCine;
	}
	
	public String getDepartamento() {
		return departamento;
	}
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
	public String getProvincia() {
		return provincia;
	}
	public void setProvincia(String provincia) {
		this.provincia = provincia;
	}
	public String getDistrito() {
		return distrito;
	}
	public void setDistrito(String distrito) {
		this.distrito = distrito;
	}
	public Date getFechInicio() {
		return fechInicio;
	}
	public void setFechInicio(Date fechInicio) {
		this.fechInicio = fechInicio;
	}
	public String getTipoCine() {
		return tipoCine;
	}
	public void setTipoCine(String tipoCine) {
		this.tipoCine = tipoCine;
	}
	public String getNombreCine() {
		return nombreCine;
	}
	public void setNombreCine(String nombreCine) {
		this.nombreCine = nombreCine;
	}
	public List<SalaResponse> getLstSalaResponse() {
		return lstSalaResponse;
	}
	public void setLstSalaResponse(List<SalaResponse> lstSalaResponse) {
		this.lstSalaResponse = lstSalaResponse;
	}
	
}
