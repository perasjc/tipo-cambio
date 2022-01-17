package com.pe.bcp.tech.model;

public class MonedaResponseDto extends MonedaRequestDto{
	
	private Float montoCalculadoDTO;
	private Float tipoCambioDTO;
	
	
	public Float getMontoCalculadoDTO() {
		return montoCalculadoDTO;
	}
	public void setMontoCalculadoDTO(Float montoCalculadoDTO) {
		this.montoCalculadoDTO = montoCalculadoDTO;
	}
	public Float getTipoCambioDTO() {
		return tipoCambioDTO;
	}
	public void setTipoCambioDTO(Float tipoCambioDTO) {
		this.tipoCambioDTO = tipoCambioDTO;
	}
	
	
	
	

}
