package com.pe.bcp.tech.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pe.bcp.tech.domain.TipoCambio;
import com.pe.bcp.tech.model.MonedaRequestDto;
import com.pe.bcp.tech.model.MonedaResponseDto;
import com.pe.bcp.tech.service.MonedaService;

import io.reactivex.Single;
import io.reactivex.schedulers.Schedulers;
import io.swagger.annotations.Api;

@RestController
@RequestMapping("v1/moneda")
@Api(tags = { "Cambio de moneda" })
public class MonedaController {

	@Autowired
	private MonedaService monedaService;

	@PostMapping("aplicar_tipo_cambio")
	public Single<ResponseEntity<MonedaResponseDto>> aplicarTipoDeCambio(
			@RequestBody MonedaRequestDto dto) {
		return this.monedaService.aplicarTipoDeCambio(dto).subscribeOn(Schedulers.io())
				.map(ResponseEntity::ok);

	}

	@PutMapping("actualizar_tipo_cambio")
	public Single<ResponseEntity<TipoCambio>> actualizarTipoCambio(@RequestBody TipoCambio entity) {
		return this.monedaService.update(entity).subscribeOn(Schedulers.io()).map(mapper -> ResponseEntity.ok(mapper));
	}
	
}
