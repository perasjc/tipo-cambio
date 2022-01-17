package com.pe.bcp.tech.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.pe.bcp.tech.model.Usuario;

public interface IUsuarioRepo extends JpaRepository<Usuario, Integer>{

	Usuario findOneByUsername(String username);
}
