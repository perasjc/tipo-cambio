package com.pe.bcp.tech.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pe.bcp.tech.domain.TipoCambio;


@Repository
public interface MonedaRepository extends JpaRepository<TipoCambio, Integer>{
	
	List<TipoCambio> findByMonedaOrigen(String monedaOrigen);
	List<TipoCambio> findByMonedaDestino(String monedaDestino);
	
	Optional<TipoCambio> findByMonedaOrigenAndMonedaDestino(String monedaOrigen, String monedaDestino);

}
