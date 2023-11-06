package com.example.demo.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.example.demo.dto.Empleado;
import com.example.demo.dto.Empleado.Trabajo;

public interface IEmpleadoDAO extends JpaRepository<Empleado,Integer> {

	List<Empleado> findByTrabajo(Trabajo trabajo);

	
}
