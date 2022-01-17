package com.pe.bcp.tech.service;

import com.pe.bcp.tech.domain.TipoCambio;
import com.pe.bcp.tech.model.MonedaRequestDto;
import com.pe.bcp.tech.model.MonedaResponseDto;

import io.reactivex.Single;

public interface MonedaService {
	
	Single<MonedaResponseDto> aplicarTipoDeCambio(MonedaRequestDto dto); 

	Single<TipoCambio> update(TipoCambio entity);
	

}
