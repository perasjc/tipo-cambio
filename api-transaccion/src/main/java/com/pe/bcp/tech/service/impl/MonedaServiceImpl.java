package com.pe.bcp.tech.service.impl;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pe.bcp.tech.domain.TipoCambio;
import com.pe.bcp.tech.exception.ModelNotFoundException;
import com.pe.bcp.tech.model.MonedaRequestDto;
import com.pe.bcp.tech.model.MonedaResponseDto;
import com.pe.bcp.tech.repository.MonedaRepository;
import com.pe.bcp.tech.service.MonedaService;

import io.reactivex.Single;

@Service
public class MonedaServiceImpl implements MonedaService {

	@Autowired
	private MonedaRepository monedaRepository;

	@Override
	public Single<MonedaResponseDto> aplicarTipoDeCambio(MonedaRequestDto dto) {
		return Single.create(source -> source.onSuccess(calcularTipoDeCambio(dto)));
	}
	
	@Override
	public Single<TipoCambio> update(TipoCambio entity) {

		return Single.create(subscribe -> {
			subscribe.onSuccess(actualizar(entity));
		});
	}
	
	private MonedaResponseDto calcularTipoDeCambio(MonedaRequestDto dto) {
		Float tipoCambio = obtenerTipoDeCambio(dto.getMonedaOrigenDTO(), dto.getMonedadDestinoDTO());
		if (tipoCambio != null) {
			MonedaResponseDto result = new MonedaResponseDto();
			result.setMonedadDestinoDTO(dto.getMonedadDestinoDTO());
			result.setMonedaOrigenDTO(dto.getMonedaOrigenDTO());
			result.setMontoCalculadoDTO(dto.getMontoDTO() * tipoCambio);
			result.setMontoDTO(dto.getMontoDTO());
			result.setTipoCambioDTO(tipoCambio);
			return result;
		}
		return null;
	}
	
	private Float obtenerTipoDeCambio(String monedaOrigen, String monedaDestino) {

		Optional<TipoCambio> entity = this.monedaRepository.findByMonedaOrigenAndMonedaDestino(monedaOrigen, monedaDestino);

		if (!entity.isPresent()) {
			throw new ModelNotFoundException("No existe tipo cambio: moneda origen [".concat(monedaOrigen)
					.concat("] y moneda destino [").concat(monedaDestino).concat("]"));
		}
		
		return entity.get().getTipoCambio();
	}
	
	private TipoCambio actualizar(TipoCambio entity) {
		Optional<TipoCambio> result = this.monedaRepository.findByMonedaOrigenAndMonedaDestino(entity.getMonedaOrigen(),
				entity.getMonedaDestino());
		if (!result.isPresent()) {
			throw new ModelNotFoundException("No existe tipo cambio");
		}
		TipoCambio entityTipoCambio = result.get();
		entityTipoCambio.setTipoCambio(entity.getTipoCambio());
		return this.monedaRepository.save(entityTipoCambio);

	}

}
