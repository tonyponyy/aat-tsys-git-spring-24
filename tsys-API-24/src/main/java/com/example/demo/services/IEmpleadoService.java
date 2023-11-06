package com.example.demo.services;
import java.util.List;
import com.example.demo.dto.Empleado;

public interface IEmpleadoService {
	
	//Listar todos
	public List<Empleado> listarEmpleados();
	
	//Listar por id
	public Empleado empleadoXID(Integer id); 
	
	//Guardar
	public Empleado guardarEmpleado(Empleado Empleado);
	
	//Actualizar
	public Empleado actualizarEmpleado(Empleado Empleado);
	
	//Eliminar
	public void eliminarEmpleado(Integer id);

	
}
