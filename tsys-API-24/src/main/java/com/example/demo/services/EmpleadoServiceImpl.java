package com.example.demo.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.Empleado;
import com.example.demo.dto.Empleado.Trabajo;
import com.example.demo.dao.IEmpleadoDAO;


@Service
public class EmpleadoServiceImpl implements IEmpleadoService {
	
	@Autowired
	IEmpleadoDAO iEmpleadoDAO;

	//Listar todos
		public List<Empleado> listarEmpleados(){
			return iEmpleadoDAO.findAll();
		};
		
		
		//Listar por id
		public Empleado empleadoXID(Integer id) {
			return iEmpleadoDAO.findById(id).get();
		}; 
		
		//Guardar
		public Empleado guardarEmpleado(Empleado Empleado) {
			return iEmpleadoDAO.save(Empleado);
		};
		
		//Actualizar
		public Empleado actualizarEmpleado(Empleado Empleado) {
			return iEmpleadoDAO.save(Empleado);
		};
		
		//Eliminar
		public void eliminarEmpleado(Integer id) {
			iEmpleadoDAO.deleteById(id);
		}
		 

		public List<Empleado> listarPorTrabajo(Trabajo trabajo) {
			// TODO Auto-generated method stub
			return iEmpleadoDAO.findByTrabajo(trabajo);
		}


}
