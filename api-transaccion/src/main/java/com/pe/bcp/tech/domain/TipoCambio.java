package com.pe.bcp.tech.domain;

import javax.persistence.*;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "TIPO_CAMBIO")
public class TipoCambio {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@JsonIgnore
	private Integer id;
	
	private String monedaOrigen;
	
	private String monedaDestino;
	
	private Float tipoCambio;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getMonedaOrigen() {
		return monedaOrigen;
	}

	public void setMonedaOrigen(String monedaOrigen) {
		this.monedaOrigen = monedaOrigen;
	}

	public String getMonedaDestino() {
		return monedaDestino;
	}

	public void setMonedaDestino(String monedaDestino) {
		this.monedaDestino = monedaDestino;
	}

	public Float getTipoCambio() {
		return tipoCambio;
	}

	public void setTipoCambio(Float tipoCambio) {
		this.tipoCambio = tipoCambio;
	}

}
