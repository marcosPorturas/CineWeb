package com.cine.web.core.entity;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;


@Entity
public class Cine {
	
	@Id
	private Integer idCine;
	
	private String nombre;
	private String departamento;
	private String provincia;
	private String distrito;
	
	@Temporal(TemporalType.DATE)
	private Date fechIni;
	
	@ManyToOne
	@JoinColumn(name = "tipoCine")
	private TipoCine tipoCine;

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

	public TipoCine getTipoCine() {
		return tipoCine;
	}

	public void setTipoCine(TipoCine tipoCine) {
		this.tipoCine = tipoCine;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public Date getFechIni() {
		return fechIni;
	}

	public void setFechIni(Date fechIni) {
		this.fechIni = fechIni;
	}




}
