package com.fsantos.userdepartment.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fsantos.userdepartment.entidades.Usuario;

public interface RepositorioUsuario extends JpaRepository<Usuario, Long>{
	
	

}
