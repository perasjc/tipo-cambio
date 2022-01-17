package com.pe.bcp.tech.model;

public class MonedaRequestDto {
	
	private Float montoDTO;
	private String monedaOrigenDTO;
	private String monedadDestinoDTO;
	
	public Float getMontoDTO() {
		return montoDTO;
	}
	public void setMontoDTO(Float montoDTO) {
		this.montoDTO = montoDTO;
	}
	public String getMonedaOrigenDTO() {
		return monedaOrigenDTO;
	}
	public void setMonedaOrigenDTO(String monedaOrigenDTO) {
		this.monedaOrigenDTO = monedaOrigenDTO;
	}
	public String getMonedadDestinoDTO() {
		return monedadDestinoDTO;
	}
	public void setMonedadDestinoDTO(String monedadDestinoDTO) {
		this.monedadDestinoDTO = monedadDestinoDTO;
	}
	
}
