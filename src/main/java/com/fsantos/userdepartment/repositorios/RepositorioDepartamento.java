package com.fsantos.userdepartment.repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.fsantos.userdepartment.entidades.Departamento;

public interface RepositorioDepartamento extends JpaRepository<Departamento, String> {

}
