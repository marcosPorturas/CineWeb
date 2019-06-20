package com.cine.web.core.dto.request;

import java.util.Date;

public class CineRequest {


	private Integer idCine;
	private String nombreCine;
	private String departamento;
	private String provincia;
	private String distrito;
	private Date fechInicio;
	private Integer tipoCine;
	
	public Integer getIdCine() {
		return idCine;
	}
	public void setIdCine(Integer idCine) {
		this.idCine = idCine;
	}
	public String getNombreCine() {
		return nombreCine;
	}
	public void setNombreCine(String nombreCine) {
		this.nombreCine = nombreCine;
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
	public Integer getTipoCine() {
		return tipoCine;
	}
	public void setTipoCine(Integer tipoCine) {
		this.tipoCine = tipoCine;
	}
	
	
}
